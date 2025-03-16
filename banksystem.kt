import java.io.File

data class Customer(val id: Int, val name: String)
data class Account(val accountNumber: Int, var balance: Double, val customerId: Int)

class Bank {
    private val customers = mutableListOf<Customer>()
    private val accounts = mutableListOf<Account>()
    private val dataFile = File("bank_data.txt")

    init {
        loadData()
    }

    private fun loadData() {
        if (dataFile.exists()) {
            val lines = dataFile.readLines()
            for (line in lines) {
                val parts = line.split(",")
                if (parts[0] == "CUSTOMER") {
                    customers.add(Customer(parts[1].toInt(), parts[2]))
                } else if (parts[0] == "ACCOUNT") {
                    accounts.add(Account(parts[1].toInt(), parts[2].toDouble(), parts[3].toInt()))
                }
            }
        }
    }

    private fun saveData() {
        dataFile.writeText("")
        for (customer in customers) {
            dataFile.appendText("CUSTOMER,${customer.id},${customer.name}\n")
        }
        for (account in accounts) {
            dataFile.appendText("ACCOUNT,${account.accountNumber},${account.balance},${account.customerId}\n")
        }
    }

    fun addCustomer(name: String) {
        val id = (customers.maxByOrNull { it.id }?.id ?: 0) + 1
        customers.add(Customer(id, name))
        println("Customer Added: ID $id, Name: $name")
        saveData()
    }

    fun openAccount(customerId: Int) {
        if (customers.none { it.id == customerId }) {
            println("Customer not found!")
            return
        }
        val accountNumber = (accounts.maxByOrNull { it.accountNumber }?.accountNumber ?: 1000) + 1
        accounts.add(Account(accountNumber, 0.0, customerId))
        println("Account Opened: No. $accountNumber for Customer ID: $customerId")
        saveData()
    }

    fun deposit(accountNumber: Int, amount: Double) {
        val account = accounts.find { it.accountNumber == accountNumber }
        if (account != null) {
            account.balance += amount
            println("Deposited ₹$amount. New Balance: ₹${account.balance}")
            saveData()
        } else {
            println("Account not found!")
        }
    }

    fun withdraw(accountNumber: Int, amount: Double) {
        val account = accounts.find { it.accountNumber == accountNumber }
        if (account != null) {
            if (account.balance >= amount) {
                account.balance -= amount
                println("Withdrawn ₹$amount. New Balance: ₹${account.balance}")
                saveData()
            } else {
                println("Insufficient Balance!")
            }
        } else {
            println("Account not found!")
        }
    }

    fun checkBalance(accountNumber: Int) {
        val account = accounts.find { it.accountNumber == accountNumber }
        if (account != null) {
            println("Account Balance: ₹${account.balance}")
        } else {
            println("Account not found!")
        }
    }
}

fun main() {
    val bank = Bank()
    while (true) {
        println("\n=== Bank Management System ===")
        println("1. Add Customer")
        println("2. Open Account")
        println("3. Deposit Money")
        println("4. Withdraw Money")
        println("5. Check Balance")
        println("6. Exit")
        print("Choose an option: ")

        when (readLine()?.toIntOrNull()) {
            1 -> {
                print("Enter Customer Name: ")
                val name = readLine() ?: ""
                bank.addCustomer(name)
            }
            2 -> {
                print("Enter Customer ID: ")
                val id = readLine()?.toIntOrNull()
                if (id != null) bank.openAccount(id)
                else println("Invalid Input!")
            }
            3 -> {
                print("Enter Account Number: ")
                val accNum = readLine()?.toIntOrNull()
                print("Enter Deposit Amount: ")
                val amount = readLine()?.toDoubleOrNull()
                if (accNum != null && amount != null) bank.deposit(accNum, amount)
                else println("Invalid Input!")
            }
            4 -> {
                print("Enter Account Number: ")
                val accNum = readLine()?.toIntOrNull()
                print("Enter Withdrawal Amount: ")
                val amount = readLine()?.toDoubleOrNull()
                if (accNum != null && amount != null) bank.withdraw(accNum, amount)
                else println("Invalid Input!")
            }
            5 -> {
                print("Enter Account Number: ")
                val accNum = readLine()?.toIntOrNull()
                if (accNum != null) bank.checkBalance(accNum)
                else println("Invalid Input!")
            }
            6 -> return
            else -> println("Invalid Choice!")
        }
    }
}

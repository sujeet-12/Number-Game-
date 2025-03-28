class BankAccount:
    def __init__(self, name, surname, account_number, pin_code, balance, last_transaction):
        self.name = name
        self.surname = surname
        self.account_number = account_number
        self.pin_code = pin_code
        self.balance = balance
        self.last_transaction = last_transaction

    def verify_pin(self, pin):
        return pin == self.pin_code

    def check_balance(self, pin):
        if self.verify_pin(pin):
            print(f"Account Holder: {self.name} {self.surname}")
            print(f"Account Number: {self.account_number}")
            print(f"Balance: Rs. {self.balance}")
            print(f"Last Transaction: {self.last_transaction}")
        else:
            print("Incorrect PIN!")

    def deposit_money(self, pin, amount):
        if self.verify_pin(pin):
            self.balance += amount
            self.last_transaction = f"Deposited Rs. {amount}"
            print(f"Amount Deposited Successfully! New Balance: Rs. {self.balance}")
        else:
            print("Incorrect PIN!")

    def withdraw_money(self, pin, amount):
        if self.verify_pin(pin):
            if amount > self.balance:
                print("Insufficient Balance!")
            else:
                self.balance -= amount
                self.last_transaction = f"Withdrawn Rs. {amount}"
                print(f"Amount Withdrawn Successfully! New Balance: Rs. {self.balance}")
        else:
            print("Incorrect PIN!")


def main():
    accounts = [
        BankAccount("Raj", "Sharma", "1001", "1234", 50000.0, "Deposited Rs. 10000"),
        BankAccount("Amit", "Verma", "1002", "5678", 75000.0, "Withdrawn Rs. 5000"),
        BankAccount("Priya", "Gupta", "1003", "4321", 90000.0, "Deposited Rs. 20000")
    ]

    while True:
        print("\nWelcome to the Bank Account Manager")
        print("1. Check Balance")
        print("2. Deposit Money")
        print("3. Withdraw Money")
        print("4. Exit")
        choice = input("Choose an option: ")

        if choice == "1":
            acc_num = input("Enter Account Number: ")
            pin = input("Enter PIN: ")
            account = next((acc for acc in accounts if acc.account_number == acc_num), None)
            if account:
                account.check_balance(pin)
            else:
                print("Account not found!")
        elif choice == "2":
            acc_num = input("Enter Account Number: ")
            pin = input("Enter PIN: ")
            amount = float(input("Enter Amount to Deposit: "))
            account = next((acc for acc in accounts if acc.account_number == acc_num), None)
            if account:
                account.deposit_money(pin, amount)
            else:
                print("Account not found!")
        elif choice == "3":
            acc_num = input("Enter Account Number: ")
            pin = input("Enter PIN: ")
            amount = float(input("Enter Amount to Withdraw: "))
            account = next((acc for acc in accounts if acc.account_number == acc_num), None)
            if account:
                account.withdraw_money(pin, amount)
            else:
                print("Account not found!")
        elif choice == "4":
            print("Exiting the Bank Account Manager. Goodbye!")
            break
        else:
            print("Invalid Option! Please choose a valid option.")

if __name__ == "__main__":
    main()

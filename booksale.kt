import java.util.Scanner

// Book data class to store book details data class Book(val id: Int, val title: String, val author: String, var price: Double, var stock: Int)

// Bookstore class to manage inventory and transactions class Bookstore { private val books = mutableListOf( Book(1, "The Kotlin Handbook", "John Doe", 499.99, 10), Book(2, "Android Development", "Jane Smith", 699.99, 5), Book(3, "Data Structures & Algorithms", "Alice Brown", 599.99, 8) )

fun displayBooks() {
    println("\nAvailable Books:")
    books.forEach { println("${it.id}. ${it.title} by ${it.author} - Rs. ${it.price} (Stock: ${it.stock})") }
}

fun searchBook(title: String) {
    val foundBooks = books.filter { it.title.contains(title, ignoreCase = true) }
    if (foundBooks.isNotEmpty()) {
        println("\nSearch Results:")
        foundBooks.forEach { println("${it.id}. ${it.title} by ${it.author} - Rs. ${it.price} (Stock: ${it.stock})") }
    } else {
        println("\nNo books found with title: $title")
    }
}

fun purchaseBook(id: Int, quantity: Int) {
    val book = books.find { it.id == id }
    if (book != null && book.stock >= quantity) {
        book.stock -= quantity
        println("\nSuccessfully purchased $quantity copies of '${book.title}' for Rs. ${book.price * quantity}")
    } else {
        println("\nInsufficient stock or invalid book ID.")
    }
}

}

fun main() { val bookstore = Bookstore() val scanner = Scanner(System.in)

while (true) {
    println("\nBookstore Management System")
    println("1. View Books")
    println("2. Search Book")
    println("3. Purchase Book")
    println("4. Exit")
    print("Enter your choice: ")

    when (scanner.nextInt()) {
        1 -> bookstore.displayBooks()
        2 -> {
            print("Enter book title to search: ")
            scanner.nextLine()
            val title = scanner.nextLine()
            bookstore.searchBook(title)
        }
        3 -> {
            print("Enter book ID to purchase: ")
            val id = scanner.nextInt()
            print("Enter quantity: ")
            val quantity = scanner.nextInt()
            bookstore.purchaseBook(id, quantity)
        }
        4 -> {
            println("\nExiting Bookstore. Have a great day!")
            break
        }
        else -> println("\nInvalid choice, please try again.")
    }
}

}


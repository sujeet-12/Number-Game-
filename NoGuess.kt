import kotlin.random.Random
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("🎯 Welcome to the Number Guessing Game!")
    var playAgain: String

    do {
        val randomNumber = Random.nextInt(1, 100) // Generate random number between 1 and 100
        var attempts = 0
        var guess: Int?

        println("\nI've picked a number between 1 and 100. Try to guess it!")

        while (true) {
            print("🔢 Enter your guess: ")
            val input = scanner.next()

            // Validate input
            guess = input.toIntOrNull()
            if (guess == null || guess !in 1..100) {
                println("❌ Invalid input! Please enter a number between 1 and 100.")
                continue
            }

            attempts++

            // Give hints
            when {
                guess < randomNumber -> println("🔼 Too low! Try again.")
                guess > randomNumber -> println("🔽 Too high! Try again.")
                else -> {
                    println("🎉 Congratulations! You guessed the number in $attempts attempts.")
                    break
                }
            }
        }

        // Ask if the player wants to play again
        print("\n🔁 Do you want to play again? (yes/no): ")
        playAgain = scanner.next().lowercase()

    } while (playAgain == "yes")

    println("\n👋 Thanks for playing! See you next time. 🎮")
    scanner.close()
}

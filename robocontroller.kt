import java.util.*
import java.io.File
import kotlin.random.Random

class RobotController {

    private val responses = mapOf(
        "hello" to listOf("Hello! How can I assist you?", "Hi there! What do you need?"),
        "what is your name" to listOf("I am Robo Assistant.", "Call me Robo AI."),
        "how are you" to listOf("I am a robot, always functioning!", "I am good! What about you?"),
        "what can you do" to listOf("I can answer predefined questions.", "I can assist you with basic queries."),
        "goodbye" to listOf("Goodbye! Have a great day!", "See you later!"),
        "who created you" to listOf("I was created by a Kotlin programmer.", "A developer built me using Kotlin!"),
        "tell me a joke" to listOf(
            "Why do Java developers wear glasses? Because they don’t C#!",
            "What did the programmer say when he crashed his car? Stack overflow!"
        ),
        "exit" to listOf("Shutting down... Goodbye!", "Powering off... See you!")
    )

    private fun getResponse(input: String): String {
        val normalizedInput = input.lowercase().trim()
        for ((key, value) in responses) {
            if (normalizedInput.contains(key)) {
                return value.random()
            }
        }
        return "I don't understand that question."
    }

    private fun logQuery(query: String) {
        val logFile = File("query_log.txt")
        logFile.appendText("$query\n")
    }

    private fun speak(text: String) {
        println("🤖 Robo (Speaking): $text") // Simulating voice output
    }

    fun start() {
        val scanner = Scanner(System.`in`)
        println("🤖 Robo Assistant: Ask me a question! (Type 'exit' to stop)")

        while (true) {
            print("\nYou: ")
            val userInput = scanner.nextLine()

            if (userInput.equals("exit", ignoreCase = true)) {
                val exitResponse = responses["exit"]?.random() ?: "Goodbye!"
                speak(exitResponse)
                break
            }

            logQuery(userInput)
            val response = getResponse(userInput)
            speak(response)
        }
    }
}

fun main() {
    val robot = RobotController()
    robot.start()
}

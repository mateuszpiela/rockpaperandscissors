package eu.mateuszpiela.rps.classes

import java.util.*
import kotlin.system.exitProcess

class UserInput {
    fun getUserChoiceFromKeyboard(): String {
        println("Please enter your choice (Rock,Paper,Scissors) ?:")
        var userInputString: String = readln().replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
        var validateChoice: Boolean = ValidateUserChoice().Validate(userInputString)

        var errorCounter = 0

        while(!validateChoice) {
            if(errorCounter >= 2 && errorCounter <= 4) {
                println("Please try again...")
            } else if (errorCounter > 4) {
                println("Really? are you trying all the secrets combinations?")
            }

            println("I don't know about this choice :D, did you play other version of RPS?")
            println("Please enter your choice (Rock,Paper,Scissors) ?:")

            userInputString = readln()
            validateChoice = ValidateUserChoice().Validate(userInputString)
            errorCounter++
        }

        println("Your choice is $userInputString")

        return userInputString
    }

    fun askUserAboutNewGame() {
        println("Restart? (Y/N):")
        val UserInputString = readln().uppercase()

        if(UserInputString == "Y" || UserInputString == "YES"){
            RpsRunner().startGame()
        }else{
            exitProcess(0)
        }
    }
}
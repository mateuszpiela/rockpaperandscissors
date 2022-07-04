package eu.mateuszpiela.rps.classes

class RpsRunner {
    val selectRpsArray: Array<String> = arrayOf("Rock", "Paper", "Scissors")

    fun startGame () {
        val computerSelected = selectRpsArray[kotlin.random.Random.nextInt(selectRpsArray.size)]
        val userSelected: String = UserInput().getUserChoiceFromKeyboard()

        println(checkWhoWillWin(computerSelected,userSelected))
        UserInput().askUserAboutNewGame()
    }

    fun checkWhoWillWin(cpuChoice: String, userChoice: String): String {
        var returnVar = "Choice not programmed yet!"

        if(cpuChoice == userChoice){
            returnVar = "Tie!"
        }

        when(userChoice) {
            "Rock" -> {
                if(cpuChoice == "Paper")
                {
                    returnVar = "Computer wins!"
                }
                else
                {
                    returnVar = "User wins!"
                }
            }
            "Scissors" -> {
                if(cpuChoice == "Rock")
                {
                    returnVar = "Computer wins!"
                }
                else
                {
                    returnVar = "User wins!"
                }
            }
            "Paper" -> {
                if(cpuChoice == "Scissors")
                {
                    returnVar = "Computer wins!"
                }
                else
                {
                    returnVar = "User wins!"
                }
            }
        }


        return returnVar
    }
}
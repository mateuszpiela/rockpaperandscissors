package eu.mateuszpiela.rps.classes

class ValidateUserChoice {
    fun Validate(choice: String): Boolean {
        var returnState = false

        if(RpsRunner().selectRpsArray.contains(choice)){
            returnState = true
        }

        return returnState
    }
}
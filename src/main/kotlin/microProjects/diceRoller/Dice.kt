package microProjects.diceRoller

class Dice (private val sides: Int) {

    fun rollDie(): Int {
        return (1..sides).random()
    }

}
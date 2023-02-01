package microProjects

import java.util.Scanner

// Variable initialization

fun main(args: Array<String>) {

    val input = Scanner(System.`in`)

    // Presenting the program
    println("Be very welcome to the BMI calculator!\n" +
            "Please, insert the data when asked.")

    // Input data
    println("Insert your height in meters:")
    var height = input.nextDouble()
    println("Insert your weight in kilograms:")
    var weight = input.nextDouble()

    // Output data
    println("Your height is $height cm and your weight is $weight kg.")

    // BMI calculation
    var bmi = weight/(height*height)

    val initialText = "Your BMI index is $bmi and you are"

    // Flow - Here I will say what stage they are in the BMI scale
    if (bmi < 18.5) {
        println("$initialText underweight")
    } else if (bmi < 25) {
        println("$initialText normal weight")
    } else if (bmi < 30) {
        println("$initialText overweight")
    } else if (bmi < 35) {
        println("$initialText obese")
    } else {
        println("$initialText extremely obese")
    }
}
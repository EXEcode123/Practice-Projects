// Self-Grading Quiz

/* Working at a school that has recently switched to e-learning tactics,
you have been assigned the task of creating a self-grading quiz program for the math class. */


fun main() {
    val quizAnswer1 = 15
    var quizAnswer2 = 3
    val quizAnswer3 = "isosceles"
    val quizAnswer4 = 47

    // Questions
    println("What is 75 / 5?: ")
    var studentAnswer1 = Integer.valueOf(readLine())

    println("What is the value of y: 6 * 2y = 36")
    val studentAnswer2 = Integer.valueOf(readLine())

    println("What is the name of a triangle that has two equal sides: ")
    val studentAnswer3 = readLine()

    println("What is the value of 8 * 6 - (3 - 2): ")
    val studentAnswer4 = Integer.valueOf(readLine())


    var points = 0

    // Question 1
    if(studentAnswer1 == quizAnswer1) {
        points += 25
    }

    // Question 2
    if (studentAnswer2 == quizAnswer2) {
        points += 25
    } else if (studentAnswer2 == quizAnswer2++ || studentAnswer2 == quizAnswer2--) {
        points += 20
        println("The answer $studentAnswer2 is within 1 point of $quizAnswer2")
    } else {
        points += 1
    }

    // Question 3
    if (studentAnswer3 == quizAnswer3) {
        points += 25
    } else if (studentAnswer3 == "equilateral") {
        points += 10
    } else {
        points += 1
    }

    // Question 4
    if (studentAnswer4 == quizAnswer4) {
        points += 25
    } else if (studentAnswer4 in 44..54) {
        points += 20
    } else {
        points += 1
    }


    // Return Final Grade
    when (points) {
        in 0..59 -> println("You got a F")
        in 60..69 -> println("You got a D")
        in 70..79 -> println("You got a C")
        in 80..89 -> println("You got a B")
        in 90..99 -> println("You got a A")
        in 100..110 -> println("You got an amazing A+")
        else -> println("Not a valid value.")
    }
}
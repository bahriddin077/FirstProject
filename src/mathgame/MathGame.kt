package mathgame

import EnamAbsitracInterface.Level
import java.util.Random
import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)

    var isGameOver = true
    while (isGameOver) {
        println("Welcome Math Game !!!")
        println("1 -> Start Game,  2 -> Game Over ")
        val n:Int = scanner.nextInt()
        when (n) {
            1 -> {
                println("Choose level:")
                println("1 -> Low, " +
                        "2 -> Medium, " +
                        "3 -> High")
                val levels = Level.values()
                var i = 0
                while (i < levels.size){
                        println(i + 1).toString() + "->" + levels[i]
                        i++
                    }
                val levelType: Int = scanner.nextInt() - 1
                val level = levels[levelType]
                when (level) {
                    Level.LOW -> startGame(10)
                    Level.MEDIUM -> startGame(100)
                    Level.HIGH -> startGame(1000)
                }
            }
            2 -> isGameOver = false
        }
    }

}

fun startGame(b:Int) {
    val scanner = Scanner(System.`in`)
    var isEnd = true
    while (isEnd){
        println("1 -> continue;  2 -> End")
        val n: Int = scanner.nextInt()
        when(n){
            1 -> {
                val random = Random()
                val number1: Int = random.nextInt(b)
                val number2: Int = random.nextInt(b)
                val c: Int = random.nextInt(4)
                var result = 0
                when (c) {
                    0 -> {
                        println("$number1+$number2=")
                        result = number1 + number2
                    }
                    1 -> {
                        println("$number1-$number2=")
                        result = number1 - number2
                    }
                    2 -> {
                        println("$number1*$number2=")
                        result = number1 * number2
                    }
                    3 -> {
                        println("$number1/$number2")
                            result = number1 / number2
                    }
                }
                val myResult: Int = scanner.nextInt()
                if (result == myResult){
                    println("To'gri !!")
                }else {
                    println("Noto'g'ri")
                }
            }
            2 -> isEnd = false
        }
    }
}














































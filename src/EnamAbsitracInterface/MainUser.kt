package EnamAbsitracInterface

import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)
    val userService = UserService()
    while (true) {
        println("1 -> Add user; 2->List users")
        when (scanner.nextInt()) {
            1 -> userService.addUser()
            2 -> userService.listUsers()
            3 -> userService.sortUsers()
        }

    }

}
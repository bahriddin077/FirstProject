package EnamAbsitracInterface

import java.util.Arrays
import java.util.Scanner

class UserService : Service, Register {

    private val scanner: Scanner = Scanner(System.`in`)
    private val users = arrayOfNulls<User>(100)
    private var count = 0
    override fun addUser() {
        print("Username:")
        val username: String = scanner.next()
        print("Passrowd:")
        val password: String = scanner.next()
        val user = User(username, password)
        users[count++] = user
    }

    override fun listUsers() {
        for (i in 0 until count) {
            println(users[i])
        }
    }

    override fun deleteUser() {

    }
    override fun editUser() {

    }
    override fun searchUser() {

    }
    override fun sortUsers() {
        Arrays.sort(users, 0, count)
    }

    override fun login() {

    }
    override fun register() {

    }

}
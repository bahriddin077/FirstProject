package package1

import java.util.Scanner

var scanner = Scanner(System.`in`)

fun main() {
    var contactImpl = Service()

    while (true) {
        println("1-add\n2->list\n3->delete\n4->sort")
        when (scanner.nextInt()) {
            1 -> contactImpl.addContact()
            2 -> contactImpl.listContact()
            3 -> contactImpl.deleteContact()
            4 -> contactImpl.sort()
        }
    }
}
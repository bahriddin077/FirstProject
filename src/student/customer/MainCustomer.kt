package student.customer

import java.util.*

var scanner = Scanner(System.`in`)
fun main() {
    var serviceImpl = ServiceImpl()
    
    while (true) {
        println("1: add customer\n2: show\n3: delete\n4: edit\n5: sort\n6: show list isHave Account number \nenter:")
        when (scanner.nextInt()) {
            1 -> serviceImpl.add()
            2 -> serviceImpl.show()
            3 -> serviceImpl.delete()
            4 -> serviceImpl.edit()
            5 -> serviceImpl.sort()
            6 -> serviceImpl.showListOfAccount()
        }
    }
}
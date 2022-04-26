package student

import java.util.Scanner

var scanner = Scanner(System.`in`)
fun main() {

    var service = Service()
    while (true){

        println("1->Add" +
                " 2->Delete" +
                " 3->Sort " +
                " 4->Edit " +
                " 5->List")

        var m = scanner.nextInt()
        when (m) {
            1 -> service.add()
            2 -> service.delete()
            3 -> service.sort()
            4 -> service.edit()
            5 -> service.list()
        }
    }


}
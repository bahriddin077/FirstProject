package student

import java.util.*
import kotlin.Comparator

class Service : StudentFace {

    var scanner = Scanner(System.`in`)
    private var userList = ArrayList<Student>()
    var n = 0

    override fun add() {
        var talaba = Student() // Add qilish 2- yo'li
        println("Student name: ")
        talaba.ism = scanner.next()
        println("Fakulteti")
        talaba.fak = scanner.next()
        println("Kursi")
        talaba.kurs = scanner.next()
        userList.add(talaba)

//        println("name: ") // Add qilishni 1-yo'li
//        var ism = scanner.next()
//        println("Fakulteti: ")
//        var fak = scanner.next()
//        println("kursi: ")
//        var kurs = scanner.next()
//        var student = Student(ism,fak,kurs)
//        userList.add(student)

    } // ishladi

    override fun delete() {
        list()
        println("Delete Student name")
        val name = readLine()
        userList.removeIf { s -> s.ism.equals(name) }
        println("Student haydaldi")
    } // ISHLADI

    override fun sort() {
//        Arrays.sort(userList, n, Comparator.comparing { at: Student -> at.ism })
        Collections.sort(userList, Comparator.comparing { Student::ism.name })

    }

    override fun edit() {
        list()
        var index = -1
        println("O'zgartiriladigon student ismi")
        var n = scanner.nextInt() -1

        if (userList[n].ism != null) {
            println("1->editIsm\n2->editFakultet\n3->editKurs")
        }else {
            println("1->editIsm\n2->editFakultet\n3->editKurs")
        when(scanner.nextInt()) {
            1 ->{
                println("Yangi Ism")
                userList[n].ism = scanner.next()
            }
            2 ->{
                println("Yangi Fakultet")
                userList[n].fak = scanner.next()
            }
            3 ->{
                println("Yangi Kurs")
                userList[n].kurs = scanner.next()
            }
        }
        }

        }

    override fun list() {
        for (i in 0..n){
            println(userList[i])
        }
    } // ishladi



}






































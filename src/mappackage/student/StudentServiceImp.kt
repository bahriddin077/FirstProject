package mappackage.student

import java.util.Scanner

var scanner = Scanner(System.`in`)
class StudentServiceImp : StudentService{
    var map = HashMap<String, ArrayList<Student>>()

    override fun addGroup() {
        println("Guruhingizni nomini kiriting")  // A22 101 Android -> List<Student>()
        val nameGroup = scanner.next()
        val studentList = ArrayList<Student>()
        map.put(nameGroup, studentList)
    } // ok

    override fun addStudent() {
        val keys: MutableSet<String> = map.keys
        for (s in keys) {
            println(s)
        }
        println("Guruhni nomini tanlang")
        var groupName = scanner.next()
        if (map.containsKey(groupName)) {
            println("Student FIO")
            var name = scanner.next()
            println("Student yoshi")
            var age = scanner.nextInt()
            println("Student kursi")
            var kurs = scanner.nextInt()
            println("Student fakulteti")
            var fakultet = scanner.next()

            var student = Student(name, age, kurs, fakultet)

            val studentList = map.get(groupName)
            studentList?.add(student)
            map.replace(groupName, studentList!!)
        } else {
            println("Bunday guruh topilmadi")
        }
    } // ok

    override fun removeGroup() {
        val set = map.keys
        for (s in set) {
            println(s)
        }
        println("Guruh nomini kiriting")
        var groupName = scanner.next()
        if (map.containsKey(groupName)) {
            map.remove(groupName)
        } else {
            println("Guruh topilmadi")
        }
    } // ok

    override fun removeStudentByGroup() {
        val set = map.keys
        for (s in set) {
            println(s)
        }
        println("Guruh nomini kiriting")
        var groupName = scanner.next()
        if (map.containsKey(groupName)) {
            val studentList: java.util.ArrayList<Student>? = map.get(groupName)
            for (i in 0 until studentList?.size!!) {
                println((i + 1).toString() + studentList[i])
            }
            println("Student tanlang")
            var name = scanner.nextInt() - 1
            studentList.removeAt(name)
            map.replace(groupName, studentList)
        } else {
            println("guruh topilmadi")
        }
    }

    override fun editGroup() {
        val set = map.keys
        for (s in set){
            println(s)
        }
        println("Guruhni kiriting")
        var nameGroup = scanner.next()
        if (map.containsKey(nameGroup)) {
            val students = map.get(nameGroup)
            map.remove(nameGroup)
            println("Yangi guruh nomini kiriting")
            var newNameGroup = scanner.next()
            map.put(newNameGroup, students!!)
        }else {
            println("Guruh topilmadi")
        }
    } // ok

    override fun editStudentByGroup() {
        val set = map.keys
        for (s in set){
            println(s)
        }
        println("Guruhni kiriting")
        var nameGroup = scanner.next()
        if (map.containsKey(nameGroup)) {
            val studentList = map.get(nameGroup)

            for (i in 0 until studentList?.size!!){
                println((i + 1).toString()+"." + studentList.get(i))
            }
            println("Student tanglang")
            var index = scanner.nextInt() -1

            println("Student FI0")
            var newName = scanner.next()
            println("student yoshi")
            var newAge = scanner.nextInt()
            println("student kursi")
            var newKurs = scanner.nextInt()
            println("student fakulteti")
            var newFakultet = scanner.next()

            map.get(nameGroup)?.get(index)?.fullName = newName
            map.get(nameGroup)?.get(index)?.age = newAge
            map.get(nameGroup)?.get(index)?.course = newKurs
            map.get(nameGroup)?.get(index)?.faculty = newFakultet
        }else{
            println("student topilmadi")
        }
    }

    override fun list() {
        val set = map.keys
        for (i in set){
            println("Guruh nomi $i")
            val studentList = map.get(i)
            if (studentList?.size == 0){
                println("Bu guruhda student mavjud emas")
            }else{
                for (i in 0 until studentList?.size!!){
                    println((i +1).toString() + studentList.get(i))
                }
            }
        }
    } // ok

}
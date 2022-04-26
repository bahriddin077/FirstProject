package mappackage.student

fun main() {

    var service = StudentServiceImp()

    while (true){
        println("1->addGroup\n2->addStudent\n3->removeGroup\n4->removeStudentByGroup\n5->editGroup\n6->editStudentByGroup\n7->list")
        when(scanner.nextInt()){
            1 -> service.addGroup()
            2 -> service.addStudent()
            3 -> service.removeGroup()
            4 -> service.removeStudentByGroup()
            5 -> service.editGroup()
            6 -> service.editStudentByGroup()
            7 -> service.list()
        }


    }

}
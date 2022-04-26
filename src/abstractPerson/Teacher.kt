package abstractPerson

class Teacher(name:String) : AbstractPerson(name) {

    override fun displayjob(description: String) {
        println(description)
    }

}
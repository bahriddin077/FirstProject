package abstractPerson

abstract class Person {

    var name: String? = null
    var age: Int? =null

    fun show() {
        println("Person")
    }

    abstract fun display()

}
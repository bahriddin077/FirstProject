package person

open class PerSon(val name: String, var age: Int) {
    // ota class = super class

    fun learn() {
        println("$name learning..")
    }

    fun walk() {
        println("$name walking..")
    }

    fun eat() {
        println("$name eating..")
    }

    open fun show() {
        println("$name $age")
    }
}

class Programmer(name: String, age: Int) : PerSon(name, age) {
    // bola class = obect 1

    var companyName: String = "Epam"
    fun coding() {
        println("I am a coder")
    }

    override fun show() {
        super.show()
        println("company name =  $companyName")
    }
}

class Dancer(name: String, age: Int) : PerSon(name, age) {
    // bola class = obect 2

    var groupName: String = "Sitora"
    fun dancing() {
        println("I am a dancer$groupName")
    }
}

class Singer(name: String, age: Int) : PerSon(name, age) {
    // bola class = obect 3

    var bandName: String = "Ummon"
    fun singing() {
        println("I can Singing..$bandName")
    }

    fun playGitar() {
        println("I can play Guitar")
    }
}

fun main() {

    val coder = Programmer("Bahriddin", 22)
    coder.show()
    coder.companyName
    coder.learn()
    coder.walk()
    coder.eat()
    coder.coding()
    println("")

    val dancer = Dancer("Malika", 18)
    dancer.show()
    dancer.groupName
    dancer.learn()
    dancer.walk()
    dancer.eat()
    dancer.dancing()
    println("")

    val singer = Singer("Shoxrux", 30)
    singer.show()
    singer.bandName
    singer.learn()
    singer.walk()
    singer.eat()
    singer.singing()
    singer.playGitar()


}














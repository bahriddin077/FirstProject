fun main() {

    val person = Person("Ali", 25)
    person.talk()
    person.walk()

    val mathPerson = MathTeacher("Umar", 30)
    mathPerson.talk()
    mathPerson.walk()
    mathPerson.teachMath()

    val player = Player("Usmon",22)
    player.playFootball()
    player.talk()

}

open class Person(val name: String, var age: Int) {

    fun talk() {
        println("$name talking...")
    }

    fun walk() {
        println("$name walking...")
    }
}

class MathTeacher(val _name: String, var _age: Int) : Person(_name, _age) {
    fun teachMath() {
        println("I can teach math")
    }

}
class Player(name: String, age: Int) : Person(name, age){
    fun playFootball(){
        println("I am a player and I can play football")
    }

}













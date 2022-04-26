package abstractPerson

fun main() {

    var developer = Developer()

    developer.display()
    developer.show()

    val jack = Teacher("Jack Smith")

    jack.displayjob("I'm a mathematics teacher.")
    jack.displaySSN(23132)

}
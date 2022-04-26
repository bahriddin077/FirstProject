package animals

import Animals

class Reptiles(
    name: String?, age: Int?, skill: String?, eat: String?,
    var tilUzun: String,
    var slow: String
) : Animals(name, age, skill, eat) {

    override fun show() {
        super.show()
        println(" $tilUzun " + " " + " $slow ")
    }
}
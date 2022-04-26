package animals

import Animals

class Amphibians(name: String?, age: Int?, skill: String?, eat: String,
                 var color: String,
                 var dum: String,) : Animals(name, age, skill, eat) {

    override fun show() {
        super.show()
        println("$color" + " " + "$dum")
    }

}
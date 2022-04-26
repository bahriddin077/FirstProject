package animals

import Animals


class Mammals(name: String?, age: Int?, skill: String?, eat: String,
              var swim: String,
              var jump: String,
) : Animals(name, age, skill, eat) {

    override fun show() {
        super.show()
        println("$swim" + " " +  "$jump")
    }
}

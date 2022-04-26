package animals

import Animals


class Birds(name: String?, age: Int?, skill: String?, eat: String,
            var fly: String,
            var run: String,

) : Animals(name, age, skill, eat) {

    override fun show() {
        super.show()
        println("$fly" + " " + "$run")
    }
}

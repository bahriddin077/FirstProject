package model

class OuterClass {

    var a = 10

    inner class InnerClass {
        var y = 20

        fun display(): Int {
            return a
        }
    }

    fun show() {
        val innerClass = InnerClass()
        System.out.println(innerClass.y)
    }

    fun getY(): Int {
        val innerClass = InnerClass()
        return innerClass.y
    }

}
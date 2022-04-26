package homework

class Car {

    var name: String? = null
    var price: Int? = null
    var color: String? = null
    var model: String? = null
    var fuel: Int? = null

    fun speed(v: Double) {
        println(fuel!! * v)
    }

    fun show() {
        println(name + " " + price + " " + color + " " + model + " " + fuel)
    }
}
package `package`

class Circle(var radius:Int, var color: String,) {

    fun getRadius() {
        println("")}
    fun getColor(){
        println("")
    }
    fun getArea(){
        println("")
    }

    override fun toString(): String {
        return "radius =$radius, \ncolor = $color, \nGetradius = ${getRadius()}, \ngetColor = ${getColor()}, \ngetArea = ${getArea()} \n"
    }
}
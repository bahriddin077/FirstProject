package homework

class CarMain {

    fun main() {

        var car = Car()

        car.name = "Gentra"
        car.model = "Chevrolet"
        car.color = "Black"
        car.price = 10000
        car.fuel = 1
        car.show()
        car.speed(10.0)

        var car1 = Car()

        car1.name = "Malibu"
        car1.model = "Chevrolet"
        car1.color = "White"
        car1.price = 30000
        car1.fuel = 5

        car1.show()
        car1.speed(10.0)

    }
}
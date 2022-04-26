package homework
fun main() {

    var cr7 = Player1()

    cr7.name = "Ronaldo"
    cr7.goalCount = 832
    cr7.number = "+998931678227"
    cr7.nationality = "Portugal"
    cr7.position = "ST"

    cr7.show()

    var leo = Player1()
    leo.name = "Messi"
    leo.goalCount = 783
    leo.number = "+998931678222"
    leo.nationality = "Argentina"
    leo.position = "ST"

    leo.show()
    println(leo.goalCount)



}

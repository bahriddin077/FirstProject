open class Animals {

    var name: String? = null
    var age: Int? = null
    var skill: String? = null
    var eat: String? = null

    fun run() {
        println("He can   run")
    }

    constructor(name: String?, age: Int?, skill: String?, eat: String?) {
        this.name = name
        this.age = age
        this.skill = skill
        this.eat = eat
    }

    constructor()

    open fun show() {
        println("$name $age $skill $eat")
    }
}












//package Animals
//
//import javax.security.auth.Subject
//import javax.sound.midi.Soundbank
//
//open class Animals(val name: String, var type: String) {
//    // ota class = super class
//    fun eat(){
//        println("eating...")
//    }
//    open fun show(){
//        println("$name $type ")
//    }
//}
//
//class HomeAnimals(name: String, type: String) : Animals(name, type){
//    // bola class = obect 1
//
//    fun eating() {
//        println("Ozuqasi Yashil o't")
//    }
//    fun Egasi(){
//        println("Odamlar qarmogida yashaydi")
//    }
//    fun sale(){
//        println("Odamlar oladi va sotadi")
//    }
//    fun Kopayish(){
//        println("Tugish orqali kopayadi")
//    }
//    override fun show() {
//        super.show()
//        println("${Egasi()}, ${sale()} ")
//    }
//}
//class WildAnimals(name: String, type: String):Animals(name, type){
//    // bola class = obect 2
//
//    fun free(){
//        println("Erkin yurolidi")
//    }
//    fun Yirtqich(){
//        println("Yirtqich")
//    }
//
//    override fun show() {
//        super.show()
//        println("${free()}, ${Yirtqich()}")
//    }
//}
//class Birds(name: String, type: String):Animals(name, type){
//    // bola class = obect 3
//
//    fun fly(){
//        println("Ucha oladi ")
//    }
//    fun builder(){
//        println("O'zi Uy qura oladi")
//    }
//
//    override fun show() {
//        super.show()
//        println("${fly()}, ${builder()}")
//    }
//}
//class Reptiles(name: String, type: String):Animals(name, type){
//    // bola class = obect 4
//
//    fun Til(){
//        println("Tili uzun bo'ladi")
//    }
//    fun Slow(){
//        println("Sekin harakat qiladi")
//    }
//    override fun show() {
//        super.show()
//        println("${Til()}, ${Slow()}")
//    }
//}
//
//fun homework.main() {
//
//    val uyHayvonlari = HomeAnimals("Qo'y","Sut emizuvchi")
//    uyHayvonlari.show()
//    uyHayvonlari.sale()
//    uyHayvonlari.eating()
//    uyHayvonlari.Kopayish()
//    println("")
//
//    val wildAnimals = WildAnimals("Yo'lbars", "Sut emizuvchi")
//    wildAnimals.show()
//    wildAnimals.Yirtqich()
//    wildAnimals.free()
//    println("")
//
//    val birds = Birds("Qaldirg'och","Tuxum qoyuvchi")
//    birds.show()
//    birds.fly()
//    birds.builder()
//    birds.eat()
//    println("")
//
//    val reptiles = Reptiles("Baqa","Tuxum qoyuvchi")
//    reptiles.show()
//    reptiles.eat()
//    reptiles.Til()
//    reptiles.Slow()
//}
//
//
//

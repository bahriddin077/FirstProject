package student

class Student {
    var ism: String? = null
    var fak: String? = null
    var kurs: String? = null
//    var fan : Fan

    constructor()

    constructor(ism: String?, fak: String?, kurs: String?) {
        this.ism = ism
        this.fak = fak
        this.kurs = kurs
    }

    override fun toString(): String {
        return "Student(ism=$ism, fak=$fak, kurs=$kurs)"
    }


}

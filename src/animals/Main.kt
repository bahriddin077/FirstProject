package animals

fun main() {
    val reptiles = Reptiles("Kaltakesak",12,"Tez yuradi","xashoratlar","Uzun tili","tez")
    val birds = Birds("Qaldirg'och",4,"havoda tez buruladi","xasharotlar","Ucha oladi","Yugurolmidi")
    val mammals = Mammals("Delfin",10,"Tez suzadi","ozuqasi Baliq","Tez suzadi","Balandga sakray oladi")
    val amphibians = Amphibians("Baqa",7,"Til otadi","Pasha yeydi","Rangi yashil","Dumi yo'q")

    reptiles.show()
    birds.show()
    mammals.show()
    amphibians.show()
}

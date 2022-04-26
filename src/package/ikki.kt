package `package`



fun main() {

    var contactList = arrayOfNulls<Contakt>(100)
    var count = 0

    while (true) {
        println(
            "1-> Kontakt qo`shish:\n" +
                    "2-> Barcha kontaktlar:\n" +
                    "3-> Contact o`chirish:\n" +
                    "4-> Contact o`zgartirish:\n" +
                    "5-> Contact qidirish:\n" +
                    "6-> Contact saralash:"
        )
        var n = scanner.nextInt()
        when (n) {
            1 -> {
                println("Nechta raqam kiritmoqchisiz ??")
                var a = scanner.nextInt()
                if (a == 1){
                    println("name")
                    var name = scanner.next()
                    println("number")
                    var number = scanner.next()
                    var contact = Contakt(name, number)
                    contactList[count] = contact
                    count++
                }else if (a == 2){
                    println("name")
                    var name = scanner.next()
                    println("number")
                    var number = scanner.next()
                    println("Number2")
                    var numb = scanner.next()
                    var contact = Contakt(name, number + " number2 = " + numb)
                    contactList[count] = contact
                    count++
                }else{
                    println("Xatolikk")
                }
            }
            2 -> {
                for (i in 0..count) {
                    println(contactList[i])
                }
            }
            3 -> {
                println("O`chirilayotgan Contact nomini kirting")
                var delname = scanner.next()
                var index = -1
                for (i in 0..count) {
                    if (contactList[i]?.getName().equals(delname)) {
                        index = i
                    }
                }
                if (index == -1) {
                    println("Contact topilmadi")
                } else {
                    for (i in 0..count) {
                        contactList[i] = contactList[i + 1]
                    }
                    count--
                    println("Contact o`chirildi")
                }
            }
            4 -> {
                println("O`zgaradigon Contact name")
                var delname = scanner.next()
                var index = -1
                for (i in 0..count) {
                    if (contactList[i]?.getName().equals(delname)) {
                        index = i
                    }
                }
                if (index == -1) {
                    println("Contact topilmadi")
                } else {
                    println("Yangi name")
                    var newName = scanner.next()
                    println("Yangi number")
                    var newnumber = scanner.next()
                    contactList[index]?.setName(newName)
                    contactList[index]?.setNumber(newnumber)
                    println("Contact o`zgardi")
                }
            }
        }
    }
 }







//1 -> {
//    println("name")
//    var name = scanner.next()
//    print("How many tel number do want enter: ")
//    val l: Int = scanner.nextInt()
//    val numbers = arrayOf(l)
//    for (i in 0 until l) {
//        print((i + 1))
//        numbers[i] = scanner.nextInt()
//    }
//}
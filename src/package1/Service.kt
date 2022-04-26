package package1

import homework.scanner

class Service : ContactInterFace {

    var list: MutableList<Contact> = ArrayList<Contact>()

    override fun addContact() {
        println("Ismini kirting")
        val name = scanner.next()
        println("number")
        val number = readLine()
        var contact = Contact(name, number)
        list.add(contact)
    }

    override fun listContact() {
        for (i in list)
            println(i)
    }

    override fun deleteContact() {
        println("Contact name")
        val name = readLine()
        list.removeIf { s -> s.name.equals(name) }
    }

    override fun sort() {
        list.sort()
    }
}
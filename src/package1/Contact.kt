package package1

class Contact(var name: String? = null, var number: String? = null) : Comparable<Contact> {
    override fun compareTo(other: Contact): Int {
        return name?.compareTo(other.name.toString())!!
    }

    override fun toString(): String {
        return "Contact(name=$name, number=$number)"
    }
}
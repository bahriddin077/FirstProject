package mappackage.model

class User(var name: String, var password: Int): Comparable<User> {
    override fun compareTo(other: User): Int {
        return this.name.compareTo(other.name)
    }

    override fun toString(): String {
        return "User(name='$name', password=$password)\n"
    }

}
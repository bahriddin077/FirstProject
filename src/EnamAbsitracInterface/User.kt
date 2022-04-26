package EnamAbsitracInterface

class User(private var username: String, private var password: String): Comparable<User?> {

    override fun toString(): String {
        return "User{" +
                "username='" + username + '\'' +
                ", password=' " + password + '\'' +
                '}'
    }

    override fun compareTo(other: User?): Int {
        return this.username.compareTo(other?.username!!)
    }
}
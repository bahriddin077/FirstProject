package `package`

class Author(var authorName:String, var authorBorn: String, var authorDied: String) {
    override fun toString(): String {
        return " '$authorName', \nAuthorborn ='$authorBorn', \nAuthordied = '$authorDied'\n"
    }
}
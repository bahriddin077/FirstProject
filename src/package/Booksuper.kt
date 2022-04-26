package `package`

open class Booksuper(
    var name: String? = null,
    var author: Author,
    var soni: Int,
    var price: Int,
) {
    override fun toString(): String {
        return "Book( \nname = '$name', \nAuthor = $author, \nSotilgan soni = $soni, \nKitob narxi = $price"
    }
}
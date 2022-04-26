package homework

class Price {

    var name: String? = null
    var shopName: String? = null
    var price: Double? = null

    constructor(name: String?, shopName: String?, price: Double?) {
        this.name = name
        this.shopName = shopName
        this.price = price
    }
    fun show() {
        println(name + " " +shopName + " " + price)
    }
}
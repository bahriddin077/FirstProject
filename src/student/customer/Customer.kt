package student.customer

class Customer {
    var name: String? = null
    var lastName: String? = null
    var cardNumber: String? = null
    var accountNumber: String? = null

    constructor()

    constructor(name: String?, lastName: String?, cardNumber: String?, accountNumber: String?) {
        this.name = name
        this.lastName = lastName
        this.cardNumber = cardNumber
        this.accountNumber = accountNumber
    }

    override fun toString(): String {
        return "Customer(name=$name, lastName=$lastName, cardNumber=$cardNumber, accountNumber=$accountNumber)"
    }

}
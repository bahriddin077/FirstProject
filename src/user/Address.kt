package user

class Address(var street: String, var suit: String, var city: String, var zipcode: Int, var geo: Geo) {
    override fun toString(): String {
        return "Address(street=$street, \nsuit=$suit, \ncity=$city, \nzipcode=$zipcode, \ngeo=$geo)\n"
    }
}
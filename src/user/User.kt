package user

open class User(
    var id: Int,
    var name: String,
    var userName: String,
    var email: String,
    var address: Address, // -> agregation
    var phone: String,
    var website: String,
    var company: Company // agrefation
    ){
    override fun toString(): String {
        return "User(\n id=$id, \nname=$name, \nUsername=$userName, \nEmail=$email, \nAddress=$address, \nPhone=$phone, \nWebsite=$website, \nCompany=$company)\n"
    }

}
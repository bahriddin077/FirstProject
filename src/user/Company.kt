package user

class Company(var name: String, var catchPhrase: String, var bs: String) {
    override fun toString(): String {
        return "Company(name=$name, \ncatchPhrase=$catchPhrase, \nbs=$bs) \n"
    }

}

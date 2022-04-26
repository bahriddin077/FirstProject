package user

fun main() {

    var user = User(
        1,
        "Bahriddin",
        "Baymuratov",
        "@gmail.ru",
        Address("Sharqiy", "1-tor", "Qorasuv", 123, Geo(24.0, 33.3)),
        "+998 94 049 88 78",
        "coder.com",
        Company("Epam","Server","dc")
    )
    println(user)

}
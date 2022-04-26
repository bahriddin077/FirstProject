package mappackage

fun main() {

    val set = HashSet<String>()

    set.add("Anvar")
    set.add("Mansur")
    set.add("Sherzod")
    set.add("Mahmud")

    println(set)
    set.remove("Mansur") // Mansur ismini ochirib yubordi
    println(set)
    set.add("Islom") // islomni listga qoshdi
    println(set)
    println("Mansur".toHashSet())
    // mansur ismini betartib harflab berdi  a,r,s,u,M,n


}
import todo.TodoServiceImpl
import java.util.Scanner

fun main() {

    var scanner = Scanner(System.`in`)
    var todoServiceImpl = TodoServiceImpl()
    while (true) {
        println(
            "1-> Todo qo`shish" +
                    "2-> todo o`chirish " +
                    "3-> todo tahrirlash" +
                    "4-> todoni saralsh " +
                    "5-> todoni izlash " +
                    "6-> todoni darajasiga qarab chiqar " +
                    "7-> todoni sanasiga qarab chiqar " +
                    "8-> todoni bajarish sanasiga qarab vchiqar" +
                    "9-> todolarni ko`rsat"
        )
        var n = scanner.nextInt()
        when (n) {
            1 -> todoServiceImpl.todoQoshish()
            2 -> todoServiceImpl.todoochirish()
            3 -> todoServiceImpl.todotahrirlash()
            4 -> todoServiceImpl.todosaralash()
            5 -> todoServiceImpl.todoIzlamoq()
            6 -> todoServiceImpl.todonidarajasigaqarabchiqar()
            7 -> todoServiceImpl.todonisanasigaqarabchiqar()
            8 -> todoServiceImpl.todonibajarishvaqtigaqarabchiqar()
            9 -> todoServiceImpl.todolarroyxati()
        }
    }
}
package todo

import java.util.Arrays
import java.util.Scanner

class TodoServiceImpl : TodoService {

    var scanner = Scanner(System.`in`)
    var todoList = arrayOfNulls<TodoClass>(100)
    var darajasi = Darajasi.values()
    var n = 0

    override fun todoQoshish() {
        println("nomini to`ldiring")
        var ati = scanner.next()
        println("haqida yozing")
        var haqida = scanner.next()
        println("sanasini yozing")
        var sanasi = scanner.next()
        println("bajarilish muddatini kiritng")
        var bajar = scanner.next()
        for (i in darajasi.indices) {
            println((i + 1).toString() + "->" + darajasi[i])
        }
        println("darajani tanlang: ")
        var m = scanner.nextInt() - 1
        var todo = TodoClass(ati, haqida, sanasi, bajar, darajasi[m])
        todoList[n] = todo
        n++
    }

    override fun todolarroyxati() {
        for (i in 0..n) {
            println(todoList[i])
        }
    }

    override fun todoochirish() {
        var index = -1
        println("o`chirilayotgan todo nomi")
        var consolati = scanner.next()

        for (i in 0..n) if (todoList[i]?.ati.equals(consolati, ignoreCase = true)) index = i //5
        if (index > -1) {
            for (i in index..n) {
                todoList[i] = todoList[i + 1]
            }
            n--
            println("Todo o`chirildi")
        } else println("not found")
//        for (i in 0..n) {
//            if (todoList[i]?.ati.equals(consolati)) {
//                index = i
//            }
//        }
//        if (index == -1) {
//            println("todo topilmadi")
//        } else {
//            for (i in 0..n) {
//                todoList[i] = todoList[i + 1]
//            }
//            n--
//            println("Todo o`chirildi")
//        }
    }

    override fun todosaralash() {
        Arrays.sort(todoList, 0, n, Comparator.comparing { at: TodoClass -> at.darajasi})
    }

    override fun todonisanasigaqarabchiqar() {
        Arrays.sort(todoList,0, n, Comparator.comparing { date: TodoClass -> date.sanasi })
        println("Saralandi")
    }

    override fun todonibajarishvaqtigaqarabchiqar() {
        Arrays.sort(todoList, 0, n, Comparator.comparing { date: TodoClass -> date.bajarlishmuddati })
        println("Saralandi")
    }

    override fun todotahrirlash() {
        var index = -1
        println("Tahrirlanadigan todo nomi")
        var consolati = scanner.next()


        for (i in 0..n) if (todoList[i]?.ati.equals(consolati, ignoreCase = true)) index = i //5
        if (index > -1) {
            for (i in index..n) {
                todoList[i] = todoList[i + 1]
            }
            n--
            println("Tahrirlash boshlanmoqda")
        } else println("not found")

        println("nomini to`ldiring")
        var ati = scanner.next()
        println("haqida yozing")
        var haqida = scanner.next()
        println("sanasini yozing")
        var sanasi = scanner.next()
        println("bajarilish muddatini kiritng")
        var bajar = scanner.next()
        for (i in darajasi.indices) {
            println((i + 1).toString() + "->" + darajasi[i])
        }
        println("darajani tanlang: ")
        var m = scanner.nextInt() - 1
        var todo = TodoClass(ati, haqida, sanasi, bajar, darajasi[m])
        todoList[n] = todo
        n++

    }

    override fun todoIzlamoq() {
        println("Qidirilayotgan todo")
        var searcname = scanner.next()
        for (i in 0..n) {
            if (todoList[i]?.ati.equals(searcname))
                println(todoList[i])

        }
    }

    override fun todonidarajasigaqarabchiqar() {
        Arrays.sort(todoList, 0, n, Comparator.comparing { degre: TodoClass -> degre.darajasi })
        println("Saralandi")
    }
}
package mappackage.dictionary

import mappackage.student.Student
import mappackage.student.scanner
import java.util.Collections

class DictionaryService: DictionaryFace {
    var map = HashMap<String, ArrayList<Dictionary>>()

    override fun addWord() {
        println("So'z kiriting")
        val word = scanner.next()
        val translate = ArrayList<Dictionary>()
        map.put(word,translate)
    } // complate

    override fun deleteWord() {
        val set = map.keys
        for (s in set){
            println(s)
        }
        println("So'z kiriting")
        val deleteWord = scanner.next()
        if (map.containsKey(deleteWord)){
            map.remove(deleteWord)
        }else {
            println("So'z topilmadi")
        }
    } // complate

    override fun editWordtranslate() {
        var set = map.keys
        for (s in set){
            println(s)
        }
        println("Qaysi so'zni tarjimasini o'zgartirmoqchisiz???")
        var soz = scanner.next()
        if (map.containsKey(soz)){
            val dictionaryList = map.get(soz)
            for (i in 0 until dictionaryList?.size!!){
                println((i + 1).toString() + "."+ dictionaryList.get(i))
            }
            println("ma'lumotni  tanlang")
            var index = scanner.nextInt() - 1

            println("So'zga ma'lumot kiriting")
            var newname = scanner.next()
            println("So'z tavsifini kiriting")
            var newage = scanner.next()


            map[soz]?.get(index)?.name = newname
            map[soz]?.get(index)?.name = newage
        }
    } // ??????

    override fun editWord() {
        val set = map.keys
        for (s in set){
            println(s)
        }
        println("Qaysi so'zni o'zgartirmoqchisiz??")
        var editSoz = scanner.next()
        if (map.containsKey(editSoz)){
            val words = map.get(editSoz)
            map.remove(editSoz)
            println("Yangi So'z Kiriting: ")
            var newWord = scanner.next()
            map.put(newWord, words!!)
        }

    } // complate

    override fun listWord() {
        var set = map.keys
        for (i in set){
            println("word ='$i'")
            val translate = map.get(i)
            if (translate?.size == 0){
                println("Bu so'zni bunday tarjimasi yo'q ")
            }else{
                for (i in 0 until translate?.size!!){
                    println(translate.get(i))
                }
            }
        }
    } // complate

    override fun containsWord() {

    } // ???

    override fun sort() {
        Collections.sort(map.toList(), Comparator.comparing { Dictionary::name.name })
    } // ?????

    override fun removeTranslateByWord() {
        val set = map.keys
        for (s in set){
            println(s)
        }
        println("So'z kiritng")
        var word = scanner.next()
        if (map.containsKey(word)){
            val dictionaryList: ArrayList<Dictionary>? = map.get(word)
            for (i in 0 until dictionaryList?.size!!){
                println((i + 1).toString() + dictionaryList[i])
            }
            println("tarjimasini tanlang")
            val soz = scanner.nextInt() -1
            dictionaryList.removeAt(soz)
            map.replace(word, dictionaryList)
        }else {
            println("so'z topilmadi")
        }
    } // ????

    override fun addTranslate() {
        val keys :MutableSet<String> = map.keys
        for (s in keys){
            println(s)
        }
        println("so'z tanlang")
        var soz = scanner.next()
        if (map.containsKey(soz)){
            println("tarjimasini kiriting")
            var name = scanner.next()
            val dictionary = Dictionary(name)
            val translate = map.get(soz)
            translate?.add(dictionary)
            map.replace(soz, translate!!)
        } else {
            println("Bunday so'z yo'q")
        }

    } // complate

    override fun searchByKey() {
        val set = map.keys
        for (s in set) println(s)

        println("Qaysi so'zni tarjimasi kerak")
        var word = scanner.next()
        if (map.containsKey(word)) {
            val studentList: java.util.ArrayList<Dictionary>? = map.get(word)
            for (i in 0 until studentList?.size!!) {
                println((i + 1).toString() + studentList[i])
            }
        } else {
            println("so'z topilmadi")
        }
    } // complate

    override fun searchByValues() {
        var set = map.values
        for (s in set) println(s)

        println("Uzbek -> English\n so'z kiriting:")
        var word = scanner.next()
        var data = java.util.ArrayList<Dictionary>()
        data.add(Dictionary(word))
        var kes = map.filterValues { it == data}.values
        println(kes)
//
    }
}

private fun <K, V> HashMap<K, V>.put(key: K, value: K) {

}

private fun <K, V> HashMap<K, V>.put(key: Set<K>, value: ArrayList<K>) {

}

private fun <K, V> MutableMap.MutableEntry<K, V>.setValue(newValue: K) {

}


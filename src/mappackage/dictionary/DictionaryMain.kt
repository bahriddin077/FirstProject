package mappackage.student

import mappackage.dictionary.DictionaryService

fun main() {

    val list = DictionaryService()

    while (true) {
        println("1->addWord\n2->addTranslate\n3->deleteWord\n4->editWordtranslate\n5->editWord\n6->listWord\n7->containsWord\n8->sort\n9->removeTranslateByWord\n10->searchByValues\n11->searchByKey\n")
        when (scanner.nextInt()) {
            1 -> list.addWord()
            2 -> list.addTranslate()
            3 -> list.deleteWord()
            4 -> list.editWordtranslate()
            5 -> list.editWord()
            6 -> list.listWord()
            7 -> list.containsWord()
            8 -> list.sort()
            9 -> list.removeTranslateByWord()
            10 -> list.searchByValues()
            11 -> list.searchByKey()
        }


    }

}
package abstractPerson

abstract class AbstractPerson (name:String){

    init {
        println("My name is $name.")
    }

    fun displaySSN(ssn:Int){
        println("My SSN is $ssn.")
    }

    abstract fun displayjob(description: String)

}
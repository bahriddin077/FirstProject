package student.customer

import `package`.scanner
import java.util.*
import kotlin.Comparator
import kotlin.collections.ArrayList


class ServiceImpl : Service {

    var customerList = ArrayList<Customer>()


    override fun add() {
        var customer = Customer()
        println("name ")
        customer.name = scanner.next()
        println("lastname")
        customer.lastName = scanner.next()
        println("card number")
        customer.cardNumber = scanner.next()
        println("do you want enter account number\n1->yes\n2->no\nenter")
        when (scanner.nextInt()) {
            1 -> {
                println("enter account number")
                customer.accountNumber = scanner.next()
            }
            2 ->{}
        }
        customerList.add(customer)
    }

    override fun show() {
        for (i in customerList) {
            println(i)
        }
    }

    override fun delete() {
        show()
        println("chose: ")
        var name = scanner.nextInt() - 1
        customerList.removeAt(name)
    }

    override fun edit() {
        show()
        println("choose: ")
        var n = scanner.nextInt() - 1
        if (customerList[n].name != null) {
            println("1->ediName\n2->editLastName\n3->editCardNumber\n4->edit AccountNumber\nenter")

        } else {
            println("1->ediName\n2->editLastName\n3->editCardNumber\n4->edit AccountNumber\nenter ")
            when (scanner.nextInt()) {
                1 -> {
                    println("enter NewName")
                    customerList[n].name = scanner.next()
                }
                2 -> {
                    println("enter LastName")
                    customerList[n].lastName = scanner.next()
                }
                3 -> {
                    println("enter cardNumber")
                    customerList[n].cardNumber = scanner.next()
                }
                4 ->{
                    println("enter new Account Number")
                    customerList[n].accountNumber = scanner.next()
                }
            }
        }
    }

    override fun sort() {
        Collections.sort(customerList, Comparator.comparing { Customer::name.name })
    }

    override fun showListOfAccount() {
        for (customer in customerList) {
            if (customer.accountNumber != null) {
                println(customer)
            }
        }

    }


}
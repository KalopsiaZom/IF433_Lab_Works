package oop_00000116382_bryantmarchiannoj.week04

fun main(){
    val Manager1 = Manager("Bryant", 10_000_000)
    val Developer1 = Developer("KalopsiaZom", 5_000_000, "C#")

    Manager1.work()
    Developer1.work()

    println(" ")

    val bonusManager1 = Manager1.calculateBonus()
    println("Manager ${Manager1.name} mendapatkan bonus sebesar Rp $bonusManager1.")
    val bonusDeveloper1 = Developer1.calculateBonus()
    println("Developer ${Developer1.name} mendapatkan bonus sebesar Rp $bonusDeveloper1.")
}
package oop_00000116382_bryantmarchiannoj.week03

fun main(){
    val e = Employee("Budi")

    // 1. Test Validasi Salary
    e.salary = -1000 // Harusnya print error
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    // 2. Test Encapsulation
    e.increasePerformance()
    // e.performanceRating = 5 // Kalo di uncomment, bakal merah (Error)

    // 3. Test Computed Property
    println("Pajak yang harus dibayar: ${e.tax}")
}
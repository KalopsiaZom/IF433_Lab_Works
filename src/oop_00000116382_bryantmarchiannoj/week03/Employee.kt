package oop_00000116382_bryantmarchiannoj.week03

class Employee(val name: String) {
    var salary: Int = 0
    set(value) {
        if (value < 0){
            println("ERROR: Gaji tidak boleh negatif! Di-set ke 0.")
            field = 0
        } else {
            field = value
        }
    }

    private var performanceRating: Int = 0

    // Private property
    fun increasePerformance(){
        performanceRating++
        println("Kinerja $name meningkat! Rating: $performanceRating")
    }

    fun printStatus(){
        println("Karyawan: $name, Rating: $performanceRating")
    }
}
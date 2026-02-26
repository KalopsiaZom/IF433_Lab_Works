package oop_00000116382_bryantmarchiannoj.week04

open class Vechicle(val brand: String) {
    var speed: Int = 0

    open fun accelerate() {
        speed += 10
        println("$brand melaju. Kecepatan: $speed km/jam")
    }

    open fun honk(){
        println("Beep beep!")
    }
}
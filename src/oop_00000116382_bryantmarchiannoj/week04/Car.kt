package oop_00000116382_bryantmarchiannoj.week04

open class Car(brand: String, val numberOfDoors: Int): Vehicle(brand) {

    fun openTrunk(){
        println("Bagasi mobil $brand dengan $numberOfDoors pintu dibuka.")
    }

    override fun honk(){
        println("IN IN! Mobil $brand lewat!")
    }

    override fun accelerate(){
        super.accelerate()
        println("Mobil $brand menggunakan transmisi gigi untuk menambah kecepatan.")
    }
}
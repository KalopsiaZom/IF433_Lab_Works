package oop_00000116382_bryantmarchiannoj.week04

fun main(){
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle("Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("--- Testing Car ---")
    val myCar = Car("Toyota", 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("--- Testing Electric Car ---")
    val myElectricCar = ElectricCar("BYD", 4, 100)
    myElectricCar.accelerate()
    myElectricCar.honk()
    myElectricCar.openTrunk()
}
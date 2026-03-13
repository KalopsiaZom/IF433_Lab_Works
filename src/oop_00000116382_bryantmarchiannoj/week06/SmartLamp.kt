package oop_00000116382_bryantmarchiannoj.week06

class SmartLamp(
    override val id: String,
    override val name: String
): SmartDevice, Switchable{
    override fun turnOn() {
        println("Lamput $name dinyalakan.")
    }

    override fun turnOff() {
        println("Lamput $name dimatikan.")
    }
}
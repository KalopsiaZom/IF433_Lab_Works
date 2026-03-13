package oop_00000116382_bryantmarchiannoj.week06

class Smartphone : Camera, Phone{
    override fun turnOn() {
        super<Camera>.turnOn()
        super<Phone>.turnOn()
        println("Sistem operasi Smartphone berhasil booting.")
    }
}
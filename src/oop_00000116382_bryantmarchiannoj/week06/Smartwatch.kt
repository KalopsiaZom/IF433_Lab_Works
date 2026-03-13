package oop_00000116382_bryantmarchiannoj.week06

class Smartwatch: Watch(), BluetoothConnectable, Rechargable {
    override fun showTime() {
        println("Layar OLED menyala: 14.00 WIB")
    }

    override fun connectToBluetooth() {
        println("Mencari perangkat HP di sekitar untuk pairing...")
    }

    override fun chargeBattery() {
        println("Mengisi daya menggunakan charger magnetik 15W.")
    }
}
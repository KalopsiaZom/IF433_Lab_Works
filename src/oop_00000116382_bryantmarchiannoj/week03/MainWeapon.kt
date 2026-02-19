package oop_00000116382_bryantmarchiannoj.week03

fun main() {

    val weapon = Weapon("Excalibur", 100)

    weapon.damage = -50

    weapon.damage = 9999

    println("Nama Weapon: ${weapon.name}")
    println("Damage: ${weapon.damage}")
    println("Tier: ${weapon.tier}")
}


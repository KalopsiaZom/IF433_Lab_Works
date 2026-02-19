package oop_00000116382_bryantmarchiannoj.week03

class Weapon(
    val name: String,
    damage: Int
    ) {
    var damage: Int = damage

    set(value) {
        if (value < 0){
            println("Damage tidak boleh negatif, damage akan diubah ke semula.")
            return
        } else if (value > 1000){
            println("Damage terlalu overpower! Akan diubah menjadi 1000.")
            field = 1000
            return
        } else{
            field = value
        }
    }

    val tier: String
        get() = when{
            damage > 800 -> "Legendary"
            damage > 500 -> "Epic"
            else -> "Common"
        }
}
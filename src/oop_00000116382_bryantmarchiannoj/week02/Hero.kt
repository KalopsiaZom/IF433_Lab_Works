package oop_00000116382_bryantmarchiannoj.week02

class Hero(
    val nama: String,
    var hp: Int = 100,
    val baseDamage: Int
) {
    fun attack(targetName: String){
        println("$nama menyerang $targetName dengan damage $baseDamage!")
    }

    fun takeDamage(damage: Int){
        hp -= damage
        if (hp <= 0){
            hp = 0
        }
    }

    fun isAlive(): Boolean{
        return hp > 0
    }
}
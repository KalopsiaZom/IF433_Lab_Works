package oop_00000116382_bryantmarchiannoj.week03

class Player(
    val username: String
) {
    private var xp: Int = 0
    val level: Int get() = (xp / 100) + 1

    fun addXp(amount: Int) {
        if(amount < 0){
            println("XP tidak menerima angka negatif.")
            return
        } else{
            // Checking jika ada perubahan level
            val oldLvl = level
            xp += amount
            val newLvl = level

            if(newLvl > oldLvl){
                println("Level Up! Selamat $username naik ke level $level")
            }
        }
    }
}
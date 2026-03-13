package oop_00000116382_bryantmarchiannoj.week06

class Button(override val name: String): Clickable{
    override fun click() {
        println("Tombol '$name' berhasil diklik!")
    }
}
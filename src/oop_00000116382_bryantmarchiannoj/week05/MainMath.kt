package oop_00000116382_bryantmarchiannoj.week05

fun main(){
    val math = MathHelper()

    val luasPersegi = math.hitungLuas(5)
    val luasPersegiPanjang = math.hitungLuas(6, 4)
    val luasLingkaran = math.hitungLuas(3.5)

    println("Luas Persegi: $luasPersegi")
    println("Luas Persegi Panjang: $luasPersegiPanjang")
    println("Luas Lingkaran: $luasLingkaran")
}
package oop_00000116382_bryantmarchiannoj.week01

fun main(){
    val gameTitle = "Legend of Wawa"
    val price = 250_000

    val finalPrice = calculateDiscount(price)

    printReceipt(title = gameTitle, originalPrice = price, finalPrice = finalPrice)
}

fun calculateDiscount(price: Int) = if (price > 500_000) (price * 0.2).toInt() else (price * 0.1).toInt()

fun printReceipt(
    title: String,
    originalPrice: Int,
    finalPrice: Int
) {
    println("Judul Game  : $title")
    println("Harga Asli : Rp $originalPrice")
    println("Harga Akhir: Rp $finalPrice")
}

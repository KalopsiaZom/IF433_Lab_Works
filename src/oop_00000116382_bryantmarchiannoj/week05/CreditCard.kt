package oop_00000116382_bryantmarchiannoj.week05

class CreditCard(
    accountName: String,
    val limit: Double,
    var usedAmount: Double = 0.0
    ) : PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("Pembayaran selesai. Total saldo terpakai: $usedAmount")
        } else{
            println("Pembayaran ditolak. Kartu melebihi limit.")
        }
    }
}
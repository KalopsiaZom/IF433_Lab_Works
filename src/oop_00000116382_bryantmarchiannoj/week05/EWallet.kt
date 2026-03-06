package oop_00000116382_bryantmarchiannoj.week05

class EWallet(
    accountName: String,
    var balance: Double
) : PaymentMethod(accountName) {
    override fun processPayment(amount: Double){
        if(balance >= amount) {
            balance -= amount
            println("Pembayaran berhasil senilai $amount. Sisa saldo anda adalah $balance")
        } else {
            println("Sisa saldo anda tidak cukup.")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("Top up berhasil. Saldo sekarang: $balance")
    }
}
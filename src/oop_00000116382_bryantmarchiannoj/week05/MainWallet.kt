package oop_00000116382_bryantmarchiannoj.week05

fun main() {

    val wallet = EWallet("Bryant", 50_000.0)
    val creditCard = CreditCard("KalopsiaZom", 100_000.0)

    val payments: List<PaymentMethod> = listOf(wallet, creditCard)

    for (payment in payments) {

        payment.processPayment(75_000.0)

        if (payment is EWallet) {
            println("Saldo kurang, melakukan top up...")
            payment.topUp(50_000.0)
            payment.processPayment(75_000.0)
        }

        println()
    }
}
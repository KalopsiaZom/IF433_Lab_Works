package oop_00000116382_bryantmarchiannoj.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double): Double
}
package oop_00000116382_bryantmarchiannoj.week10

// Untuk filter pencarian berdasarkan nama
interface INamedEntity {
    val name: String
}

data class Coin(override val name: String, val balance: Double): INamedEntity
data class Transaction(val id: String, val amount: Double)
package oop_00000116382_bryantmarchiannoj.week07

import javax.xml.crypto.Data

fun main (){
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient() // Instantiasi lewat Factory
    client.connect()
}
package oop_00000116382_bryantmarchiannoj.week14
import java.io.File
import java.io.FileWriter

interface OrderRepository {
    fun saveOrder(itemName: String, finalPrice: Double, customerType: String)
}

class CsvOrderRepository : OrderRepository {
    override fun saveOrder(itemName: String, finalPrice: Double, customerType: String) {
        FileWriter("orders.csv", true).use { writer ->
            writer.append("\$itemName, \$finalPrice, \$customerType\n")
        }
    }
}

interface NotificationService {
    fun sendNotification(message: String)
}

class EmailNotifier : NotificationService {
    override fun sendNotification(message: String) {
        println("Email terkirim: \$message")
    }
}

/*class BadOrderProcessor {
    private val file = File("orders.csv")

    fun processOrder(itemName: String, basePrice: Double, customerType: String) {
        val finalPrice = when (customerType) {
            "REGULAR" -> basePrice
            "VIP" -> basePrice * 0.90 // Diskon 10%
            else -> basePrice
        }
        println("Memproses pesanan \$itemName seharga \$finalPrice")

        file.appendText("\$itemName, \$finalPrice, \$customerType\n")

        println("Email terkirim: Pesanan \$itemName Anda telah dikonfirmasi!")
    }
}*/

class SafeOrderProcessor(
    private val repo: OrderRepository,
    private val notifier: NotificationService
)
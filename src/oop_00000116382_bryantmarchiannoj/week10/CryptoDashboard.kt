package oop_00000116382_bryantmarchiannoj.week10

fun main(){
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 0.52))
    coinRepo.add(Coin("ETH", 4.10))
    coinRepo.add(Coin("USDT", 2500.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("Network Status: ${response.status}")
    println("--- Asset Portfolio ---")
    response.data.forEach { coin ->
        println("Aset: ${coin.name}\t| Saldo: ${coin.balance}")
    }

    // Transaksi Fiktif
    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("Wawa-991A", 125.50))
    txRepo.add(Transaction("Wawa-160B", 500.00))

    println("\n--- Transaction Logs ---")
    txRepo.getAll().forEach { tx ->
        println("ID: ${tx.id}\t| Amount: $${tx.amount}")
    }

    // Optional tantangan
    println("\n--- Search Query Validation ---")
    val searchResult = coinRepo.findByName("ETH")
    searchResult.forEach { res ->
        println("Ditemukan: ${(res as Coin).name} -> Saldo: ${res.balance}")
    }
}
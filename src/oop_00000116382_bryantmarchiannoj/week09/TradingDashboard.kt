package oop_00000116382_bryantmarchiannoj.week09

fun main(){
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("BTCUSDT", "LONG", 50, -12.0, "CLOSED"),
        TradeLog("SOLUSDT", "LONG", 10, 25.4, "OPEN"),
        TradeLog("DOGEUSDT", "SHORT", 5, 8.5, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 20, 4.2, "OPEN")
    )

    // Pipeline 1: Ekstraksi Data Valid (Filter)
    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }

    // Pipeline 2: Memisahkan Winning Trades
    val winningTrades = closedTrades.filter { it.roe > 0 }

    // Pipeline 3: Memisahkan Losing Trades
    val losingTrades = closedTrades.filter { it.roe <= 0 }

    // Pipeline 4: Analisis Koin Profit Tertinggi (Sorting & Mapping)
    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map { "WIN [${it.pair} ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)" }

    // Pipeline 5: Analisis Koin Loss (Sorting & Mapping)
    val worstPerformersString = losingTrades
        .sortedBy { it.roe }
        .map { "LOSS [${it.pair} ${it.position}]: ${it.roe}% ROE (Lev: ${it.leverage}x)" }

    // Pipeline Tambahan: Ekstraksi Unik (Set)
    val uniquePairs = tradeHistory
        .map { it.pair }
        .toSet()

    println("=== CRYPTO TRADING DASHBOARD ===")
    topPerformersString.forEach { println(it) }
    worstPerformersString.forEach { println(it) }
    println("\nUnique Pairs Traded: $uniquePairs")

    /* Output
    === CRYPTO TRADING DASHBOARD ===
    WIN [BTCUSDT LONG]: +15.5% ROE (Lev: 20x)
    WIN [DOGEUSDT SHORT]: +8.5% ROE (Lev: 5x)
    LOSS [BTCUSDT LONG]: -12.0% ROE (Lev: 50x)
    LOSS [ETHUSDT SHORT]: -5.2% ROE (Lev: 10x)

    Unique Pairs Traded: [BTCUSDT, ETHUSDT, SOLUSDT, DOGEUSDT]
     */
}
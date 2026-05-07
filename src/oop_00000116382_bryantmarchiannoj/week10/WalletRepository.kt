package oop_00000116382_bryantmarchiannoj.week10

class WalletRepository<T> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }

    fun findByName(searchName: String): List<T> {
        return items.filter { it is INamedEntity && it.name == searchName }
    }
}
package oop_00000116382_bryantmarchiannoj.week14

interface Printable {
    fun print(doc: String)
}

interface Scannable {
    fun scan(doc: String): String
}

class ModernSimplePrinter: Printable {
    override fun print(doc: String) = println("Printing securely: \$doc")
}
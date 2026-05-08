package oop_00000116382_bryantmarchiannoj.week11

fun String.addGreeting(): String {
    return "Hello, $this"
}

// Extension function dengan parameter
fun String.repeatTimes(n: Int): String {
    return this.repeat(n)
}

// Extension function dengan nullable receiver
fun String?.isNullOrEmptyCustom(): Boolean {
    // 'this' bisa bernilai null, jadi harus ditangani
    return this == null || this.isEmpty()
}
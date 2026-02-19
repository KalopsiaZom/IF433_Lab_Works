package oop_00000116382_bryantmarchiannoj.week03

class Employee(val name: String) {
    var salary: Int = 0
    set(value) {
        println("Mencoba set gaji ke: $value")
        // PERINGATAN: KODE DIBAWAH INI SALAH DAN BERBAHAYA
        this.salary = value
    }
}
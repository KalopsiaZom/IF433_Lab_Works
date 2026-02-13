package oop_00000116382_bryantmarchiannoj.week02

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)

    println("Library Fine System")

    print("Masukkan Judul Buku: ")
    val judul = scanner.nextLine()

    print("Masukkan Nama Peminjam: ")
    val nama = scanner.nextLine()

    print("Berapa hari meminjam: ")
    var durasi = scanner.nextInt()

    scanner.nextLine()

    if(durasi < 0){
        println("Durasi hari kurang dari 0, diubah menjadi 1")
        durasi = 1
    }

    val loan = Loan(judul, nama, durasi)

    val denda = loan.calculateFine()

    println("\n --- Detail Peminjaman ---")
    println("Judul Buku: ${loan.bookTitle}")
    println("Nama Peminjam: ${loan.borrower}")
    println("Durasi Peminjaman: ${loan.loanDuration}")
    println("Denda: Rp. ${denda}")
}
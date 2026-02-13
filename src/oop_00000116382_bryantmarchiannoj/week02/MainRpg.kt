package oop_00000116382_bryantmarchiannoj.week02

import java.util.Scanner
import kotlin.random.Random

fun main(){
    val scanner = Scanner(System.`in`)

    print("Masukkan nama hero: ")
    val heroName = scanner.nextLine()

    print("Masukkan damage Hero: ")
    val heroDmg = scanner.nextInt()

    scanner.nextLine()

    val hero = Hero(heroName, baseDamage = heroDmg)

    // Musuh
    var enemyHp = 100

    while(hero.isAlive() && enemyHp > 0){
        println("\n--- Tampilan Menu ---")
        println("1. Serang")
        println("2. Kabur")
        print("Pilih aksi: ")
        var pilihan = scanner.nextInt()
        scanner.nextLine()

        if(pilihan == 1){
            enemyHp -= hero.baseDamage.toInt()
            hero.attack("Musuh")
            println("Sisa HP Musuh yang diserang: $enemyHp")

            if ( enemyHp > 0){
                val enemyDamage = Random.nextInt(10, 21)
                hero.takeDamage(enemyDamage)
                println("Musuh membalas dengan damage: $enemyDamage dan sisa HP hero: ${hero.hp}")
            }
        } else if (pilihan == 2){
            break
        }
    }

    if(hero.isAlive() && enemyHp == 0){
        println("${hero.nama} Menang!")
    } else if (!hero.isAlive()) {
        println("Musuh Menang!")
    } else{
        println("Pertarungan dihentikan.")
    }
}
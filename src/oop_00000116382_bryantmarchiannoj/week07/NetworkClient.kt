package oop_00000116382_bryantmarchiannoj.week07

class  NetworkClient private constructor(val url: String) {
    fun connect(){
        println("Connecting to $url...")
    }
}
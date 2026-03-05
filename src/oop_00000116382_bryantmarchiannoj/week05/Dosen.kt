package oop_00000116382_bryantmarchiannoj.week05

class Dosen(nama: String, val nidn: String): Pegawai(nama){
    //Wajib override karena fungsi bekerja() bersifat abstract di parentnya.
    override fun bekerja(){
        println("[$nama] sedang menyiapkan materi perkuliahan dan merivisi RPKPS.")
    }

    fun mengajar(){
        println("[$nama] sedang mengajar mahasiswa di kelas.")
    }
}
package oop_00000116382_bryantmarchiannoj.week06

fun main(){
    val lamp1 = SmartLamp("L1", "Ruang Tamu")
    val speaker1 = SmartSpeaker("S1", "Google Nest Dapur")
    val cctv1 = SmartCCTV("CCTV1", "Ezviz Garasi")

    val homehub = SmartHomeHub()
    homehub.addDevice(lamp1)
    homehub.addDevice(speaker1)
    homehub.addDevice(cctv1)

    homehub.activateSecurityMode()
    println("")
    homehub.turnOffAllSwitches()
}
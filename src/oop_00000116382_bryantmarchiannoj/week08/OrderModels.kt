package oop_00000116382_bryantmarchiannoj.week08

class City(val name: String)
class Adress(val city: City?)
class DeliveryDetails(val address: Adress?)
class Order(val deliveryDetails: DeliveryDetails?, val totalPrice: Int?)
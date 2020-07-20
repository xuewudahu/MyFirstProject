package com.example.cameraalbumtest

class Dustbin<in T:Waste> {
    fun put(t: T) {

    }



}

fun main() {
    val dustbin:Dustbin<Waste> = Dustbin<Waste>()
    val dryWasteDustbin:Dustbin<DryWaste> = Dustbin<DryWaste>()

    val waste=Waste()
    val dryWaste=DryWaste()

    dustbin.put(waste)
    dustbin.put(dryWaste)

    //dryWasteDustbin.put(waste)
    dryWasteDustbin.put(dryWaste)
}
fun main() {
    buildAquarium()
}

fun buildAquarium(){
    val myAquarium = Aquarium()
    myAquarium.printSize()

    //val myAquarium2 = Aquarium(width = 25)

    //val myAquarium3 = Aquarium(height = 35, length = 110)

    //val myAquarium4 = Aquarium(width = 35, height = 45, length = 120)

    val myAquarium5 = Aquarium(numberOfFish = 39)
    myAquarium5.printSize()
    myAquarium5.volume = 100
    myAquarium5.printSize()

    val aquarium6 = Aquarium(length = 25, width = 25, height = 40)
    aquarium6.printSize()

    println("------------------------------------------------------------")

    val myAquarium10 = Aquarium(width = 25, length = 25, height = 40)
    myAquarium10.printSize()

    val myTower = TowerTank(height = 40, diameter = 25)
    myTower.printSize()
}
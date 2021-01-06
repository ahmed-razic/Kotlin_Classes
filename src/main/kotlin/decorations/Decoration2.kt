package decorations

data class Decoration2(val rocks: String, val wood: String, val diver: String) {
}

fun makeDecoration2() {
    val decoration10 = Decoration2("crystal", "wood", "diver")
    println(decoration10)

    val (dec1, dec2, dec3) = decoration10
    println(dec1)
    println(dec2)
    println(dec3)

    val (dec10, _, dec30) = decoration10
    println(dec10)
    println(dec30)

}

fun main() {
    makeDecoration2()
}
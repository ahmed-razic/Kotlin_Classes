package decorations

data class Decoration(val rocks: String) {
}

fun makeDecorations() {
    val decoration1 = Decoration("granite")
    println(decoration1)

    val decoration2 = Decoration("slate")
    println(decoration2)

    val decoration3 = Decoration("slate")
    println(decoration3)

    println(decoration1.equals(decoration2))
    println(decoration2 == decoration3)
    println(decoration2 === decoration3)
    println(decoration3 === decoration3)

}

fun main() {
    makeDecorations()
}
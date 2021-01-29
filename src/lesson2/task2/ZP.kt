package lesson2.task2

import lesson1.task1.sqr
import kotlin.math.abs
import kotlin.math.sqrt

//fun main() {
//
//    println("Kolga alatyn aylyk jaz:")
//    val a = readLine()
//    if (a?.toDoubleOrNull() == null) {
//        println("Tek san jaz")
//        return
//    }
//    if (a.toInt() <= 42500) {
//        println("Ayliktan salyk alynbaydi")
//        return
//    }
//    println("bastapky aylik: ${getFullSumm(a.toDouble())}")
//    val p = getFullSumm(a.toDouble()) * 0.1
//    println("pensionka: $p")
//    val n = ((getFullSumm(a.toDouble()) - (getFullSumm(a.toDouble()) * 0.1)) - 42500) * 0.1
//    println("nalog na dohod: $n")
//    if (abs(getFullSumm(a.toDouble()) - p - n - a.toDouble()) < 0.0001)
//        println("kolga alatyn: ${getFullSumm(a.toDouble())} - $p - $n = ${getFullSumm(a.toDouble()) - p - n}")
//    else
//        println("HZ chto delat")
//}
//
//fun getFullSumm(c: Double): Double {
//    val a = (c - 4250) / 0.81
//    return a
//
//}

//fun main() {
//    println("Kilometr jaz:")
//    val k = readLine()
//    if (k?.toIntOrNull() == null) {
//        println("Tek san jazu kerek:")
//        return
//    }
//
//    val m = k.toDouble() / 1.61
//    println ("Jauaby: $m miles")
//}

fun main() {
    println("\"A\" berilgenin jaz:")
    val a = readLine()
    if (a?.toIntOrNull() == null) {
        println("Tek san jazu kerek!")
        return
    }
    println("\"B\" berilgenin jaz:")
    val b = readLine()
    if (b?.toIntOrNull() == null) {
        println("Tek san jazu kerek!")
        return
    }
    println("\"C\" berilgenin jaz:")
    val c = readLine()
    if (c?.toIntOrNull() == null) {
        println("Tek san jazu kerek!")
        return
    }
    println("Berilgeni $a * x^2 + $b * x + $c = 0")
    val d = discriminant(a.toDouble(), b.toDouble(), c.toDouble())
    println("Diskriminant ten: $d")
    if (d < 0) {
        println("x1 jane x2 jauaby jok")
        return
    }

    if (d == 0.0) {
        println("Bir jauap bolady: ${quadraticEquationRoot1(a.toDouble(), b.toDouble(), c.toDouble())}")
        return
    }

    val qer1 = quadraticEquationRoot1(a.toDouble(), b.toDouble(), c.toDouble())
    println("x1 ten: $qer1")
    val qer2 = quadraticEquationRoot2(a.toDouble(), b.toDouble(), c.toDouble())
    println("x2 ten: $qer2")

}


fun discriminant(a: Double, b: Double, c: Double) = sqr(b) - 4 * a * c
fun quadraticEquationRoot1(a: Double, b: Double, c: Double) =
    (-b + sqrt(discriminant(a, b, c))) / (2 * a)

fun quadraticEquationRoot2(a: Double, b: Double, c: Double) =
    (-b - sqrt(discriminant(a, b, c))) / (2 * a)
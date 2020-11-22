package lesson2.task2

import kotlin.math.abs

fun main() {

    println("Kolga alatyn aylyk jaz:")
    val a = readLine()
    if (a?.toDoubleOrNull() == null) {
        println("Tek san jaz:")
        return
    }

    println("bastapky aylik: ${getFullSumm(a.toDouble())}")
    val p = getFullSumm(a.toDouble()) * 0.1
    println("pensionka: $p")
    val n = ((getFullSumm(a.toDouble()) - (getFullSumm(a.toDouble()) * 0.1)) - 42500) * 0.1
    println("nalog na dohod: $n")
    if (abs(getFullSumm(a.toDouble()) - p - n - a.toDouble()) < 0.0001)
        println("kolga alatyn: ${getFullSumm(a.toDouble())} - $p - $n = ${getFullSumm(a.toDouble()) - p - n}")
    else
        println("HZ chto delat")
}

fun getFullSumm(c: Double): Double {
    val a = (c - 4250) / 0.81
    return a

}
package lesson3.task1

import java.lang.Integer.max
import java.lang.Integer.min
import kotlin.math.sqrt


fun main() {
    //println("recursive: ${factorial(13)}")
    //println("while: ${factorialWhile(13)}")
    //println("for: ${factorialFor(13)}")
    //println("fibonacci: ${fib(7)}")
    //println("fibonacciFor: ${fibFor(1)}")
    //println(findLowestCommonMultiple(18, 81))
    //println(findBiggestCommonMultiple(18, 81))
    //printAllDivisors(2400000)
    println("fibonacciWhile: ${fibWhile(7)}")

}

fun printAllDivisors(n: Int) {
    for (i: Int in 2..sqrt(n.toDouble()).toInt()) {
        if (n % i == 0) {
            println(i)
            println(n / i)
        }
    }

}

fun findBiggestCommonMultiple(n: Int, m: Int): Int {
    val min: Int = min(n, m)
    for (i: Int in min downTo 1) {
        if (n % i == 0 && m % i == 0)
            return i
    }
    return 1
}

fun findLowestCommonMultiple(n: Int, m: Int): Int {
    val max: Int = max(n, m)
    for (i: Int in max..m * n) {
        if (i % m == 0 && i % n == 0) {
            return i
        }
    }
    return m * n
}
fun factorialFor(n: Int): Int {
    var result = 1
    for (i: Int in 1..n) {
        result *= i
    }
    return result
}

fun factorialWhile(n: Int): Int {
    var result = 1
    var counter = 1
    while (counter <= n) {
        result *= counter
        counter++
    }
    return result
}

fun fibFor(n: Int): Int {
    var x1 = 1
    var x2 = 1
    var result = 0
    for (i: Int in 3..n) {
        result = x1 + x2
        x1 = x2
        x2 = result
    }
    return result
}
fun fibWhile(n:Int): Int {
    var x1 = 1
    var x2 = 1
    var result = 0
    var counter = 1
    while (counter <= n) {
        result = x1 + x2
        x1 = x2
        x2 = result
        counter++
    }
return result
}
fun fib(n: Int): Long {
    if (n <= 2) {
        return 1
    } else {
        return fib(n - 1) + fib(n - 2)
    }
}


fun factorial(n: Int): Int {
    if (n < 0)
        return 0
    if (n <= 1)
        return 1
    else
        return n * factorial(n - 1)
}

fun printAge() {
    var counter = 1
    val n = 100
    while (counter <= n) {
        if (counter % 3 == 0 && counter % 5 == 0)
            print("fizzbuzz")
        else if (counter % 3 == 0)
            print("fizz")
        else if (counter % 5 == 0)
            print("buzz")
        else
            print(counter)
        if (n != counter)
            print(", ")
        else
            println()
        counter++
    }
}

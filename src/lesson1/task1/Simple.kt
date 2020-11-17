@file:Suppress("UNUSED_PARAMETER")

package lesson1.task1

import kotlin.math.sqrt


fun main() {
    val number = 4275
    val a = thirdDigit(number)
    println ("jauaby $a")
}
/**
Бүтін санның квадратын табу
 */
fun sqr(x: Int) = x * x

/**
Бүтін емес санның квадратын табу
 */
fun sqr(x: Double) = x * x

/**
Дискриминант шығару
 */
fun discriminant(a: Double, b: Double, c: Double) = sqr(b) - 4 * a * c

/**
Квадраттық теңдеудің бір жауабын табу
 */
fun quadraticEquationRoot(a: Double, b: Double, c: Double) =
    (-b + sqrt(discriminant(a, b, c))) / (2 * a)

/**
Квадраттық теңдеудің екі жауабының көбейтіндісін табу
 */
fun quadraticRootProduct(a: Double, b: Double, c: Double): Double {
    val sd = sqrt(discriminant(a, b, c))
    val x1 = (-b + sd) / (2 * a)
    val x2 = (-b - sd) / (2 * a)
    return x1 * x2 // жауабы
}

/**
Негізгі функция
 */


/**
 * Оңай
 *
 * Инпут сағат және минутпен беріледі, мысалы(8:20:35)
 * Қанша секунд екенін шығару(мына мысалда 30035).
 */
fun seconds(hours: Int, minutes: Int, seconds: Int): Int {

    return((hours*(60 * 60)) + (minutes * 60) + seconds)
}


/**
 * Оңай
 *
 * Инпут бұрыштың градусы бүтін сандармен беріледі (мысалы, 36 градус 14 минут 35 секунд).
 * Радианмен шығарып беру (мысалы, 0.63256).
 */
fun angleInRadian(deg: Int, min: Int, sec: Int): Double {

    val x = (min.toDouble() + sec.toDouble() / 60.0) / 60.0
    return(deg.toDouble() + x) * Math.PI / 180
}

/**
 * Оңай
 *
 * Екі нүктенің координадатасы берілген, ара қашықтығын табыңыз (x1, y1) және (x2, y2).
 * Мысалы, (3, 0) және (0, 4) нүктесінің арасы 5-ке тең
 */
fun trackLength(x1: Double, y1: Double, x2: Double, y2: Double): Double {

    return(sqrt((sqr(x2 - x1)) + (sqr(y2 - y1))))
}

/**
 * Орташа
 *
 * Инпут 100-ден үлкен кез-келген сан (мысалы, 3801).
 * Соңынан санағанда үшінші санды табу (мына мысалда 8).
 */
fun thirdDigit(number: Int): Int {

    return((number % 1000) / 100)
}

/**
 * Орташа
 *
 * Поезд h1 сағат m1 минутта А қаласынан шықты (мысалы в 9:25) және
 * Б қаласына тура сол күннің h2 сағат m2 минутында келді (мысалы в 13:01).
 * Қанша уақыт жүргенін минуттап есептеңіз (мына мысалда 216).
 */
fun travelMinutes(hoursDepart: Int, minutesDepart: Int, hoursArrive: Int, minutesArrive: Int): Int {

    return(((hoursArrive * 60) + minutesArrive) - ((hoursDepart * 60) + minutesDepart))
}


/**
 * Орташа
 *
 * Инпут үш таңбалы бүтін сан (мысалы, 478).
 * Керісінше етіп қайтару керек (мысалы, 874).
 */
fun numberRevert(number: Int): Int {
    val a = number % 10
    val b = ((number %100)/10)
    val c = number / 100
    return(a * 100 + b * 10 + c)
}

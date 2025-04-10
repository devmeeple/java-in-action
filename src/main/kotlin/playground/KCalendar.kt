package playground


val DAYS_IN_MONTH = arrayOf(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)

fun main() {
    val calendar = KCalendar()

    println("달을 입력하세요.")
    val month = readln().toInt()

    println("${month}월은 ${calendar.getMaxDaysInMonth(month)}일까지 있습니다.")
    calendar.printSampleCalendar()
}

class KCalendar {
    fun getMaxDaysInMonth(month: Int): Int {
        return if (month in 1..12)
            DAYS_IN_MONTH[month - 1]
        else
            throw IllegalArgumentException("해당하는 달을 찾을 수 없습니다")
    }

    fun printSampleCalendar() {
        println("일 월 화 수 목 금 토")
        println("--------------------")
        println("1  2  3  4  5  6  7")
        println("8  9 10 11 12 13 14")
        println("15 16 17 18 19 20 21")
        println("22 23 24 25 26 27 28")
    }
}
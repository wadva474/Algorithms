package hack

import java.util.*

fun main() {
    val resultArray = MutableList(0) { 0 }
    val scanner = Scanner(System.`in`)
    val array = Array(6) { Array(6) { 0 } }
    for (i in 0 until 6) {
        array[i] = scanner.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()
    }
    for (i in 0..3) {
        for (j in 0..3) {
            var sum = 0
            sum += array[i][j]
            sum += array[i][j + 1]
            sum += array[i][j + 2]
            sum += array[i + 1][j + 1]
            sum += array[i + 2][j]
            sum += array[i + 2][j + 1]
            sum += array[i + 2][j + 2]
            resultArray.add(sum)
        }
    }
    print(resultArray)
}
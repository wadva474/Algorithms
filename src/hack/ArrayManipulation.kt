package hack

import java.util.*
import kotlin.math.max

/* This Code Provide Solution to the Question @here
https://www.hackerrank.com/challenges/crush/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
 Author: MUSA ABDUL-WADUD OLAGOKE
*/

fun arrayManipulation(n: Int, queries: Array<Array<Int>>): Long {
    var resultArray = Array(n) { 0 }
    var sum: Long = 0
    var output: Long = 0
    for (query in queries) {
        val (a, b, c) = query
        resultArray[a - 1] += c
        if (b < resultArray.size) {
            resultArray[b] -= c
        }
    }
    for (i in resultArray.indices) {
        sum += resultArray[i]
        output = max(output, sum)
    }
    return output
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nm = scan.nextLine().split(" ")

    val n = nm[0].trim().toInt()

    val m = nm[1].trim().toInt()

    val queries = Array(m) { Array(3) { 0 } }

    for (i in 0 until m) {
        queries[i] = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()
    }

    val result = arrayManipulation(n, queries)

    println(result)
}

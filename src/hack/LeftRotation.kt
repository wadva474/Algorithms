package hack

import java.util.*
/* This Code Provide Solution to the Question @here
https://www.hackerrank.com/challenges/array-left-rotation/problem
 Author: MUSA ABDUL-WADUD OLAGOKE
*/
fun main() {
    val scan = Scanner(System.`in`)

    val nd = scan.nextLine().split(" ")

    val n = nd[0].trim().toInt()

    val d = nd[1].trim().toInt()

    val a = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = a.sliceArray(0 until d)
    val remaining = a.sliceArray(d until a.size)
    val output = remaining + result
    for( i in output){
        print("$i ")
    }

}
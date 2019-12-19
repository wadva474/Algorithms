package hack

/* This Code Provide Solution to the Question @here
 https://www.hackerrank.com/challenges/dynamic-array/problem?h_r=next-challenge&h_v=zen
 Author: MUSA ABDUL-WADUD OLAGOKE
*/

class DynamicArray {
    fun dynamicArray(n: Int, queries: Array<Array<Int>>): Array<Int> {
        val resultArray = MutableList<Int>(0) { 0 }
        var lastAnswer = 0
        //Creates the number of List Required and set default to 0
        val lists = List(n) { MutableList(0) { 0 } }

        fun queryOne(x: Int, y: Int) {
            val listIndex = ((x xor lastAnswer) % n)
            lists[listIndex].add(y)
        }

        fun queryTwo(x: Int, y: Int) {
            val listIndex = ((x xor lastAnswer) % n)
            lastAnswer = lists[listIndex][y % lists[listIndex].size]
            resultArray.add(lastAnswer)
        }

        for (query in queries) {
            when (query[0]) {
                1 -> queryOne(query[1], query[2])
                2 -> queryTwo(query[1], query[2])
            }
        }
        return resultArray.toTypedArray()
    }
}

fun main() {
    val dynamic = DynamicArray()
    val first_multiple_int = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_int[0].toInt()
    val q = first_multiple_int[1].toInt()

    val queries = Array(q) { Array(3) { 0 } }

    for (i in 0 until q) {
        queries[i] = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()
    }
    val result = dynamic.dynamicArray(n, queries)
    print(result.joinToString("\n"))
}
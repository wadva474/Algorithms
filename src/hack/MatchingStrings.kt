package hack

import java.util.*

fun matchingStrings(strings: Array<String>, queries: Array<String>): Array<Int> {
    val outputArray = MutableList(0) { 0 }
    for (query in queries) {
        var count = 0
        for (string in strings) {
            if (string.equals(query, true)) {
                count++
            }
        }
        outputArray.add(count)
    }
    return outputArray.toTypedArray()
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val stringsCount = scan.nextLine().trim().toInt()

    val strings = Array<String>(stringsCount) { "" }
    for (i in 0 until stringsCount) {
        val stringsItem = scan.nextLine()
        strings[i] = stringsItem
    }

    val queriesCount = scan.nextLine().trim().toInt()

    val queries = Array<String>(queriesCount) { "" }
    for (i in 0 until queriesCount) {
        val queriesItem = scan.nextLine()
        queries[i] = queriesItem
    }

    val res = matchingStrings(strings, queries)

    println(res.joinToString("\n"))
}
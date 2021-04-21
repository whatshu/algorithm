package algorithm

fun main(args: Array<String>) {

    val li = arrayList<Int>()
    var res = 0

    for (el in arrayListOf(1, 6, 9)) {
        res *= el
        res += el
    }

    print(res)

}
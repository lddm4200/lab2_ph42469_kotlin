package com.example.lab2

fun main() {
    while (true) {
        println("\nChọn bài:")
        println("1. Bài 1:  Nhập 2 số a và b, Viết chương trình giải phương trình bậc 1: ax+b=0")
        println("2. Bài 2:  Nhập vào một tháng bất kỳ, hỏi tháng này thuộc quý mấy trong năm")
        println("3. Bài 3:  Viết chương trình kiểm tra 1 năm bất kỳ có phải năm nhuần hay không")
        println("4. Thoát")

        print("Nhập lựa chọn: ")
        val luaChon = readLine()?.toIntOrNull() ?: 0

        when (luaChon) {
            1 -> bai1()
            2 -> bai2()
            3 -> bai3()
            4 -> break
            else -> println("Lựa chọn không hợp lệ.")
        }
    }
}

fun bai1(){
    var a = 0.0
    var b = 0.0
    println("Nhập a:")
    var s = readLine()
    if (s != null) a = s.toDouble()
    println("Nhập b:")
    s = readLine()
    if (s != null) b = s.toDouble()
    if (a == 0.0 && b == 0.0) {
        println("Phương trình vô số nghiệm")
    } else if (a == 0.0 && b != 0.0) {
        println("Phương trình vô nghiệm")
    } else {
        val x = -b / a
        println("No x=" + x)
    }
}

fun bai2(){
    var month = 0
    println("Nhập tháng:")
    val s: String? = readLine()
    if (s != null) month = s.toInt()
    when (month) {
        1, 2, 3 -> println("Tháng " + month + " thuộc quý 1")
        4, 5, 6 -> println("Tháng " + month + " thuộc quý 2")
        7, 8, 9 -> println("Tháng " + month + " thuộc quý 3")
        10, 11, 12 -> println("Tháng " + month + " thuộc quý 4")
        else -> println("Tháng " + month + " không hợp lệ")
    }
}
fun bai3(){
    var year = 0
    var s: String?
    println("Chương trình kiểm tra năm nhuần:")
    do {
        println("Nhập 1 năm:")
        s = readLine()
        while (s == null || s.toInt() < 0) {
            println("Nhập sai năm, nhập lại:")
            s = readLine()
        }
        year = s.toInt()
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            println("Năm $year là năm nhuần")
        } else {
            println("Năm $year không phải là năm nhuần")
        }
        print("Tiếp không?(c/k):")
        s = readLine()
        if (s == "k")
            break;
    } while (true)
    println("Kết thúc chương trình")
}

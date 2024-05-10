package com.example.lab2

import QuanLySinhVien

fun main() {
    val quanLy = QuanLySinhVien()

    while (true) {
        println("\nChọn chức năng:")
        println("1. Thêm sinh viên")
        println("2. Cập nhật sinh viên")
        println("3. Xóa sinh viên")
        println("4. Hiển thị danh sách sinh viên")
        println("5. Thoát")

        print("Nhập lựa chọn: ")
        val luaChon = readLine()?.toIntOrNull() ?: 0

        when (luaChon) {
            1 -> quanLy.themSinhVien()
            2 -> quanLy.capNhatSinhVien()
            3 -> quanLy.xoaSinhVien()
            4 -> quanLy.hienThiDanhSachSinhVien()
            5 -> break
            else -> println("Lựa chọn không hợp lệ.")
        }
    }
}
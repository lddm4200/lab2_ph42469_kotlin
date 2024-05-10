class SinhVien(val ten: String, val mssv: String, val diemTB: Float, var daTotNghiep: Boolean?, var tuoi: Int?)

class QuanLySinhVien {
    private val danhSachSinhVien = mutableListOf<SinhVien>()

    fun themSinhVien() {
        print("Nhập tên sinh viên: ")
        val ten = readLine() ?: ""
        print("Nhập MSSV: ")
        val mssv = readLine() ?: ""
        print("Nhập điểm trung bình: ")
        val diemTB = readLine()?.toFloatOrNull() ?: 0f
        print("Nhập đã tốt nghiệp (true/false): ")
        val daTotNghiep = readLine()?.toBoolean()
        print("Nhập tuổi: ")
        val tuoi = readLine()?.toIntOrNull()

        val sinhVien = SinhVien(ten, mssv, diemTB, daTotNghiep, tuoi)
        danhSachSinhVien.add(sinhVien)
        println("Đã thêm sinh viên mới.")
    }

    fun capNhatSinhVien() {
        if (danhSachSinhVien.isEmpty()) {
            println("Không có sinh viên nào để cập nhật.")
            return
        }

        hienThiDanhSachSinhVien()
        print("Nhập chỉ số sinh viên muốn cập nhật: ")
        val index = readLine()?.toIntOrNull() ?: -1

        if (index in 0 until danhSachSinhVien.size) {
            val sinhVien = danhSachSinhVien[index]
            print("Nhập tên mới (nhấn Enter để giữ nguyên): ")
            val tenMoi = readLine() ?: sinhVien.ten
            print("Nhập MSSV mới (nhấn Enter để giữ nguyên): ")
            val mssvMoi = readLine() ?: sinhVien.mssv
            print("Nhập điểm trung bình mới (nhấn Enter để giữ nguyên): ")
            val diemTBMoi = readLine()?.toFloatOrNull() ?: sinhVien.diemTB
            print("Nhập đã tốt nghiệp mới (true/false, nhấn Enter để giữ nguyên): ")
            val daTotNghiepMoi = readLine()?.toBoolean() ?: sinhVien.daTotNghiep
            print("Nhập tuổi mới (nhấn Enter để giữ nguyên): ")
            val tuoiMoi = readLine()?.toIntOrNull() ?: sinhVien.tuoi

            val sinhVienMoi = SinhVien(tenMoi, mssvMoi, diemTBMoi, daTotNghiepMoi, tuoiMoi)
            danhSachSinhVien[index] = sinhVienMoi
            println("Đã cập nhật thông tin sinh viên.")
        } else {
            println("Chỉ số sinh viên không hợp lệ.")
        }
    }

    fun xoaSinhVien() {
        if (danhSachSinhVien.isEmpty()) {
            println("Không có sinh viên nào để xóa.")
            return
        }

        hienThiDanhSachSinhVien()
        print("Nhập chỉ số sinh viên muốn xóa: ")
        val index = readLine()?.toIntOrNull() ?: -1

        if (index in 0 until danhSachSinhVien.size) {
            danhSachSinhVien.removeAt(index)
            println("Đã xóa sinh viên.")
        } else {
            println("Chỉ số sinh viên không hợp lệ.")
        }
    }

    fun hienThiDanhSachSinhVien() {
        if (danhSachSinhVien.isEmpty()) {
            println("Không tìm thấy sinh viên nào.")
        } else {
            println("Danh sách sinh viên:")
            for ((index, sinhVien) in danhSachSinhVien.withIndex()) {
                println("Chỉ số: $index")
                println("Tên: ${sinhVien.ten}")
                println("MSSV: ${sinhVien.mssv}")
                println("Điểm TB: ${sinhVien.diemTB}")
                if(sinhVien.daTotNghiep==true){
                    println("da tot nghiep")
                } else{
                    println("chua tot nghiep")
                }
                println("Tuổi: ${sinhVien.tuoi}")
                println("--------------------")
            }
        }
    }
}
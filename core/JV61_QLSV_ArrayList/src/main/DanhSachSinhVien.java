package main;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVien {
	private ArrayList<SinhVien> danhSach;

	public DanhSachSinhVien(ArrayList<SinhVien> danhSach) {

		this.danhSach = danhSach;
	}

	public DanhSachSinhVien() {
		this.danhSach = new ArrayList<SinhVien>();
	}

// 1. them sv	
	public void themSinhVien(SinhVien sv) {
		this.danhSach.add(sv);
	}

//	2.	In danh sách sinh viên ra màn hình.
	public void inDanhSachSinhVien() {
		for (SinhVien sinhVien : danhSach) {
			System.out.println(sinhVien);
		}
	}

//	3. kiem tra ds sinh vien co rong hay khong
	public boolean kiemTraDanhSachRong() {
		return this.danhSach.isEmpty();

	}

//	4. lay ra so luong sinh vien trong danh sach
	public int laySoLuongSV() {

		return this.danhSach.size();
	}

//	5. lam rong ds sinh vien
	public void lamRongToanDS() {
		this.danhSach.removeAll(danhSach);
	}

//	6.	Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.
	public boolean kiemTraTonTai(SinhVien sv) {
		return this.danhSach.contains(sv);
	}

//	7.	Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.
	public boolean xoaSinhVien(SinhVien sv) {
		 return this.danhSach.remove(sv);
	}

	// 8. Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím.
	public void timSinhVien(String ten) {
		for (SinhVien sinhVien : danhSach) {
			if (sinhVien.getHoVaTen().indexOf(ten) >= 0) {
				System.out.println(sinhVien);
			}
		}
	}
	
//	9.	Xuất ra danh sách sinh viên có điểm từ cao đến thấp.
	public void sapXepSinhVienGiamDanTheoDiem() {
		Collections.sort(this.danhSach, new Comparator<SinhVien>() {

			@Override
			public int compare(SinhVien sv1, SinhVien sv2) {
				if (sv1.getDiemTrungBinh()< sv2.getDiemTrungBinh()) {
					
					return -1;
				}else if (sv1.getDiemTrungBinh()> sv2.getDiemTrungBinh()){
					return 1;
				}else {
					return 0;
				}
			}
		});
	}

	
}

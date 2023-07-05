import java.util.Objects;

public class Ngay {
	private int Ngay, Thang, Nam;

	public Ngay(int ngay, int thang, int nam) {
		super();
		Ngay = ngay;
		Thang = thang;
		Nam = nam;
	}

	public int getNgay() {
		return Ngay;
	}

	public void setNgay(int ngay) {
		Ngay = ngay;
	}

	public int getThang() {
		return Thang;
	}

	public void setThang(int thang) {
		Thang = thang;
	}

	public int getNam() {
		return Nam;
	}

	public void setNam(int nam) {
		Nam = nam;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Nam, Ngay, Thang);
	}
//	hàm equals	-> hàm so sánh bằng giữ hai đối tương
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ngay other = (Ngay) obj;
		return Nam == other.Nam && Ngay == other.Ngay && Thang == other.Thang;
	}
	
	
}

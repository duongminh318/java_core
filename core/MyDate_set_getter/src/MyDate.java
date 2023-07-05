import java.util.Objects;

public class MyDate {
	private int day;
	private int month;
	private int year;

	public MyDate(int day, int month, int year) {
		if (day >= 1 && day <= 31) {
			this.day = day;
		} else {
			this.day = 1;
		}
		if (month >= 1 && month <= 12) {
			this.month = month;
		} else {
			this.month = 1;
		}
		if (year >= 1) {
			this.year = year;
		}else {
			this.year = 1;
		}
	}
	
	public int getDay() {
		return this.day;
	}
	public void setDay(int d) {
		if(d>=1 && d<=31)
			this.day = d;
	}
	public int getMonth() {
		return this.month;
	}
	public void setMonth(int m) {
		if(m>=1 && m<=12)
			this.month = m;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int y) {
		if(y>=1)
			this.year = y;
	}
	
	@Override
	public String toString() {
		return "MyDate =" + day + "/" + month + "/" + year;
	}

	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyDate other = (MyDate) obj;
		return day == other.day && month == other.month && year == other.year;
	}

}

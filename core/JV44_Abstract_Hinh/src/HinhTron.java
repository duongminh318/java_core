
public class HinhTron extends Hinh {
	private double r;

	public HinhTron(ToaDo toaDo, double r) {
		super(toaDo);
		this.r = r;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	@Override
	public double tinhDienTich() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(this.r, 2);
	}

	
	
}

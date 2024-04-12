package entity;

public class Ponto {
	
	public double x;
	public double y; 
	
	public Ponto(double aX, double aY) {
		x = aX;
		y = aY;
	}
	
	public Ponto copy() {
		return new Ponto(x, y);
	}

	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
	

}

package fr.dta.tp102.tp10;

public class Point {

	private final static int INITX = 0;
	private final static int INITY = 0;
	private int x;
	private int y;
	
	public Point(int a, int b){
			this.x=a;
			this.y=b;
	}
	
	public Point() {
		x=INITX;
		y=INITY;
	}
	
	public int getINIT_X() {
		return INITX;
	}

	public int getINIT_Y() {
		return INITY;
	}

	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void setX(int a) {
		this.x=a;
	}

	public void setY(int a) {
		this.y=a;
	}

	
	public String toString() {
		return "["+this.x+","+this.y+"]";
	}
	
	
	public double distance(Point p) {
		return Math.sqrt(Math.pow((p.getX()-getX()),2.0)+Math.pow((p.getY()-getY()),2.0));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + INITX;
		result = prime * result + INITY;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (INITX != other.getINIT_X())
			return false;
		if (INITY != other.getINIT_Y())
			return false;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
	
}

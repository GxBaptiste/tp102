package fr.dta.tp102.tp10;

public class Point {

	private static final int INITX = 0;
	private static final int INITY = 0;
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
	
	public int getINITX() {
		return INITX;
	}

	public int getINITY() {
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
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		boolean res=true;
		if (this == obj)
			return res;
		if (obj == null)
			return !res;
		if (getClass() != obj.getClass())
			return !res;
		Point other = (Point) obj;
		if (INITX != other.getINITX())
			return !res;
		if (INITY != other.getINITY())
			return !res;
		if (x != other.x)
			return !res;
		if (y != other.y)
			res=false;
		return res;
	}
	
	
}

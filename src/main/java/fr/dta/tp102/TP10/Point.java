package fr.dta.tp102.TP10;

public class Point {

	private final int INIT_X = 0;
	private final int INIT_Y = 0;
	private int x;
	private int y;
	
	public Point(int a, int b){
			this.x=a;
			this.y=b;
	}
	
	public Point() {
		x=INIT_X;
		y=INIT_Y;
	}
	
	public int getINIT_X() {
		return INIT_X;
	}

	public int getINIT_Y() {
		return INIT_Y;
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
		String msg="["+this.x+","+this.y+"]";
		return msg;
	}
	
	
	public double distance(Point p) {
		return Math.sqrt(Math.pow((p.getX()-getX()),2.0)+Math.pow((p.getY()-getY()),2.0));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + INIT_X;
		result = prime * result + INIT_Y;
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
		if (INIT_X != other.INIT_X)
			return false;
		if (INIT_Y != other.INIT_Y)
			return false;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
	
/*	
 *  M�thode sans tous les cas possible
 * 
 * public boolean equals(Point p) {
		return ((p.getX()==x) && (p.getY()==y));
	} */
	
}

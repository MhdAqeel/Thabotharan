public class Point {
    private int x;
    private int y;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
	
	public void setX(int x){
		this.x=x;
	}

    public int getY() {
        return y;
    }
	
	public void setY(int y){
		this.y=y;
	}

    public double distance(int x, int y) {
        int dx = this.x - x;
        int dy = this.y - y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public double distance(Point p) {
        return distance(p.getX(), p.getY()); 
    }

    public double distance() {
        return distance(0, 0); // distance from origin
    }
	
	public int[] getXY(){
		return new int[]{this.x,this.y};
	}

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

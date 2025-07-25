public class Line{
	private Point begin;
	private Point end;
	
	public Line(int x1,int y1 ,int x2, int y2){
		this.begin = new Point(x1,y2);
		this.end = new Point(x2,y2);
	}
	public Line(Point begin ,Point end){
		this.begin = begin;
		this.end = end;		
	}
	
	public Point getBegin(){
		return this.begin;
	}
	public void setBegin(Point begin){
		this.begin = begin;
	}
	public Point getEnd(){
		return this.end;
	}
	public void setEnd(Point end){
		this.end=end;
	}
	public int getBeginX(){
		return this.getBegin().getX();
	}
	public void setBeginX(int x){
		this.begin.setX(x);
	}
	public int getBeginY(){
		return this.getBegin().getY();
	}
	public void setBeginY(int y){
		this.begin.setY(y);
	}
	public int[] getBeginXY(){
		return new int[] {this.getBeginX(),this.getBeginY()};
	}
	public void setBeginXY(int x , int y){
		this.begin = new Point(x,y);
	}
	public int getEndX(){
		return this.getEnd().getX();
	}
	public void setEndX(int x){
		this.end.setX(x);
	}
	public int getEndY(){
		return this.getEnd().getY();
	}
	public void setEndY(int y){
		this.end.setY(y);
	}
	public int[] getEndXY(){
		return new int[] {this.getEndX(),this.getEndY()};
	}
	public void setEndXY(int x , int y){
		this.end = new Point(x,y);
	}
	public String toString(){
		return"Line [ Begin = ( "+ this.getBeginX() +" , "+ this.getBeginY() +" ) , End = ( "+ this.getEndX() +" , "+ this.getEndY() +" ) ] ";
	}
	public double getLength(){
		return this.getBegin().distance(this.getEnd());
	}

}
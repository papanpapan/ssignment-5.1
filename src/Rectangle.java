
public class Rectangle extends Abstract {
	private final double width,length;
	public Rectangle(){
	this(1,1);
    }  
		
	public Rectangle(double width,double length){
		this.width=width;
		this.length=length;
	}
public double area(){
	return width*length;
}
public double perimeter(){
	return 2*(width+length);
}
	
}
			
	



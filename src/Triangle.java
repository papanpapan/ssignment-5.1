
public class Triangle extends Abstract  {
	private final double a,b,c;
	public Triangle(){
	this(1,1,1);
    }  
		
	public Triangle(double a,double b,double c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
public double area(){
	double s=(a+b+c)/2;
	return Math.sqrt(s*(s-a)*(s-b)*(s-c));
}
public double perimeter(){
	return a+b+c;
}

}
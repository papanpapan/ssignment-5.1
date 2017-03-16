
public class TestAbstract  {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double width=5,length=7;
		Abstract rectangle =new Rectangle (width,length);
		System.out.println("rectangle width"+width+"and length"+length+"\nResuling ariya"+rectangle.area()+"\nrectangle primeter"+rectangle.perimeter()+"\n");

		System.out.println("............................................................");
		
		
		double radius=5;
		Abstract circle =new Circle (radius);
		System.out.println("circle radius"+radius+"\ncircle ariea"+circle.area()+"\ncircle primeter"+circle.perimeter()+"\n");
		
		System.out.println("............................................................");

		
		double a=5,b=3,c=4;
		Abstract triangle =new Triangle (a, b, c);
		System.out.println("Triangle length"+a+","+b+","+c+"\nTriangle ariya"+triangle.area()+"\ntriangle primeter"+triangle.perimeter()+"\n");
	
		System.out.println("............................................................");

	
	
	}

	
		
}
	



package prob2;

public class Main {

	public static void main(String[] args) {
		
		Figure[] figures =  {
				new Rectangle(3.5, 5),
				new Triangle(4, 10),
				new Circle(7),
				
		};
		
		double sum = 0;
		
		for (Figure figure : figures) {
			sum += figure.computeArea();
		}
		
		System.out.println(String.format("\nSum of Areas : %,.2f " , sum));

	}

}

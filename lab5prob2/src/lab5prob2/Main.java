package lab5prob2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Figure[] figures =  {
				new Rectangle(3.5, 5),
				new Tringle(4, 10),
				new Circle(7),
				
		};
		
		double sum = 0;
		
		for (Figure figure : figures) {
			sum += figure.computeArea();
		}
		
		System.out.println("Sum of Area: " + sum);

	}

}

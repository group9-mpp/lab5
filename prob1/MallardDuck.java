package prob1;


import prob1.behavior.FlyWithWings;
import prob1.behavior.Quack;


public class MallardDuck  extends Duck {
	


	@Override
	public void display() {
	  System.out.println(" display");
		
	}

	@Override
	protected void setFlyBehavior() {
		this.flyBehavior = new FlyWithWings();
		
	}

	@Override
	protected void setQuackBehavior() {
		this.quackBehavior = new Quack();
		
	}

}

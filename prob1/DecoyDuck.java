package prob1;

import prob1.behavior.CannotFly;
import prob1.behavior.MuteQuack;

public class DecoyDuck extends Duck {

	@Override
	public void display() {
		System.out.println(" displaying"); 
	}

	@Override
	protected void setFlyBehavior() {
		this.flyBehavior = new CannotFly(); 
	}

	@Override
	protected void setQuackBehavior() {
		this.quackBehavior = new MuteQuack();
		
	}

}

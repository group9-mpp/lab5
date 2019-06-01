package lab5prob1.prob1;

import lab5prob1.prob1.behavior.CannotFly;
import lab5prob1.prob1.behavior.Squeak;

public class RubberDuck extends Duck {

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

		this.quackBehavior = new Squeak();

	}

}

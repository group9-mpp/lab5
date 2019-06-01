package lab5prob1.prob1;

import lab5prob1.prob1.behavior.FlyWithWings;
import lab5prob1.prob1.behavior.Quack;

public class RedheadDuck extends Duck {

	@Override
	public void display() {
		System.out.println(" displaying");

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

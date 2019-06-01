package prob1;

import prob1.behavior.FlyBehavior;
import prob1.behavior.QuackBehavior;

public abstract class Duck {

	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;

	public Duck() {
		this.setFlyBehavior();
		this.setQuackBehavior();
	}

	public void swim() {

		System.out.println(" swimming");
	}

	public void fly() {
		flyBehavior.fly();
	}

	public void quack() {
		quackBehavior.quack();
	}

	public abstract void display();

	protected abstract void setFlyBehavior();

	protected abstract void setQuackBehavior();

}

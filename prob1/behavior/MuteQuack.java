package prob1.behavior;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println(" cannot quack");

	}

}

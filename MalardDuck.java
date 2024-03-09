package ducks;

public class MalardDuck extends Duck{
	
	public MalardDuck() {
		quackBehaviour = new Quack();
		flyBehaviour = new FlyWithWings();
		swimBehaviour=new Drown();

	}
	
	@Override
	void display() {
		System.out.println("\nThis is Malrad Duck.....");

	}

}

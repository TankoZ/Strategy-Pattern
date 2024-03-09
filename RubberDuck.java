package ducks;

public class RubberDuck extends Duck{
	
	public RubberDuck() {
		flyBehaviour=new FlyNoWay();
		quackBehaviour= new Squeak();
		swimBehaviour=new Float();
	}
	@Override
	void display() {
		System.out.println("\nThis is Rubber Duck");
	}

}

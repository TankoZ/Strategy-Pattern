
package ducks;

public class DecoyDuck extends Duck{
	
	public RubberDuck() {
		flyBehaviour=new FlyNoWay();
		quackBehaviour= new MuteQuack();
		swimBehaviour=new Float();
	}
	@Override
	void display() {
		System.out.println("\nThis is Decoy Duck");
	}

}

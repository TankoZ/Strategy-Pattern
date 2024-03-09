package ducks;
//Henil Shah
//22070126102
//aiml b1

public class Main {

	public static void main(String[] args) {
		RedHeadDuck redHeadDuck=new RedHeadDuck();
		redHeadDuck.display();
		redHeadDuck.performFly();
		redHeadDuck.performQuack();
		redHeadDuck.performSwim();
		RubberDuck rb=new RubberDuck();
		rb.display();
		rb.performFly();
		rb.performQuack();
		rb.performSwim();
		MalardDuck malardDuck=new MalardDuck();
		malardDuck.display();
		malardDuck.performFly();
		malardDuck.performQuack();
		malardDuck.performSwim();
		DecoyDuck decoyDuck=new DecoyDuck();
		decoyDuck.display();
		decoyDuck.performFly();
		decoyDuck.performQuack();
		decoyDuck.performSwim();
	
	}

}

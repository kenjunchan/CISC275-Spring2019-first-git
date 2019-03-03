public class Dog extends Animal{
	public Dog(String n, int nL) {
		super(n, nL);
	}
	public String toString() {
		return "Dog: " + super.name + ", " + super.numLegs;
	}
	
}

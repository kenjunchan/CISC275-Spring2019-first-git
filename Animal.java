public abstract class Animal {
	String name;
	int numLegs;
	public Animal(String n, int nL) {
		this.name = n;
		this.numLegs = nL;
	}
	public int getLegs() {
		return this.numLegs;
	}
	public String toString() {
		return "Animal: " + this.name + ", " + this.numLegs;
	}
}

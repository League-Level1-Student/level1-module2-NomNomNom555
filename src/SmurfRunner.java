
public class SmurfRunner {
public static void main(String[] args) {
	Smurf handy = new Smurf("handy");
	System.out.println(handy.getName());
	handy.eat();
	System.out.println(handy.getHatColor());
	System.out.println(handy.isGirlOrBoy());
	Smurf papa = new Smurf("papa");
	papa.eat();
	System.out.println(papa.getName());
	System.out.println(papa.getHatColor());
	System.out.println(papa.isGirlOrBoy());
	Smurf smurfette = new Smurf("smurfette");
	smurfette.eat();
	System.out.println(	smurfette.getName());
	System.out.println(smurfette.getHatColor());
	System.out.println(smurfette.isGirlOrBoy());
	}
}

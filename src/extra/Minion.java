package extra;

public class Minion {
	private String name;
	private int eyes;
	private String color;
	private String master;
	Minion (String name, int eyes, String color){
		this.name= name;
		this.eyes = eyes;
		this.color= color;	
	}
	String getColor() {
		return this.color;
	}
	void setEyes(int eyes){
		if(eyes>0) {
			this.eyes=eyes;
		}
	}
	void setName(String name) {
		if(name.equals("dave")) {
			this.name=name;
		}
		if(name.equals("stuart")) {
			this.name=name;
		}
	}
	
}
	


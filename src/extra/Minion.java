package extra;

public class Minion {
	private String name;
	private int eyes;
	private String color;
	private String master;
	public Minion (String name, int eyes, String color, String master){
		this.name= name;
		this.eyes = eyes;
		this.color= color;	
	}
	public String getColor() {
		return this.color;
	}
	public int getEyes(){
		return this.eyes;
		}
	
	public String getName() {
			return this.name;
		}
	public void setMaster(String master) {
		this.master= master;
	}
	public String getMaster(){
		return this.master;
	}
	}
	

	


package Prototype;

public class Foods {
	
	private int foodid;
	private String foodname;
	
	public int getFoodid() {
		return foodid;
	}
	public void setFoodid(int foodid) {
		this.foodid = foodid;
	}
	public String getFoodname() {
		return foodname;
	}
	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}
	@Override
	public String toString() {
		return "Foods [foodid=" + foodid + ", foodname=" + foodname + "]";
	}
		
}

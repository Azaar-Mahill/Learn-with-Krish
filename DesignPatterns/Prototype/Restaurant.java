package Prototype;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements Cloneable{
	
	private String restaurantName;
	List<Foods> foods = new ArrayList<>();
	
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public List<Foods> getFoods() {
		return foods;
	}
	public void setFoods(List<Foods> foods) {
		this.foods = foods;
	}


	public void loadFoods(String[] Array1){
			for(int i=0; i<Array1.length;i++){
				Foods a = new Foods();
				a.setFoodid(i+1);
				a.setFoodname("Food "+(i+1)+" : "+Array1[i]);
				getFoods().add(a);
			}
	}
		
	@Override
	public String toString() {
		return "Restaurant [restaurantName=" + restaurantName + ", foods=" + foods + "]";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	
}

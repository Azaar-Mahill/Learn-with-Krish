package Prototype;

public class RestaurantRegistry {
	public static void main(String[] args) throws CloneNotSupportedException{
		
		String[] BBQ_Array = {"Mushroom_Chopsey", "Chicken_Wings", "Chicken_Breast", "Mutton_Kibab"};
		String[] VEGE_Array = {"Soup", "Dose", "String_Hoppers", "Hoppers"};
		
		Restaurant R1 = new Restaurant();
		R1.setRestaurantName("Colombo_BBQ_Restaurant");
		R1.loadFoods(BBQ_Array);
		System.out.println(R1);
		
		Restaurant R2 = (Restaurant) R1.clone();
		R2.setRestaurantName("Galle_BBQ_Restaurant");
		System.out.println(R2);
		
		RestaurantVege R3 = new RestaurantVege();
		R3.setRestaurantName("Colombo_VEGE_Restaurant");
		R3.loadFoods(VEGE_Array);
		System.out.println(R3);
		
		RestaurantVege R4 = R3.clone();
		R4.setRestaurantName("Galle_VEGE_Restaurant");
		System.out.println(R4);
		
		R2.getFoods().remove(3);
		
		R4.getFoods().remove(3);
		
		System.out.println(R1);
		System.out.println(R2);
		System.out.println(R3);
		System.out.println(R4);
	}
}

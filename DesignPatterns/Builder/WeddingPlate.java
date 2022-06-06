//package Builder;

public class WeddingPlate{
	public static void main(String a[]){
		
		Plate p = new PlateBuilder().setTypeOfRice("Biriyani").setTypeOfVegetableCurry("Vegetable_Chopsey").setTypeOfMeatCurry("Mutton").getPlate();
		System.out.println(p);
	}
}
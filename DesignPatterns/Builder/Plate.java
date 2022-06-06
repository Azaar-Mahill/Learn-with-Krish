//package Builder;

public class Plate{
	private String typeOfRice;
	private String typeOfVegetableCurry;
	private String typeOfMeatCurry;
	private double volumeOfWine;
	private int numberOfCutlets;

	public Plate(String typeOfRice, String typeOfVegetableCurry , String typeOfMeatCurry, double volumeOfWine, int numberOfCutlets){
		super();
		this.typeOfRice = typeOfRice;
		this.typeOfVegetableCurry = typeOfVegetableCurry;
		this.typeOfMeatCurry = typeOfMeatCurry;
		this.volumeOfWine = volumeOfWine;
		this.numberOfCutlets = numberOfCutlets;
	}

	@Override
	public String toString(){
		return "Phone [typeOfRice=" + typeOfRice + ", typeOfVegetableCurry=" + typeOfVegetableCurry + ", typeOfMeatCurry=" + typeOfMeatCurry + ", volumeOfWine=" + volumeOfWine + ", numberOfCutlets=" + numberOfCutlets + "]";
	}
}
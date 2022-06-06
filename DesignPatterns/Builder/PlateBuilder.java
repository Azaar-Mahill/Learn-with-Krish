//package Builder;

public class PlateBuilder{
 	private String typeOfRice;
	private String typeOfVegetableCurry;
	private String typeOfMeatCurry;
	private double volumeOfWine;
	private int numberOfCutlets;

	public PlateBuilder setTypeOfRice(String typeOfRice){
		this.typeOfRice = typeOfRice;
		return this;
	}

	public PlateBuilder setTypeOfVegetableCurry(String typeOfVegetableCurry){
		this.typeOfVegetableCurry = typeOfVegetableCurry;
		return this;
	}

	public PlateBuilder setTypeOfMeatCurry(String typeOfMeatCurry){
		this.typeOfMeatCurry = typeOfMeatCurry;
		return this;
	}

	public PlateBuilder setVolumeOfWine(double volumeOfWine){
		this.volumeOfWine = volumeOfWine;
		return this;
	}

	public PlateBuilder setNumberOfCutlets(int numberOfCutlets){
		this.numberOfCutlets = numberOfCutlets;
		return this;
	}

	public Plate getPlate(){
		return new Plate(typeOfRice, typeOfVegetableCurry, typeOfMeatCurry, volumeOfWine, numberOfCutlets);
	}
}

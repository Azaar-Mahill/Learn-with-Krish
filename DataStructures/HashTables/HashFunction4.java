package HashFunction;

import java.util.ArrayList;
import java.util.Arrays;

public class HashFunction4 {
	
	String[] theArray;
	int arraySize;
	int itemsInArray = 0;
	
	public static void main(String[] args) {
		
		HashFunction4 theFunc = new HashFunction4(31);
		//String[] elementsToAdd = {"01", "05" , "17" , "21" , "26"};
		//theFunc.hashFunction1(elementsToAdd, theFunc.theArray);
		String[] elementsToAdd2 = {"100", "510" , "170" , "214" , "268" , "398" ,
				"235" , "802" , "900" , "723" , "699" , "001" , "016" , "999" , "890" ,
				"725" , "998" , "978" , "988" , "990" , "989" , "984" , "320" , "321" ,
				"400" , "415" , "450" , "050" , "660" , "624"};
		
		String[] elementsToAdd3 = {"030", "060" , "090" , "120" , "150" , "180" ,
				"210" , "240" , "270" , "300" , "330" , "360" , "390" , "420" , "450" ,
				"480" , "510" , "540" , "570" , "600" , "989" , "984" , "320" , "321" ,
				"400" , "415" , "450" , "050" , "660" , "624"};
		
		//theFunc.hashFunction2(elementsToAdd3, theFunc.theArray);

		theFunc.increaseArraySize(60);
		
		//theFunc.displayHashTable();
		
		theFunc.fillArrayWithGap();
		
		theFunc.doubleHashFunction(elementsToAdd3, theFunc.theArray);
		
		theFunc.displayHashTable();
		
		theFunc.findKeyDblHashed("989");
		
		System.out.println("This is HashFunction4");
		
		/*
		theFunc.displayHashTable();
		//theFunc.findKey("660");
		*/
		
	}
	
	public void hashFunction1(String[] stringsForArray, String[] theArray) {
	
		for(int n = 0; n<stringsForArray.length; n++ ) {
			
			String newElementVal = stringsForArray[n];
			theArray[Integer.parseInt(newElementVal)] = newElementVal;
		}
	}

	
	public boolean isPrime(int number) {
		
		if(number%2 == 0) {
			return false;
		}
		
		for(int i=3; i*i <= number; i+=2) {
			
			if(number%i == 0) {
				return false;
			}
			
		}
		return true;
	}
	
	public int getNextPrime(int minNumberToCheck) {
		
		for(int i = minNumberToCheck; true;i++) {
			
			if(isPrime(i)) {
				return i;
			}
		}
	}
	
	public void increaseArraySize(int minArraySize) {
		
		int newArraySize = getNextPrime(minArraySize);
		System.out.println("newArraySize : "+newArraySize);
		moveOldArray(newArraySize);
	}
	
	public void moveOldArray(int newArraySize) {
		
		String[] cleanArray = removeEmptySpaceInArray(theArray);
		theArray = new String[newArraySize];
		arraySize = newArraySize;
		//fillArrayWithNeg1();
		fillArrayWithGap();
		for(int i =0;i<cleanArray.length;i++) {
			System.out.print(cleanArray[i]+" ");
		}
		System.out.println("newArraySize1 : "+arraySize);
		hashFunction2(cleanArray, theArray);
	}
	
	public String[] removeEmptySpaceInArray(String[] arrayToClean) {
		
		ArrayList<String> stringList = new ArrayList<String>();
		
		for(String theString : arrayToClean) {
			if(!theString.equals("   ") &&!theString.equals("")) {
				stringList.add(theString);
			}
		}
		return stringList.toArray(new String[stringList.size()]);
		
	}

	public void doubleHashFunction(String[] stringsForArray, String[] theArray) {
		
		for(int n = 0; n<stringsForArray.length; n++ ) {
			
			String newElementVal = stringsForArray[n];
			//int arrayIndex = Integer.parseInt(newElementVal)%29;
			int arrayIndex = Integer.parseInt(newElementVal)%arraySize;
			
			int stepDistance = 5 -(Integer.parseInt(newElementVal)%5);
			
			System.out.println("Modulus Index= "+ arrayIndex + " for value " + newElementVal);
			while(theArray[arrayIndex] != "   ") {
				arrayIndex += stepDistance;
				System.out.println("Collision Try " + arrayIndex + " Instead");
				arrayIndex %= arraySize;
			}
			theArray[arrayIndex] = newElementVal;
		}		
	}
	
	public void hashFunction2(String[] stringsForArray, String[] theArray) {
		
		for(int n = 0; n<stringsForArray.length; n++ ) {
			
			String newElementVal = stringsForArray[n];
			//int arrayIndex = Integer.parseInt(newElementVal)%29;
			int arrayIndex = Integer.parseInt(newElementVal)%arraySize;
			System.out.println("Modulus Index= "+ arrayIndex + " for value " + newElementVal);
			while(theArray[arrayIndex] != "   ") {
				arrayIndex++;
				System.out.println("Collision Try " + arrayIndex + " Instead");
				arrayIndex %= arraySize;
			}
			theArray[arrayIndex] = newElementVal;
		}		
	}
	
	HashFunction4(int size){
		
		arraySize = size;
		theArray = new String[size];
		//Arrays.fill(theArray, "   ");
		//fillArrayWithNeg1();
		fillArrayWithGap();
	}
	
	public void fillArrayWithNeg1() {
		Arrays.fill(theArray, " -1");
	}
	
	public void fillArrayWithGap() {
		Arrays.fill(theArray, "   ");
	}

	
	public String findKeyDblHashed(String key) {
		
		int arrayIndexHash = Integer.parseInt(key)%arraySize;
		
		int stepDistance = 5 -(Integer.parseInt(key)%5);
		
		while(theArray[arrayIndexHash] != "   ") {
			
			if (theArray[arrayIndexHash] == key) {
				System.out.println(" ");
				System.out.println(key + " was Found in Index " + arrayIndexHash);
				
				return theArray[arrayIndexHash];
			}
			
			arrayIndexHash += stepDistance;
			arrayIndexHash %= arraySize;
		}
		return null;
	}
	
	public String findKey(String key) {
		
		int arrayIndexHash = Integer.parseInt(key)%arraySize;
		
		while(theArray[arrayIndexHash] != "   ") {
			
			if (theArray[arrayIndexHash] == key) {
				System.out.println(" ");
				System.out.println(key + " was Found in Index " + arrayIndexHash);
				
				return theArray[arrayIndexHash];
			}
			arrayIndexHash++;
			arrayIndexHash %= arraySize;
		}
		return null;
	}
	
	public void displayHashTable() {
		
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("");
		for(int a = 0; a < (theArray.length/6); a++) {
			System.out.print("  |  ");
			System.out.print("  "+a);
		}
		System.out.println("");
		System.out.println("----------------------------------------------------------------------------------");
		for(int a = 0; a < (theArray.length/6); a++) {
			System.out.print("  |  ");
			System.out.print(theArray[a]);
		}

		System.out.println("");
		System.out.println("");
		System.out.println("----------------------------------------------------------------------------------");
		for(int b = (theArray.length/6); b < 2*(theArray.length/6); b++) {
			System.out.print("  |  ");
			System.out.print(" "+b);
		}
		
		System.out.println("");
		System.out.println("----------------------------------------------------------------------------------");
		for(int b = (theArray.length/6); b < 2*(theArray.length/6); b++) {
			System.out.print("  |  ");
			System.out.print(theArray[b]);

		}

		System.out.println("");
		System.out.println("");
		System.out.println("----------------------------------------------------------------------------------");
		for(int c = 2*(theArray.length/6); c < 3*(theArray.length/6); c++) {
			System.out.print("  |  ");
			System.out.print(" "+c);
		}
		
		System.out.println("");
		System.out.println("----------------------------------------------------------------------------------");
		for(int c = 2*(theArray.length/6); c < 3*(theArray.length/6); c++) {
			System.out.print("  |  ");
			System.out.print(theArray[c]);
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("----------------------------------------------------------------------------------");
		for(int c = 3*(theArray.length/6); c < 4*(theArray.length/6); c++) {
			System.out.print("  |  ");
			System.out.print(" "+c);
		}
		
		System.out.println("");
		System.out.println("----------------------------------------------------------------------------------");
		for(int c = 3*(theArray.length/6); c < 4*(theArray.length/6); c++) {
			System.out.print("  |  ");
			System.out.print(theArray[c]);
		}

		System.out.println("");
		System.out.println("");
		System.out.println("----------------------------------------------------------------------------------");
		for(int c = 4*(theArray.length/6); c < 5*(theArray.length/6); c++) {
			System.out.print("  |  ");
			System.out.print(" "+c);
		}
		
		System.out.println("");
		System.out.println("----------------------------------------------------------------------------------");
		for(int c = 4*(theArray.length/6); c < 5*(theArray.length/6); c++) {
			System.out.print("  |  ");
			System.out.print(theArray[c]);
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("----------------------------------------------------------------------------------");
		for(int c = 5*(theArray.length/6); c < 6*(theArray.length/6); c++) {
			System.out.print("  |  ");
			System.out.print(" "+c);
		}
		
		System.out.println("");
		System.out.println("----------------------------------------------------------------------------------");
		for(int c = 5*(theArray.length/6); c < 6*(theArray.length/6); c++) {
			System.out.print("  |  ");
			System.out.print(theArray[c]);
		}
		System.out.println("");
		System.out.println("");
		System.out.println("----------------------------------------------------------------------------------");


	}
	
}

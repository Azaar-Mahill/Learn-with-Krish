package HashFunction;

import java.util.Arrays;

public class HashFunction {
	
	String[] theArray;
	int arraySize;
	int itemsInArray = 0;
	
	public static void main(String[] args) {
		
		HashFunction theFunc = new HashFunction(30);
		//String[] elementsToAdd = {"01", "05" , "17" , "21" , "26"};
		//theFunc.hashFunction1(elementsToAdd, theFunc.theArray);
		String[] elementsToAdd2 = {"100", "510" , "170" , "214" , "268" , "398" ,
				"235" , "802" , "900" , "723" , "699" , "001" , "016" , "999" , "890" ,
				"725" , "998" , "978" , "988" , "990" , "989" , "984" , "320" , "321" ,
				"400" , "415" , "450" , "050" , "660" , "624"};
		theFunc.hashFunction2(elementsToAdd2, theFunc.theArray);
		theFunc.displayHashTable();
		theFunc.findKey("660");
		System.out.println("This is HashFunction");		
	}
	
	public void hashFunction1(String[] stringsForArray, String[] theArray) {
	
		for(int n = 0; n<stringsForArray.length; n++ ) {
			
			String newElementVal = stringsForArray[n];
			theArray[Integer.parseInt(newElementVal)] = newElementVal;
		}
	}
	
	public void hashFunction2(String[] stringsForArray, String[] theArray) {
		
		for(int n = 0; n<stringsForArray.length; n++ ) {
			
			String newElementVal = stringsForArray[n];
			int arrayIndex = Integer.parseInt(newElementVal)%29;
			System.out.println("Modulus Index= "+ arrayIndex + " for value " + newElementVal);
			while(theArray[arrayIndex] != "   ") {
				arrayIndex++;
				System.out.println("Collision Try " + arrayIndex + " Instead");
				arrayIndex %= arraySize;
			}
			theArray[arrayIndex] = newElementVal;
		}		
	}
	
	HashFunction(int size){
		
		arraySize = size;
		theArray = new String[size];
		Arrays.fill(theArray, "   ");
		
	}
	
	public String findKey(String key) {
		
		int arrayIndexHash = Integer.parseInt(key)%29;
		
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
		for(int a = 0; a < (theArray.length/3); a++) {
			System.out.print("  |  ");
			System.out.print("  "+a);
		}
		System.out.println("");
		System.out.println("----------------------------------------------------------------------------------");
		for(int a = 0; a < (theArray.length/3); a++) {
			System.out.print("  |  ");
			System.out.print(theArray[a]);
		}

		System.out.println("");
		System.out.println("");
		System.out.println("----------------------------------------------------------------------------------");
		for(int b = (theArray.length/3); b < 2*(theArray.length/3); b++) {
			System.out.print("  |  ");
			System.out.print(" "+b);
		}
		
		System.out.println("");
		System.out.println("----------------------------------------------------------------------------------");
		for(int b = (theArray.length/3); b < 2*(theArray.length/3); b++) {
			System.out.print("  |  ");
			System.out.print(theArray[b]);

		}

		System.out.println("");
		System.out.println("");
		System.out.println("----------------------------------------------------------------------------------");
		for(int c = 2*(theArray.length/3); c < 3*(theArray.length/3); c++) {
			System.out.print("  |  ");
			System.out.print(" "+c);
		}
		
		System.out.println("");
		System.out.println("----------------------------------------------------------------------------------");
		for(int c = 2*(theArray.length/3); c < 3*(theArray.length/3); c++) {
			System.out.print("  |  ");
			System.out.print(theArray[c]);
		}

		System.out.println("");
		System.out.println("");
		System.out.println("----------------------------------------------------------------------------------");


	}

	
}

import java.io.*;
class Game{

	public static void main(String[] args){

		int numOfGuesses = 0;
		GameHelper helper = new GameHelper();
 
		SimpleDotCom theDotCom = new SimpleDotCom();
		int randomNum = (int)(Math.random()*5);

		int[] locations = {randomNum, (randomNum+1), (randomNum+2)};
		theDotCom.setLocationCells(locations);
		boolean isAlive = true;

		while(isAlive == true){
			String guess = helper.getUserInput("enter a number ");
			String result = theDotCom.checkYourself(guess);
			boolean allHit = theDotCom.allHit();
			System.out.println("allHit: "+allHit);
			numOfGuesses++;
			if(result.equals("kill") && allHit==true){
				isAlive = false;
				System.out.println("You took "+numOfGuesses+ " guesses");
			} 
		}
	}
}

class SimpleDotCom{

	int[] locationCells;
	int numOfHits = 0;
	boolean firstCell = false;
	boolean secondCell = false;
	boolean thirdCell = false;

	public void setLocationCells(int[] locs){
		locationCells = locs;
	}

	public String checkYourself(String stringGuess){
		int guess = Integer.parseInt(stringGuess);
		String result = "miss";
		for(int cell: locationCells){
			if(guess == cell){
				result = "hit";
				numOfHits++;
				if(guess == locationCells[0]){
					firstCell = true;
				}
				if(guess == locationCells[1]){
					secondCell = true;
				}
				if(guess == locationCells[2]){
					thirdCell = true;
				}
				break;
			}
		}
		//if (numOfHits==locationCells.length && allHit()==true){
		if (allHit()==true){
			result = "kill";
		}
		System.out.println(result);
			return result;
	}

	public boolean allHit(){
		boolean hit=false;
		if(firstCell == true && secondCell == true && thirdCell == true){
			hit = true;	

		}
		return hit;
	}


}

class GameHelper{

	public String getUserInput(String prompt){

		String inputLine = null;
		System.out.print(prompt + " ");
		try{
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			inputLine = is.readLine();
			if(inputLine.length() == 0){
				return null;
			}
		}catch(IOException e){
			System.out.println("IOException : "+e);
		}
		return inputLine;






	}
}

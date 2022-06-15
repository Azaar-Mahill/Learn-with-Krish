

class MovieTestDrive{
	public static void main(String[] args){
		Movie one = new Movie();
		one.title = "Gone withStock";
		one.genre = "Tragic";
		one.rating = -2;
		Movie two = new Movie();
		two.title = "Lost in Cubicle space";
		two.genre = "Comedy";
		two.rating = 5;
		two.playIt();
		Movie three = new Movie();
		three.title = "ByteClub";
		three.genre = "Tragic but ultimately uplifting";
		three.rating = 127;

		System.out.println("one.title :"+one.title);
		System.out.println("one.genre :"+one.genre);
		System.out.println("one.rating :"+one.rating);
		System.out.println("two.title :"+two.title);
		System.out.println("two.genre :"+two.genre);
		System.out.println("two.rating :"+two.rating);
		System.out.println("three.title :"+three.title);
		System.out.println("three.genre :"+three.genre);
		System.out.println("three.rating :"+three.rating);
	}
}


class Movie {
	String title;
	String genre; 
	int rating;

	void playIt(){
		System.out.println("Playing the movie");
	}
}
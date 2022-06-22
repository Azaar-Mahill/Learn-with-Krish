import java.awt.Color;

class car{

	public static void main(String[] args){
		Mini M=new Mini();
		System.out.println(M.color);
	}

	public car(String name){
		System.out.println(name);
	}
}

class Mini extends car{

	Color color;

	public Mini(){
		this(Color.RED);
		System.out.println("A");
	}

	public Mini(Color c){
		super("Mini");
		System.out.println("B");
		color =c;

	}

}
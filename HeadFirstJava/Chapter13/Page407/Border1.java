import javax.swing.*;
import java.awt.*;

class Border1{

	public static void main(String[] args){
	
		Border1 gui = new Border1();
		gui.go();	
	}

	public void go(){
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Font bigFont = new Font("serif", Font.BOLD, 28);
		Font smallFont = new Font("serif", Font.BOLD, 8);

		JButton east = new JButton("East");
		east.setFont(smallFont );
		JButton west  = new JButton("West");
		west.setFont(bigFont );
		JButton north = new JButton("North");
		north.setFont(bigFont );
		JButton south = new JButton("South");
		south.setFont(bigFont );
		JButton center = new JButton("Center");
		center.setFont(bigFont );

		frame.getContentPane().add(BorderLayout.EAST, east ); 
		frame.getContentPane().add(BorderLayout.WEST, west ); 
		frame.getContentPane().add(BorderLayout.NORTH, north ); 
		frame.getContentPane().add(BorderLayout.SOUTH, south ); 
		frame.getContentPane().add(BorderLayout.CENTER, center ); 

		frame.setSize(500,500);
		frame.setVisible(true);



	}


}


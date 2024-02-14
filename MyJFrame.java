// Java Swing Program to demonstrate
// a simple JFrame
import javax.swing.*; 
import java.awt.Color; 
import javax.swing.JPanel; 
import javax.swing.JTextField;
import java.awt.event.*;

// Driver Class
public class MyJFrame {
	// main function
	public static void main(String[] args)
	{
		// Create a new JFrame
		JFrame frame = new JFrame("My First JFrame");

        JTextField textField; 
        textField = new JTextField();
        textField.setBounds(950,50,300,330);
        frame.add(textField);

        // Add the button and the text field to the panel
		// Create a labe
		JButton b = new JButton("testing");
        
		JButton bA = new JButton("hamburger");
        bA.setBounds(350, 130, 100, 60 );
        frame.add(bA);

          bA.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                // Display some text in the text field when the button is clicked
                textField.setText("Hamburger");
            }
        });
       
		JButton bB = new JButton("pizza");
        bB.setBounds(350,200, 100, 60 );
        frame.add(bB);

         bB.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                // Display some text in the text field when the button is clicked
                textField.setText("pizza");
            }
        });


		JButton bC = new JButton("cheese");
        bC.setBounds(350,270, 100, 60 );
        frame.add(bC);

		JButton bD = new JButton("crackers");
        bD.setBounds(350,340, 100, 60 );
        frame.add(bD);

		//setbounds(left, top/butoom,width, height)

		JButton bE = new JButton("Almond");
        bE.setBounds(460,130, 100, 60 );
        frame.add(bE);

		JButton bF = new JButton("Chicken Breast");
        bF.setBounds(460,200, 100, 60 );
        frame.add(bF);

		JButton bG = new JButton("Avocado");
        bG.setBounds(460,270, 100, 60 );
        frame.add(bG);

		JButton bH = new JButton("Rasins");
        bH.setBounds(460,340, 100, 60 );
        frame.add(bH);



		JButton bI = new JButton("Tortillas");
        bI.setBounds(570,130, 100, 60 );
        frame.add(bI);

		JButton bJ = new JButton("Carrots");
        bJ.setBounds(570,200, 100, 60 );
        frame.add(bJ);

		JButton bK = new JButton("Spinach");
        bK.setBounds(570,270, 100, 60 );
        frame.add(bK);

		JButton bL = new JButton("Broccoli");
        bL.setBounds(570,340, 100, 60 );
        frame.add(bL);


		JButton bM = new JButton("Walnuts");
        bM.setBounds(680,130, 100, 60 );
        frame.add(bM);

		JButton bN = new JButton("Mango");
        bN.setBounds(680,200, 100, 60 );
        frame.add(bN);

		JButton bO = new JButton("Noodles");
        bO.setBounds(680,270, 100, 60 );
        frame.add(bO);

		JButton bP = new JButton("Mushroom");
        bP.setBounds(680,340, 100, 60 );
        frame.add(bP);
        	

		JButton b1 = new JButton("Menu");
        b1.setBounds(10, 100, 200, 60 );
        frame.add(b1);

		JButton b2 = new JButton("Drinks");
        b2.setBounds(10, 160, 200, 60 );
        frame.add(b2);

		JButton b3 = new JButton("Snacks");
        b3.setBounds(10, 220, 200, 60 );
        frame.add(b3);

		JButton b4 = new JButton("CASH");
        b4.setBounds(1010, 500, 200, 100 );
        frame.add(b4);

        JButton b5 = new JButton("DEBIT CARD");
        b5.setBounds(1010, 400, 200, 100 );
        frame.add(b5);


        b1.setBackground(Color.yellow);
        b2.setBackground(Color.yellow);
        b3.setBackground(Color.yellow);
        b4.setBackground(Color.yellow);

		//color button
		bA.setBackground(Color.green);
 		bB.setBackground(Color.white);
		bC.setBackground(Color.orange);
		bD.setBackground(Color.yellow);


		bE.setBackground(Color.red);
		bF.setBackground(Color.green);
        bG.setBackground(Color.yellow);
        bH.setBackground(Color.blue);

        bI.setBackground(Color.green);
        bJ.setBackground(Color.blue);
        bK.setBackground(Color.red);
        bL.setBackground(Color.yellow);

        bM.setBackground(Color.yellow);
        bN.setBackground(Color.red);
        bO.setBackground(Color.blue);
        bP.setBackground(Color.green);

        JLabel label = new JLabel("Geeks Premier League 2023");
        label.setBounds(110,50,100,230);
		// Add the label to the frame
		frame.add(label);
       // frame.setSize(300,300);
        //frame.setLayout(null);
        //frame.setVisible(true);
		
        

		// Set frame properties
		frame.setSize(1300,1300);// Set the size of the frame
		frame.setLayout(null);
        frame.setVisible(true);

		// Close operation
		frame.setDefaultCloseOperation(
			JFrame.EXIT_ON_CLOSE);

		// Make the frame visible
		frame.setVisible(true);
	}
}

//import 
import java.awt.event.*;
import javax.swing.*;
import java.awt.Font;
//start class
class TicTacToe{
	//launch the application
	String changeState(String state){
		if (state=="1"){
			return "0";
		}
		else{
			return "1";
		}
	}

	void checkWin(int count){
		if(count>=5){
			//get values of the button
			String b1t=b1.getText();
			String b2t=b2.getText();
			String b3t=b3.getText();
			String b4t=b4.getText();
			String b5t=b5.getText();
			String b6t=b6.getText();
			String b7t=b7.getText();
			String b8t=b8.getText();
			String b9t=b9.getText();
			System.out.println(b1t+" "+b2t+" "+b3t+" "+b4t+" "+b5t+" "+b6t+" "+b7t+" "+b8t+" "+b9t);

			//check
			//vertical 1
			if((b1t.equals("1")&&b2t.equals("1")&&b3t.equals("1"))){
				JOptionPane.showMessageDialog(null," Winner : 1");
				System.exit(0);
			}
			else if((b4t.equals("1")&&b5t.equals("1")&&b6t.equals("1"))){
				JOptionPane.showMessageDialog(null," Winner : 1");
				System.exit(0);
			}
			else if((b7t.equals("1")&&b8t.equals("1")&&b9t.equals("1"))){
				JOptionPane.showMessageDialog(null," Winner : 1");
				System.exit(0);
			}
			//horizontal 1
			else if((b1t.equals("1")&&b4t.equals("1")&&b7t.equals("1"))){
				JOptionPane.showMessageDialog(null," Winner : 1");
				System.exit(0);
			}
			else if((b2t.equals("1")&&b5t.equals("1")&&b8t.equals("1"))){
				JOptionPane.showMessageDialog(null," Winner : 1");
				System.exit(0);
			}
			else if((b3t.equals("1")&&b6t.equals("1")&&b9t.equals("1"))){
				JOptionPane.showMessageDialog(null," Winner : 1");
				System.exit(0);
			}
			//diagonal 1
			else if((b1t.equals("1")&&b5t.equals("1")&&b9t.equals("1"))){
				JOptionPane.showMessageDialog(null," Winner : 1");
				System.exit(0);
			}
			else if((b3t.equals("1")&&b7t.equals("1")&&b5t.equals("1"))){
				JOptionPane.showMessageDialog(null," Winner : 1");
				System.exit(0);
			}

			//vertical 0
			else if((b1t.equals("0")&&b2t.equals("0")&&b3t.equals("0"))){
				JOptionPane.showMessageDialog(null," Winner : 0");
				System.exit(0);
			}
			else if((b4t.equals("0")&&b5t.equals("0")&&b6t.equals("0"))){
				JOptionPane.showMessageDialog(null," Winner : 0");
				System.exit(0);
			}
			else if((b7t.equals("0")&&b8t.equals("0")&&b9t.equals("0"))){
				JOptionPane.showMessageDialog(null," Winner : 0");
				System.exit(0);
			}

			//horizontal 0
			else if((b1t.equals("0")&&b4t.equals("0")&&b7t.equals("0"))){
				JOptionPane.showMessageDialog(null," Winner : 0");
				System.exit(0);
			}
			else if((b2t.equals("0")&&b5t.equals("0")&&b8t.equals("0"))){
				JOptionPane.showMessageDialog(null," Winner : 0");
				System.exit(0);
			}
			else if((b3t.equals("0")&&b6t.equals("0")&&b9t.equals("0"))){
				JOptionPane.showMessageDialog(null," Winner : 0");
				System.exit(0);
			}

			// diagonal 0
			else if((b1t.equals("0")&&b5t.equals("0")&&b9t.equals("0"))){
				JOptionPane.showMessageDialog(null," Winner : 0");
				System.exit(0);
			}
			else if((b3t.equals("0")&&b5t.equals("0")&&b7t.equals("0"))){
				JOptionPane.showMessageDialog(null," Winner : 0");
				System.exit(0);
			}
		}
	}
	public static void main(String args[]){
		TicTacToe window=new TicTacToe();
		window.frame.setVisible(true);
		window.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	//create the application
	TicTacToe(){
		initialize();
	}
	//define window elements
	JFrame frame;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
	int count=0;
	String state="1";

	//initialize the application
	private void initialize(){
		//set frame
		frame=new JFrame("Tic Tac Toe");
		frame.setLayout(null);
		frame.setSize(390,430);

		//set buttons
		b1=new JButton();
		b1.setBounds(0,0,130,130);
		frame.add(b1);
		b1.setFont(new Font("Dialog", Font.PLAIN, 36));

		b2=new JButton();
		b2.setBounds(0,130,130,130);
		frame.add(b2);
		b2.setFont(new Font("Dialog", Font.PLAIN, 36));

		b3=new JButton();
		b3.setBounds(0,260,130,130);
		frame.add(b3);
		b3.setFont(new Font("Dialog", Font.PLAIN, 36));

		b4=new JButton();
		b4.setBounds(130,0,130,130);
		frame.add(b4);
		b4.setFont(new Font("Dialog", Font.PLAIN, 36));

		b5=new JButton();
		b5.setBounds(130,130,130,130);
		frame.add(b5);
		b5.setFont(new Font("Dialog", Font.PLAIN, 36));

		b6=new JButton();
		b6.setBounds(130,260,130,130);
		frame.add(b6);
		b6.setFont(new Font("Dialog", Font.PLAIN, 36));

		b7=new JButton();
		b7.setBounds(260,0,130,130);
		frame.add(b7);
		b7.setFont(new Font("Dialog", Font.PLAIN, 36));

		b8=new JButton();
		b8.setBounds(260,130,130,130);
		frame.add(b8);
		b8.setFont(new Font("Dialog", Font.PLAIN, 36));

		b9=new JButton();
		b9.setBounds(260,260,130,130);
		frame.add(b9);
		b9.setFont(new Font("Dialog", Font.PLAIN, 36));

		//action listener for buttons
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				b1.setText(state);
				b1.setEnabled(false);
				count=count+1;
				state=changeState(state);
				checkWin(count);
			}
		});

		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				b2.setText(state);
				b2.setEnabled(false);
				count=count+1;
				state=changeState(state);
				checkWin(count);
			}
		});

		b3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				b3.setText(state);
				b3.setEnabled(false);
				count=count+1;
				state=changeState(state);
				checkWin(count);
			}
		});

		b4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				b4.setText(state);
				b4.setEnabled(false);
				count=count+1;
				state=changeState(state);
				checkWin(count);
			}
		});

		b5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				b5.setText(state);
				b5.setEnabled(false);
				count=count+1;
				state=changeState(state);
				checkWin(count);
			}
		});

		b6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				b6.setText(state);
				b6.setEnabled(false);
				count=count+1;
				state=changeState(state);
				checkWin(count);
			}
		});

		b7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				b7.setText(state);
				b7.setEnabled(false);
				count=count+1;
				state=changeState(state);
				checkWin(count);
			}
		});
		b8.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				b8.setText(state);
				b8.setEnabled(false);
				count=count+1;
				state=changeState(state);
				checkWin(count);
			}
		});

		b9.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				b9.setText(state);
				b9.setEnabled(false);
				count=count+1;
				state=changeState(state);
				checkWin(count);
			}
		});


	}
}
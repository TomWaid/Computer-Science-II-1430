package ATM_pack;

import java.util.*;  

import java.io.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.awt.*;
import javax.imageio.ImageIO;
import java.applet.Applet;
import java.awt.Label;
import java.awt.Font;

public class Presentation_class extends JFrame implements ActionListener{
	private Implementation_class customerpassword;
	private  Implementation_class customerInfo;
	private  Implementation_class customerInfo2;
	JTextField username;
	JPasswordField password;
	JPasswordField currentpassword;
	JPasswordField newpassword;
	JPasswordField newpassword2;
	JTextField AmountDeposited;
	JTextField AmountWithdraw;
	JTextField transferAccount;
	JTextField transferAmount;
	JLabel CurrentBalance;
	JPanel grid;
	JPanel grid1;
	JPanel griddpos;
	JPanel gridwdraw;
	JPanel gridCheck;
	JPanel gridPass;
	JPanel gridTran;
	JPanel gridFastCash;
	JButton login;
	JButton balance;
	JButton changePass;
	JButton deposit;
	JButton withdraw;
	JButton transfer;
	JButton logout;
	JButton addDeposit;
	JButton DoneDeposit;
	JButton subWithdraw;
	JButton DoneWithdraw;
	JButton Donecheck;
	JButton Passchange ;
	JButton  Passchangedone;
	JButton transdone;
	JButton compTrans;
	JButton fastCash;
	JButton DoneFast_Cash;
	JButton get20;
	JButton get40;
	JButton get60;
	
public Presentation_class(){
	 PasswordFile();
		  AccountInfoFile();
		
	}
	
	public void PasswordFile()
	{
		File passwordinfo = new File("Password.txt.txt");
		Scanner File2bopened= null;
		
		try {
			File2bopened = new Scanner(new File("Password.txt"));
		}
		
		catch (FileNotFoundException e)
		{
			System.out.println("File will absoloutely not open");
		}
		
		while(File2bopened.hasNext())
		{
			customerpassword = new  Implementation_class (File2bopened.nextInt(),File2bopened.next());
		}
		
	}
	
	public void AccountInfoFile(){
		File accountinfo = new File("AccountInformation.txt");
		Scanner nexFile2beopened = null;
		try{
			nexFile2beopened = new Scanner(new File("AccountInformation.txt"));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File will not open");
		}
		while(nexFile2beopened.hasNext())
		{
			customerInfo = new  Implementation_class (Integer.parseInt(nexFile2beopened.nextLine()),nexFile2beopened.nextLine(),nexFile2beopened.nextLine(),Integer.parseInt(nexFile2beopened.nextLine()),nexFile2beopened.next());
		}
	}
	 
	
	public void Login(){
		
		setTitle("Login");
		setPreferredSize(new Dimension(600, 500));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());

		grid = new JPanel();
		grid.setLayout(new GridLayout(3, 3));
		Border outline = BorderFactory.createLineBorder(new Color(248, 248, 255), 4);
		ImageIcon logo = new ImageIcon("university-of-houston-logo-31540.jpg");
		JLabel picture = new JLabel(logo);
		picture.setSize(new Dimension(150,300));
		
		JLabel user = new JLabel("Account Number:");
		 Font myFont = new Font("SansSerif Bold",Font.BOLD,20);
	     user.setFont(myFont);
		  username = new JTextField(10);
		
		JLabel pass = new JLabel("         Password: ");
		Font myFont2 = new Font("SansSerif Bold",Font.BOLD,20);
	    pass.setFont(myFont2);
	   password = new JPasswordField(10);
		
		login = new JButton("Login");
		Font myFont3 = new Font("SansSerif Bold",Font.BOLD,20);
	    login.setFont(myFont3);
		login.setPreferredSize(new Dimension(175, 45));
		login.setBackground(new Color(245,245,245));
		login.setBorder(outline);
		
	 
		
		 JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel space = new JPanel();
		JPanel bottom = new JPanel();
		JPanel bottom_right = new JPanel();
		 panel1.add(user);
		panel1.add(username); 
		 panel2.add(pass);
		panel2.add(password);
		panel2.add(user);
		panel2.add(username); 
		 panel3.add(login);
		 space.add(user);
		 space.add(username);
		 space.add(pass);
		 space.add(password);
		 grid.add( panel1 ); 
		grid.add(panel2);
		grid.add(panel3); 
		 grid.add(space);  
		 grid.add(bottom);
		grid.add(picture);
		add(grid, BorderLayout.CENTER);
		
	 
		 panel1.setBackground(Color.RED);
		panel2.setBackground(Color.RED);
		space.setBackground(Color.RED);
		panel3.setBackground(Color.RED);
		bottom.setBackground(Color.RED);
		bottom_right.setBackground(Color.RED);
		login.addActionListener(this);
		
		
		setVisible(true);
		pack();
		
	}
	 public void Main_menu(){

			 setTitle("Main Menu");
			setPreferredSize(new Dimension(800, 600));
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setLayout(new BorderLayout());
			Border outline = BorderFactory.createLineBorder(new Color (248, 248, 255), 4);
			grid1 = new JPanel();
			grid1.setLayout(new GridLayout(3, 3));

			
					 
			JLabel label = new JLabel();
			deposit = new JButton("Deposit");
			Font myFont4 = new Font("SansSerif Bold",Font.BOLD,16);
			deposit.setFont(myFont4);
		     balance = new JButton("Check Balance");
		    Font myFont5 = new Font("SansSerif Bold",Font.BOLD,16);
		    balance.setFont(myFont5);
		   changePass = new JButton(" Change Password");
		    Font myFont6 = new Font("SansSerif Bold",Font.BOLD,13);
		    changePass.setFont(myFont6);
        	withdraw = new JButton("Withdraw");
			Font myFont7 = new Font("SansSerif Bold",Font.BOLD,16);
			withdraw.setFont(myFont7);
			  transfer = new JButton("Make a Transfer");
			Font myFont8 = new Font("SansSerif Bold",Font.BOLD,16);
			transfer.setFont(myFont8);
			  logout = new JButton("Logout");
			Font myFont9 = new Font("SansSerif Bold",Font.BOLD,16);
			logout.setFont(myFont9);
			
			
		    fastCash = new JButton("Fast Cash");
			Font myFont17 = new Font("SansSerif Bold",Font.BOLD,16);
			fastCash.setFont(myFont17);
			
			
			
			deposit.setPreferredSize(new Dimension(150, 60));
			balance.setPreferredSize(new Dimension(150, 60));
			changePass.setPreferredSize(new Dimension(150, 60));
			withdraw.setPreferredSize(new Dimension(150, 60));
			transfer.setPreferredSize(new Dimension(150,60));
			logout.setPreferredSize(new Dimension(150, 60));
			fastCash.setPreferredSize(new Dimension(150, 60));
			
			deposit.setBackground(new Color(245,245,245));
			balance.setBackground(new Color(245,245,245));
			changePass.setBackground(new Color(245,245,245));
			withdraw.setBackground(new Color(245,245,245));
			transfer.setBackground(new Color(245,245,245));
			logout.setBackground(new Color(245,245,245));	
			fastCash.setBackground(new Color(245,245,245));
			
			deposit.setBorder(outline);
			balance.setBorder(outline);
			changePass.setBorder(outline);
			withdraw.setBorder(outline);
			transfer.setBorder(outline);
			logout.setBorder(outline);
			fastCash.setBorder(outline);
			
		JLabel menu = new JLabel("     "); 
		Font myFont10 = new Font("SansSerif Bold",Font.BOLD,16);
		menu.setFont(myFont10);
		JLabel menu2 = new JLabel("           Please make a selection from ");
		Font myFont11 = new Font("SansSerif Bold",Font.BOLD,16);
		menu2.setFont(myFont11);
		JLabel menu3 = new JLabel("  one of the following options          ");
		Font myFont12 = new Font("SansSerif Bold",Font.BOLD,16);
		menu3.setFont(myFont12);
			
			
			
			
			JPanel panel = new JPanel();
			panel.add(label); 
			JPanel panel1 = new JPanel();
			JPanel panel2 = new JPanel();
			JPanel panel3 = new JPanel();
			JPanel panel4 = new JPanel();
			JPanel panel5 = new JPanel();
			JPanel panel6 = new JPanel();
			JPanel panel7 = new JPanel();
			JPanel panel8 = new JPanel();
			JPanel panel9 = new JPanel();
			
			panel1.add(deposit);
			panel3.add(balance);
			panel5.add(changePass);
			panel2.add(withdraw);
			panel4.add(transfer);
			panel6.add(logout);
			panel6.add(logout);
		    panel7.add(fastCash);
		    panel8.add(menu2);
		    panel9.add(menu3);
		    
		    
			grid1.add(panel1);
			grid1.add(panel2);
			grid1.add(panel3);
			grid1.add(panel4);
			grid1.add(panel5);
			grid1.add(panel6);
			grid1.add(panel7);
			grid1.add(panel8);
			grid1.add(panel9);


			add(panel, BorderLayout.NORTH);
			add(grid1, BorderLayout.CENTER);

			panel.setBackground(Color.RED);
			panel1.setBackground(Color.RED);
			panel2.setBackground(Color.RED);
			panel3.setBackground(Color.RED);
			panel4.setBackground(Color.RED);
			panel5.setBackground(Color.RED);
			panel6.setBackground(Color.RED);
			panel7.setBackground(Color.RED);
			panel8.setBackground(Color.RED);
			panel9.setBackground(Color.RED); 
		 
		 	deposit.addActionListener(this);
			withdraw.addActionListener(this);
			logout.addActionListener(this);
			balance.addActionListener(this);
			changePass.addActionListener(this);
			transfer.addActionListener(this);  
			fastCash.addActionListener(this);
		 
			pack();
			setVisible(true);
	 }	
			public void Deposit_menu(){
				 
				setTitle("Deposit");
				setPreferredSize(new Dimension(600, 500));
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setLayout(new BorderLayout());
			    griddpos = new JPanel();
				griddpos.setLayout(new GridLayout(3, 3));
			    JLabel label = new JLabel();
				Border outline = BorderFactory.createLineBorder(new Color(248, 248, 255), 4);
			     CurrentBalance = new JLabel(" Your Current Balance: $");   
				JLabel CurrentBalance_Amount = new JLabel(""+  customerInfo.getBalance());
				JLabel request = new JLabel("Type in amount you are depositing");
				  AmountDeposited = new JTextField(10);
			    addDeposit = new JButton("Add Deposit");
				addDeposit.setPreferredSize(new Dimension(100, 25));
				addDeposit.setBackground(new Color(245,245,245));
				addDeposit.setBorder(outline);
			    DoneDeposit = new JButton("Done");
				DoneDeposit.setPreferredSize(new Dimension(100, 25));
				DoneDeposit.setBackground(new Color(245,245,245));
				DoneDeposit.setBorder(outline);
				
				 
				JPanel panel1 = new JPanel();
				JPanel panel2 = new JPanel();
				JPanel panel3 = new JPanel();
				JPanel panel4 = new JPanel();
				JPanel panel5 = new JPanel();
				JPanel panel6 = new JPanel();
				JPanel panel7 = new JPanel();
				JPanel panel8 = new JPanel();
				JPanel panel9 = new JPanel();
			    panel8.add(CurrentBalance);
				panel4.add(addDeposit);
				panel5.add(request);
				panel6.add(AmountDeposited);
			    panel7.add(DoneDeposit);
			    panel9.add(CurrentBalance_Amount);
			    griddpos.add(panel1);
				griddpos.add(panel2);
				griddpos.add(panel3);
				griddpos.add(panel4);
				griddpos.add(panel5);
				griddpos.add(panel6);
				griddpos.add(panel7);
				griddpos.add(panel8);
				griddpos.add(panel9);
				add(griddpos, BorderLayout.CENTER);
			    panel1.setBackground(Color.RED);
				panel2.setBackground(Color.RED);
				panel3.setBackground(Color.RED);
				panel4.setBackground(Color.RED);
				panel5.setBackground(Color.RED);
				panel6.setBackground(Color.RED);
				panel7.setBackground(Color.RED);
				panel8.setBackground(Color.RED);
				panel9.setBackground(Color.RED);
			 	
				addDeposit.addActionListener(this);
				DoneDeposit.addActionListener(this);
				 
				pack();
				setVisible(true);
			 
				
				
				
				
				
			}
			 public void WithDraw_menu(){
				 
				 setTitle("WithDraw");
				 setPreferredSize(new Dimension(600, 500));
				 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				 setLayout(new BorderLayout());

				gridwdraw = new JPanel();
				gridwdraw.setLayout(new GridLayout(3, 3));

				 
				 JLabel label = new JLabel();
				  
				 	
				 Border outline = BorderFactory.createLineBorder(new Color(248, 248, 255), 4);
				 	
				 JLabel CurrentBalance = new JLabel(" Your Current Balance: $" );
				 JLabel CurrentBalance_amount = new JLabel(""+  customerInfo.getBalance()); 
				 	
				 JLabel request = new JLabel("Type the amount to WithDraw?");
				 AmountWithdraw = new JTextField(10);

				 subWithdraw = new JButton("Withdraw");
				 subWithdraw.setPreferredSize(new Dimension(100, 25));
				 subWithdraw.setBackground(new Color(245,245,245));
				 subWithdraw.setBorder(outline);
				 DoneWithdraw = new JButton("Done");
				 DoneWithdraw.setPreferredSize(new Dimension(100, 25));
				 DoneWithdraw.setBackground(new Color(245,245,245));
				 DoneWithdraw.setBorder(outline);
				 JPanel panel1 = new JPanel();
				 JPanel panel2 = new JPanel();
				 JPanel panel3 = new JPanel();
				 JPanel panel4 = new JPanel();
				 JPanel panel5 = new JPanel();
				 JPanel panel6 = new JPanel();
				 JPanel panel7 = new JPanel();
				 JPanel panel8 = new JPanel();
				 JPanel panel9  = new JPanel();	
				 panel8.add(CurrentBalance);
				 panel5.add(request);
				 panel6.add(AmountWithdraw);
				 panel4.add(subWithdraw);
				 panel7.add(DoneWithdraw);
				 panel9.add(CurrentBalance_amount);
				gridwdraw.add(panel1);
				gridwdraw.add(panel2);
				gridwdraw.add(panel3);
				gridwdraw.add(panel4);
				gridwdraw.add(panel5);
				gridwdraw.add(panel6);
				gridwdraw.add(panel7);
				gridwdraw.add(panel8);
				gridwdraw.add(panel9);
			    add(gridwdraw, BorderLayout.CENTER);
				 
			     panel1.setBackground(Color.RED);
				 panel2.setBackground(Color.RED);
				 panel3.setBackground(Color.RED);
				 panel4.setBackground(Color.RED);
				 panel5.setBackground(Color.RED);
				 panel6.setBackground(Color.RED);
				 panel7.setBackground(Color.RED);
				 panel8.setBackground(Color.RED);
				 panel9.setBackground(Color.RED);

				 subWithdraw.addActionListener(this);
				 DoneWithdraw.addActionListener(this); 
				 	
				 	
				 	
				 pack();
				 setVisible(true);
				  
			 }
	public void Balance_menu(){
		setTitle("Balance");
		setPreferredSize(new Dimension(600, 500));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
			
		gridCheck = new JPanel();
		gridCheck.setLayout(new GridLayout(3,3));

	 
		JLabel label = new JLabel();
		 
		Border outline = BorderFactory.createLineBorder(new Color(248, 248, 255), 4);

		CurrentBalance = new JLabel("Current Balance: $");
		JLabel CurrentBalance_amount = new JLabel("" + customerInfo.getBalance ()); 

		Donecheck = new JButton("Done");
		Donecheck.setPreferredSize(new Dimension(100, 25));
		Donecheck.setBackground(new Color(245,245,245));
		Donecheck.setBorder(outline);

		 

		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		JPanel panel6 = new JPanel();
		JPanel panel7 = new JPanel();
		JPanel panel8 = new JPanel();
		JPanel panel9  = new JPanel();	
		panel5.add(CurrentBalance);
		panel4.add(Donecheck);
		panel6.add(CurrentBalance_amount);
		gridCheck.add(panel1);
		gridCheck.add(panel2);
		gridCheck.add(panel3);
		gridCheck.add(panel4);
		gridCheck.add(panel5);
		gridCheck.add(panel6);
		gridCheck.add(panel7);
		gridCheck.add(panel8);
		gridCheck.add(panel9);

        add(gridCheck, BorderLayout.CENTER);
        panel1.setBackground(Color.RED);
		panel2.setBackground(Color.RED);
		panel3.setBackground(Color.RED);
		panel4.setBackground(Color.RED);
		panel5.setBackground(Color.RED);
		panel6.setBackground(Color.RED);
		panel7.setBackground(Color.RED);
		panel8.setBackground(Color.RED);
		panel9.setBackground(Color.RED);

		   	Donecheck.addActionListener(this);
		 
		 pack();
		setVisible(true); 

	}
	public void fastcahsh_menu(){
		
		
		setTitle("Fast Cash");
		setPreferredSize(new Dimension(600,500));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		gridFastCash = new JPanel();
		gridFastCash.setLayout(new GridLayout(5, 2));
		
		Border outline = BorderFactory.createLineBorder(new Color(248, 248, 255), 4);
	    get20 = new JButton( "get 20");
		Font myFont13 = new Font("SansSerif Bold",Font.BOLD,20);
		get20.setFont(myFont13);
		get20.setPreferredSize(new Dimension(200, 50));
		get20.setBackground(new Color(245,245,245));
		get20.setBorder(outline);
		get40 = new JButton( "get 40");
		Font myFont14 = new Font("SansSerif Bold",Font.BOLD,20);
		get40.setFont(myFont14);
		get40.setPreferredSize(new Dimension(200, 50));
		get40.setBackground(new Color(245,245,245));
		get40.setBorder(outline);
		get60 = new JButton( "Get 60");
		Font myFont15 = new Font("SansSerif Bold",Font.BOLD,20);
		get60.setFont(myFont15);
		get60.setPreferredSize(new Dimension(200, 50));
		get60.setBackground(new Color(245,245,245));
		get60.setBorder(outline);
		
		DoneFast_Cash = new JButton( "Done");
		Font myFont16 = new Font("SansSerif Bold",Font.BOLD,20);
		DoneFast_Cash.setFont(myFont16);
		DoneFast_Cash.setPreferredSize(new Dimension(200, 50));
		DoneFast_Cash.setBackground(new Color(245,245,245));
		DoneFast_Cash.setBorder(outline);
 
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel bottom = new JPanel();
		panel1.add(get20);
		panel2.add(get60);
		panel3.add(get40);
		panel4.add(DoneFast_Cash);
		
		gridFastCash.add(bottom);
		gridFastCash.add(panel1);
		gridFastCash.add(panel3);
		gridFastCash.add(panel2);
		gridFastCash.add(panel4);
		add(gridFastCash, BorderLayout.CENTER);
		panel1.setBackground(Color.RED);
		panel2.setBackground(Color.RED);
		panel4.setBackground(Color.RED);
		panel3.setBackground(Color.RED);
		bottom.setBackground(Color.RED);
		get20.addActionListener(this);
		get60.addActionListener(this);
		get40.addActionListener(this);
		DoneFast_Cash.addActionListener(this);
		
		pack();
		setVisible(true);
	
		
		
		
		 
	}
	public void Transfer_menu(){
		setTitle("Transfer Funds");
		setPreferredSize(new Dimension(600, 500));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());

		gridTran = new JPanel();
		gridTran.setLayout(new GridLayout(3, 3));

		 
		JLabel label = new JLabel();
		 
		Border outline = BorderFactory.createLineBorder(new Color(248, 248, 255), 4);

		JLabel transAccount = new JLabel("Enter Account # to Transfer: ");
		transferAccount = new JTextField(10);

		JLabel transAmount = new JLabel("Enter Amount for Transfer: ");
		transferAmount = new JTextField(10);

		compTrans = new JButton("Complete Transfer");
		compTrans.setPreferredSize(new Dimension(150, 25));
		compTrans.setBackground(new Color(245,245,245));
		compTrans.setBorder(outline);


		transdone = new JButton("Done");
		transdone.setPreferredSize(new Dimension(100, 25));
		transdone.setBackground(new Color(245,245,245));
		transdone.setBorder(outline);

		JPanel panel = new JPanel();
		panel.add(label);

		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		JPanel panel6 = new JPanel();
		JPanel panel7 = new JPanel();
		JPanel panel8 = new JPanel();
		JPanel panel9 = new JPanel();


		panel2.add(transAccount);
		panel3.add(transferAccount);
		panel5.add(transAmount);
		panel6.add(transferAmount);
		panel7.add(compTrans);
		panel9.add(transdone);

		gridTran.add(panel1);
		gridTran.add(panel2);
		gridTran.add(panel3);
		gridTran.add(panel4);
		gridTran.add(panel5);
		gridTran.add(panel6);
		gridTran.add(panel7);
		gridTran.add(panel8);
		gridTran.add(panel9);

		add(panel, BorderLayout.NORTH);
		add(gridTran, BorderLayout.CENTER);


		panel.setBackground(Color.RED);
		panel1.setBackground(Color.RED);
		panel2.setBackground(Color.RED);
		panel3.setBackground(Color.RED);
		panel4.setBackground(Color.RED);
		panel5.setBackground(Color.RED);
		panel6.setBackground(Color.RED);
		panel7.setBackground(Color.RED);
		panel8.setBackground(Color.RED);
		panel9.setBackground(Color.RED);

		compTrans.addActionListener(this);
		transdone.addActionListener(this);
		 
		 
		pack();
		setVisible(true);
		 
	}
	
	public void ChangePassword_menu(){
		 
		setTitle("Change Password");
		setPreferredSize(new Dimension(600, 500));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());

	    gridPass = new JPanel();
		gridPass.setLayout(new GridLayout(3, 3));

		 
		JLabel label = new JLabel();
		 
		Border outline = BorderFactory.createLineBorder(new Color(248, 248, 255), 4);

		JLabel currentPass = new JLabel("Current Password: ");
		 currentpassword = new JPasswordField(10);

		JLabel newPass = new JLabel("Enter New Password: ");
		 newpassword = new JPasswordField(10);

		JLabel newPass2 = new JLabel("Enter New Password Again: ");
	    newpassword2 = new JPasswordField(10);


	    Passchange = new JButton("Change Password");
		Passchange .setPreferredSize(new Dimension(150, 25));
		Passchange .setBackground(new Color(245,245,245));
		Passchange .setBorder(outline);

		 Passchangedone  = new JButton("Done");
		 Passchangedone.setPreferredSize(new Dimension(100, 25));
		 Passchangedone.setBackground(new Color(245,245,245));
		 Passchangedone.setBorder(outline);

		 JPanel panel = new JPanel();
	     panel.add(label);

		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		JPanel panel6 = new JPanel();
		JPanel panel7 = new JPanel();
		JPanel panel8 = new JPanel();
		JPanel panel9  = new JPanel();


		panel2.add(currentPass);
		panel3.add(currentpassword);
		panel5.add(newPass);
		panel6.add(newpassword);
		panel8.add(newPass2);
		panel9.add(newpassword2);
		panel1.add(Passchange );
		panel7.add( Passchangedone);


		gridPass.add(panel1);
		gridPass.add(panel2);
		gridPass.add(panel3);
		gridPass.add(panel4);
		gridPass.add(panel5);
		gridPass.add(panel6);
		gridPass.add(panel7);
		gridPass.add(panel8);
		gridPass.add(panel9);

		add(panel, BorderLayout.NORTH);
		add(gridPass, BorderLayout.CENTER);


	    panel.setBackground(Color.RED);
		panel1.setBackground(Color.RED);
		panel2.setBackground(Color.RED);
		panel3.setBackground(Color.RED);
		panel4.setBackground(Color.RED);
		panel5.setBackground(Color.RED);
		panel6.setBackground(Color.RED);
		panel7.setBackground(Color.RED);
		panel8.setBackground(Color.RED);
		panel9.setBackground(Color.RED);
		 
		Passchange .addActionListener(this);
		 Passchangedone.addActionListener(this);
		 

		 pack();
		setVisible(true);
		 
	}
	
	public void actionPerformed(ActionEvent e)
    {
    	if(e.getSource() == login)
    	{
    		String Username = username.getText();
    		int inputUser = Integer.parseInt(Username);
    		
    		String inputpassword = password.getText();
    	
    		if(inputUser == customerpassword.getID() && inputpassword.equals(customerpassword.getPassword()))
    		{
    			System.out.println("Correct!");
    			grid.setVisible(false);
    			Main_menu();

    		
    		}
    		else
    		{
    			System.out.println("Incorrect!");
    		}
    	}
    	
    	if(e.getSource() == deposit)
    	{
    		grid1.setVisible(false);
    		Deposit_menu();
    		
    	}
    	
    	
    	
    	
    	if(e.getSource()== fastCash ){
    		grid1.setVisible(false);
    		fastcahsh_menu();
    		
    		
    		
    		
    		
    		
    		
    	}
    	
    	if(e.getSource() == get20){
    		customerInfo.withdraw(20);
    	}
    	if(e.getSource() == get40){
    		customerInfo.withdraw(40);
    	}
    	if(e.getSource()==get60){
    		customerInfo.withdraw(60);
    	}
    	if(e.getSource()== DoneFast_Cash){
    		gridFastCash.setVisible(false);
    		Main_menu() ;
    	}
    	if(e.getSource() == withdraw)
    	{
    		grid1.setVisible(false);
    		WithDraw_menu();
    	}
    	if(e.getSource() == addDeposit)
    	{
    		String entered = AmountDeposited.getText();
    		Double inputUser = Double.parseDouble(entered);
    		
    		customerInfo.deposit(inputUser);
    		CurrentBalance.setText("Current Balance: $" + customerInfo.getBalance());
    		
    	}
    	if(e.getSource() == subWithdraw)
    	{
    		String entered = AmountWithdraw.getText();
    		Double inputUser = Double.parseDouble(entered);
    		
    		customerInfo.withdraw(inputUser);
    		CurrentBalance.setText("Current Balance: $" + customerInfo.getBalance());
    		
    	}
    	if(e.getSource() == DoneWithdraw)
    	{
    		gridwdraw.setVisible(false);
    		Main_menu() ;
    	}
    	if(e.getSource() == DoneDeposit)
    	{
    		griddpos.setVisible(false);
    		Main_menu();
    	}
    	if(e.getSource() == balance)
    	{
    		grid1.setVisible(false);
    		Balance_menu();
    	}
    	if(e.getSource() == Donecheck)
    	{
    		gridCheck.setVisible(false);
    		Main_menu();
    	}
    	if(e.getSource() == changePass)
    	{
    		grid1.setVisible(false);
    		ChangePassword_menu();
    	}
    	if(e.getSource() == Passchange )
    	{
    		String checkPass = password.getText();
    		String newPass = newpassword.getText();
    		String newPass1 = newpassword2.getText();
    		if(checkPass.equals(customerInfo.getPassword()) && newPass.equals(newPass1))
    		{
    			customerInfo.setPassword(newPass);
    		}
    	}
    	if(e.getSource() ==Passchangedone )
    	{
    		gridPass.setVisible(false);
    		Main_menu();
    	}
    	
    	if(e.getSource() == transfer)
    	{
    		grid1.setVisible(false);
    		Transfer_menu();
    	}
    	
    	if(e.getSource() == compTrans)
    	{
    		String newID = transferAccount.getText();
    		int NewID = Integer.parseInt(newID);
    		
    		String entered = transferAmount.getText();
    		Double inputTransfer = Double.parseDouble(entered);
    		
    		customerInfo.withdraw(inputTransfer);
    		
    		
    	}
    	
    	if(e.getSource() == transdone)
    	{
    		gridTran.setVisible(false);
    		Main_menu();
    	}
    	
    	if(e.getSource() == logout)
    	{
    		System.out.println("done");
    		grid1.setVisible(false);
    		Login();
    		
    	}
    	
    	
    }
    
    
	 public static void main(String[] args) 
		{
		  Presentation_class newCustomer = new  Presentation_class();
			 newCustomer. Login();
		}
}

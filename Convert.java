import java.awt.*;
import java.awt.event.*;
class convert
{
public static void main(String agrs[])
{	
	Frame f= new Frame("Mini Clci");
	Button b1=new Button("C to F");
	b1.setBackground(Color.GREEN);
	f.setBackground(Color.GRAY);
	Button b2=new Button("F to C");
	b2.setBackground(Color.GREEN);
	Button b3=new Button("C to K");
	b3.setBackground(Color.GREEN);
	Button b4=new Button("F to K");
	b4.setBackground(Color.GREEN);
	Button b5=new Button("K to C");
	b5.setBackground(Color.GREEN);
	Button b6=new Button("K to F");
	b6.setBackground(Color.GREEN);
	TextField t1,t3;
	t1 = new TextField();
	Label l1 = new Label("Enter Temperature");
	l1.setBackground(Color.YELLOW);
	Label l2 = new Label("Temperature Converter");
	l2.setBackground(Color.RED);
	Label l3 = new Label("Result");
	l3.setBackground(Color.GREEN);
	t1.setBounds(250,150,400,40);
	l1.setBounds(100,150,400,40);
	l2.setBounds(300,50,150,50);
	t3=new TextField();
	t3.setBounds(250,400,100,40);
	l3.setBounds(100,400,50,30);
	b1.setBounds(100,200,50,30);
	b2.setBounds(150,200,50,30);
	b3.setBounds(100,250,50,30);
	b4.setBounds(150,250,50,30);
	b5.setBounds(100,300,50,30);
	b6.setBounds(150,300,50,30);
	
	
	f.add(t1);
	f.add(l1);
	f.add(l2);
	f.add(t3);
	f.add(l3);
	f.add(b1);
	f.add(b2);
	f.add(b3);
	f.add(b4);
	f.add(b5);
	f.add(b6);
	
	b1.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			int a = Integer.parseInt(t1.getText());
			double b1 = (1.8*a)+32;
			t3.setText(" "+b1);
		}
	});
	b2.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			int a = Integer.parseInt(t1.getText());
			double b2 = (a-32)/1.8;
			t3.setText(" "+b2);
		}
	});
	b3.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			int a = Integer.parseInt(t1.getText());
			double b3 =(a+273); 
			t3.setText(" "+b3);
		}
	});
	b4.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			int a = Integer.parseInt(t1.getText());
			double b4 = (a-32)*5/9+273;
			t3.setText(" "+b4);
		}
	});
	b5.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			int a = Integer.parseInt(t1.getText());
			double b5 =(a-273);
			t3.setText(" "+b5);
		}
	});
	b6.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			int a = Integer.parseInt(t1.getText());
			double b6 =(a-273)*9/5+32;
			t3.setText(" "+b6);
		}
	});
	
	f.setSize(500,500);
	f.setLayout(null);
	f.setVisible(true);
}
}

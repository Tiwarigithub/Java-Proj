import java.awt.*;
class Button2
{
public static void main(String agrs[])
{	
	Frame f= new Frame("Mini Clci");
	Button b=new Button("Sum1");
	Button c=new Button("Sum2");
	b.setBounds(50,200,100,50);
	c.setBounds(50,400,100,50);
	f.add(b);
	f.add(c);
	f.setSize(500,500);
	f.setLayout(null);
	f.setVisible(true);
}
}
import java.awt.*;
class Button1
{
public static void main(String agrs[])
{	
	Frame f= new Frame("Mini Clci");
	Button b=new Button("Sum");
	b.setBounds(50,200,100,50);
	f.add(b);
	f.setSize(500,500);
	f.setLayout(null);
	f.setVisible(true);
}
}
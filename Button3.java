import java.awt.*;
class Button3
{
public static void main(String args[])
{
	Frame f=new Frame("United");
	Button b=new Button("Display1");
	Button c=new Button("Display2");
	b.setBounds(50,200,100,100);
	c.setBounds(50,350,100,100);
	f.add(b);
	f.add(c);
	f.setSize(500,500);
	f.setLayout(null);
	f.setVisible(true);
}
}
	
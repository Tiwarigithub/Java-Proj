import java.awt.*;
import java.awt.event.*;
public class ALE
{
public static void main(String[] args)
{
	Frame f=new Frame("My Mini Calci");
	TextField tf=new TextField();
	Label l=new Label();
	l.setBounds(50,150,150,20);
	tf.setBounds(50,50,150,20);
	Button b=new Button("Click Here");
	b.setBounds(50,100,60,30);
	
	b.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
	int a=Integer.parseInt(tf.getText());
	if(a%2==0)
	l.setText("Even");
	else
	l.setText("odd");
}});

f.add(tf);
f.add(l);
f.add(b);
f.setSize(400,400);
f.setLayout(null);
f.setVisible(true);

}} 
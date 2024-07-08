import java.awt.*;
import java.awt.event.*;
class calc
{
public static void main(String agrs[])
{	
	Frame f= new Frame("Mini Clci");
	Button b=new Button("1");
	Button c=new Button("2");
	Button d=new Button("3");
	Button e=new Button("4");
	Button z=new Button("5");
	Button g=new Button("6");
	Button h=new Button("7");
	Button i=new Button("8");
	Button j=new Button("9");
	Button k=new Button("0");
	Button sum=new Button("+");
	Button sub=new Button("-");
	Button mul=new Button("*");
	Button div=new Button("/");
	Button mod=new Button("%");
	TextField t1,t2,t3;
	t1 = new TextField();
	Label l1 = new Label("Enter 1st num");
	l1.setBackground(Color.RED);
	Label l2 = new Label("Enter 2nd num");
	l2.setBackground(Color.RED);
	Label l3 = new Label("Display");
	l3.setBackground(Color.yellow);
	t1.setBounds(250,100,400,40);
	l1.setBounds(100,100,400,40);
	t2=new TextField();
	t2.setBounds(250,150,400,40);
	l2.setBounds(100,150,400,40);
	t3=new TextField();
	t3.setBounds(250,500,100,50);
	l3.setBounds(100,500,50,30);
	Button sin0=new Button("sin0");
	Button cos0=new Button("cos0");
	Button tan0=new Button("tan0");
	Button cosec0=new Button("cosec0");
	Button sec0=new Button("sec0");
	Button cot0=new Button("cot0");
	b.setBounds(50,200,50,30);
	c.setBounds(100,200,50,30);
	d.setBounds(150,200,50,30);
	e.setBounds(50,250,50,30);
	z.setBounds(100,250,50,30);
	g.setBounds(150,250,50,30);
	h.setBounds(50,300,50,30);
	i.setBounds(100,300,50,30);
	j.setBounds(150,300,50,30);
	k.setBounds(100,350,50,30);
	sum.setBounds(300,200,50,30);
	sub.setBounds(300,250,50,30);
	mul.setBounds(300,300,50,30);
	div.setBounds(300,350,50,30);
	mod.setBounds(300,400,50,30);
	sin0.setBounds(400,200,50,30);
	cos0.setBounds(400,250,50,30);
	tan0.setBounds(400,300,50,30);
	cosec0.setBounds(400,350,50,30);
	sec0.setBounds(400,400,50,30);
	cot0.setBounds(400,450,50,30);
	f.add(t1);
	f.add(t2);
	f.add(l1);
	f.add(l2);
	f.add(t3);
	f.add(l3);
	f.add(b);
	f.add(c);
	f.add(d);
	f.add(e);
	f.add(z);
	f.add(g);
	f.add(h);
	f.add(i);
	f.add(j);
	f.add(k);
	f.add(sum);
	f.add(sub);
	f.add(mul);
	f.add(div);
	f.add(mod);
	f.add(sin0);
	f.add(cos0);
	f.add(tan0);
	f.add(cosec0);
	f.add(sec0);
	f.add(cot0);
	sum.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			int a = Integer.parseInt(t1.getText());
			int b =Integer.parseInt(t2.getText());
			int sum = a+b;
			t3.setText(" "+sum);
		}
	});
	sub.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			int a = Integer.parseInt(t1.getText());
			int b =Integer.parseInt(t2.getText());
			int sub = a-b;
			t3.setText(" "+sub);
		}
	});
	mul.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			int a = Integer.parseInt(t1.getText());
			int b =Integer.parseInt(t2.getText());
			int mul = a*b;
			t3.setText(" "+mul);
		}
	});
	div.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			int a = Integer.parseInt(t1.getText());
			int b =Integer.parseInt(t2.getText());
			int div = a/b;
			t3.setText(" "+div);
		}
	});
	mod.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			int a = Integer.parseInt(t1.getText());
			int b =Integer.parseInt(t2.getText());
			int mod = a%b;
			t3.setText(" "+mod);
		}
	});
	f.setSize(500,500);
	f.setLayout(null);
	f.setVisible(true);
}
}

	
	
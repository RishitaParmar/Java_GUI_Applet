// All Controls 

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/* <applet code="AllAppControl" height=300 width=500></applet> */

public class AllAppControl extends Applet implements ActionListener,ItemListener,AdjustmentListener
{ 
	Button b1,b2;
	Label l1,l2,l3,l4,l5,l6,l7,l8;
	TextField t1,t2,t3;
	List lst1;
	Choice c1;
	TextArea ta1;
	Checkbox cb1,cb2,cb3,cb4;
	CheckboxGroup cbg;
	Scrollbar sb1,sb2;
	
	public void init()
	{
		//setLayout(null);
		l1 = new Label("Simple Label");
		//l1.setBounds(50,50,50,20);
		l2 = new Label("TextBox 1=");
		l3 = new Label("TextBox 2=");
		l4 = new Label("Select List Item=");
		l5 = new Label("Select Combo Item=");
		l6 = new Label("Enter Value in TextArea=");
		l7 = new Label("Simple Checkbox=");
		l8 = new Label("Group Checkbox=");

		b1 = new Button("Ok");
		b2 = new Button("Cancel");
		b1.addActionListener(this);
		

		t1 = new TextField();
		t2 = new TextField("Good Morning");
		t3 = new TextField(10);
		ta1 = new TextArea();
		
		lst1 = new List();
		lst1.add("BCA 2");
		lst1.add("BCA 4");
		lst1.add("BCA 6");
		lst1.add("PGDCA");
		
		c1 = new Choice();
		c1.add("BCA 2");
		c1.add("BCA 4");
		c1.add("BCA 6");
		c1.add("PGDCA");
		
		cb1 = new Checkbox("BCA");
		cb2 = new Checkbox("PGDCA");
		
		cbg = new CheckboxGroup();
		
		cb3 = new Checkbox("Male",cbg,true);
		cb4 = new Checkbox("Female",cbg,false);

		sb1 = new Scrollbar();
		sb2 = new Scrollbar();
		
		b2.addActionListener(this);
		lst1.addActionListener(this);
		c1.addItemListener(this);
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		cb3.addItemListener(this);
		cb4.addItemListener(this);
		sb1.addAdjustmentListener(this);
		sb2.addAdjustmentListener(this);
		

		add(l1);
		add(l2);add(t1);
		add(l3);add(t2);add(t3);
		add(l4);add(lst1);
		add(l5);add(c1);
		add(l6);add(ta1);
		add(l7);add(cb1);add(cb2);
		add(l8);add(cb3);add(cb4);
		add(b1);add(b2);
		add(sb1);add(sb2);
	}
	public void adjustmentValueChanged(AdjustmentEvent ae)
	{
//		l7.setText(sb1.getValue());
		setBackground(new Color(sb1.getValue(),sb2.getValue(),(sb1.getValue()+sb2.getValue())));
		showStatus(sb1.getValue()+","+sb2.getValue());
	}
	public void itemStateChanged(ItemEvent ie)
	{
		if(ie.getSource()==c1)
		{
			showStatus("Combo item="+c1.getItem(c1.getSelectedIndex()));
			//showStatus("List Item="+lst1.getSelectedItem());
		}
		l7.setText("Checkbox = "+cb1.getLabel()+"="+cb1.getState());
		l8.setText("Checkbox1 = "+cb2.getLabel()+"="+cb2.getState());
		showStatus(cbg.getSelectedCheckbox().getLabel());
	}
			
	public void actionPerformed(ActionEvent ae)
	{
		String st1 = ae.getActionCommand();
		if(st1.equals("Ok"))
		{
			System.out.println("Hellooo...");
		}
		if(ae.getSource()==lst1)
		{
			//showStatus(lst1.getItem(lst1.getSelectedIndex()));
			showStatus("List Item="+lst1.getSelectedItem());
		}
	}
}
		
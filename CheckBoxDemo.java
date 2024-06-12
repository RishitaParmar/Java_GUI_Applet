//JCheckBox Demo

/*
<applet code=CheckBoxDemo.class width=400 height=200> </applet>
*/

import java.awt.*;
import java.applet.*;
import javax.swing.*;

public class CheckBoxDemo extends Applet {

	JCheckBox cb1,cb2,cb3;

	public void init() {
		
		cb1 = new JCheckBox("Red");
		cb2 = new JCheckBox("Green");
		cb3 = new JCheckBox("Blue",true);
		add(cb1);
		add(cb2);
		add(cb3);
	}

}
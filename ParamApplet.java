//applet with parameter

/*
<applet code=ParamApplet.class width=400 height=200> 
<param name="mystr" value="Dimple">
</applet>
*/

import java.awt.*;
import java.applet.*;

public class ParamApplet extends Applet {
	String s;
	public void init() {
		s=getParameter("mystr");
	}
	public void paint (Graphics g) {
		
		g.drawString("Hello "+s,10,100);
	}
}
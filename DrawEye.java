//Draw eye

/*
<applet code=DrawEye.class width=400 height=200> 
</applet>
*/

import java.awt.*;
import java.applet.*;

public class DrawEye extends Applet {
	public void init() {
		//setBackground(Color.blue);
	}
	public void paint (Graphics g) {
		g.setColor(Color.yellow);
		g.fillOval(20,20,200,120);
		g.setColor(Color.red);
		g.fillOval(70,30,100,100);
	}
}
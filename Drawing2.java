/*<applet code="Drawing2" Height="300" Width="500"></applet>*/
import java.awt.*;
import java.applet.*;
public class Drawing2 extends Applet
{
	public void paint(Graphics g)
	{
//		g.drawLine(0,0,250,300);
//		g.drawLine(250,300,300,0);
		g.drawLine(0,0,getWidth()/2,getHeight());
		g.drawLine(getWidth()/2,getHeight(),getWidth(),0);
	}	
}

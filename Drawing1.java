/*<applet code="Drawing1" Height="300" Width="500"></applet>*/
import java.awt.*;
import java.applet.*;
public class Drawing1 extends Applet
{
	public void paint(Graphics g)
	{
//		g.drawLine(0,300,250,0);
//		g.drawLine(250,0,500,300);
		g.drawLine(0,getHeight(),getWidth()/2,0);
		g.drawLine(getWidth()/2,0,getWidth(),getHeight());
	}
}

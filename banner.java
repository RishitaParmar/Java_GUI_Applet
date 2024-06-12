import java.awt.*;
import java.applet.*;
/*
<applet code="banner" height=300 width=500>
</applet>
*/

public class banner extends Applet implements Runnable
{
	String msg="A simple banner";
	char ch;
	Thread t;
	public void init()
	{
		t = new Thread(this,"BCA4");
	}
	public void start()
	{
		t.start();
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,50,100);
	}
	public void run()
	{
		try
		{
			while(true)
			{
				t.sleep(500);
				ch = msg.charAt(0);
				msg = msg.substring(1,msg.length());
				msg+=ch;
				repaint();
			}
		}
		catch(InterruptedException e){}
	}		
}
package VBrian;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.sql.Date;
import java.time.LocalDateTime;



public class Make
{
private	String	company;
private	String	factory;
private	Date	mintDate;
private	ImageIcon	logo;
private	int		contactInfo;
private	String	website;
	
Make()
	{	company = "Dodge";
		factory = "Auburn Hills";
		website = "www.dodge.com";
		try {mintDate=new LocalDateTime ("yyyy-MM-dd").parse("2020");}
		catch (Exception e) {;}
		logo=new ImageIcon("dodgelogo.jpg");
		contactInfo = 34534523;
	}
		
Make(String c, String fy, String wS, Date m, ImageIcon l, int cI )
	{
		company = c;
		factory = fy;
		website = wS;
		mintDate = m;
		logo = l;
		contactInfo = cI;
	}
	
ImageIcon getLogo()
	{
		return logo;
		
	}

	void getMake()
	{
		MakeFrame thisOne = new MakeFrame();
	}
	
	private class MakeFrame extends JFrame
	{ 
		JPanel pnl = new JPanel();
		ClassLoader ldr = this.getClass().getClassLoader();
		ImageIcon duke = logo;
		JLabel lbll = new JLabel ( duke );
		
		MakeFrame()
		{
			super(company);
			setSize(800, 400);
			setDefaultCloseOperation( EXIT_ON_CLOSE);
			add(pnl);
			pnl.add(lbll);
			setVisible(true);
		}
		
		
	}
	
}

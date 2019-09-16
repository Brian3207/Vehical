package VBrian;

import java.sql.Date;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class Make
{
String	company;
String	factory;
java.util.Date 	mintDate;
ImageIcon	logo;
int		contactInfo;
String	website;





@Override
public String toString() {
	return "Make [company=" + company + ", factory=" + factory + ", mintDate=" + mintDate + ", logo=" + logo
			+ ", contactInfo=" + contactInfo + ", website=" + website + "]";
}

Make()
	{	company = "Dodge";
		factory = "Auburn Hills";
		website = "www.dodge.com";
		try { mintDate=new SimpleDateFormat ("yyyy-MM-dd").parse("2020");}
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

	String getMake()
	{
		return company;
	}
	
	
		
	}
	


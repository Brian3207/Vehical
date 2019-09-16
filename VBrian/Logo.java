package VBrian;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Logo
{
	public static void main(String[] args)
	{
		
		
		Model mod = new Model();
		Make mak  = new Make();
		Automobile truck = new Automobile();
		
		/*System.out.println(truck.color);
		System.out.println(truck.tireSize);
		System.out.println(truck.fuelcap);
		System.out.println(truck.modelYear);
		System.out.println(truck.speed);
		System.out.println(truck.doors);*/
		
		System.out.println(truck);
		mod.setTrimPackage(new String [] {"Wheels", "4", "MPG", "21", "Color","Teal","Seats", "8", "fuel cap","34","tonage", "3200"});
		Automobile Van = new Automobile( 8, 28, 32, 6, 32, 3200, 2018, 15000, 150, 65, 50, "Teal", "Beep", "Remote",
	            true, false, true,"Roger", "Steve's Car", mak, mod);
		
		System.out.println(Van);
	}
}

class DodgeLogo {
	 public static void main(String args[]) {
	  JFrame frame = new JFrame();
	  ImageIcon icon = new ImageIcon("");
	  JLabel label = new JLabel(icon);
	  frame.add(label);
	  frame.setDefaultCloseOperation
	         (JFrame.EXIT_ON_CLOSE);
	  frame.pack();
	  frame.setVisible(true);
	 }
	}

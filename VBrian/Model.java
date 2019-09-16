package VBrian;

import java.util.Arrays;

public class Model 

//Trim Package Details - Wheel-Count(int), MPG(int), Color, Seats(int), fuelcap(int), tonage(double)

{
	String bodytype;
	String modelName;
	String[] trimPackage;

	Model()
	{
		bodytype = "Truck";
		modelName = "Dodge";
		trimPackage = new String [] {"Wheels", "4", "MPG", "21", "Color","Electric Blue","Seats", "4", "fuel cap","34","tonage", "4.5"};
	}
	
	Model(String Bt, String Mn, String[] trimPackage)
	
	{
		bodytype = Bt;
		modelName = Mn;
		this.trimPackage = trimPackage;
	}
		
		@Override
	public String toString() {
		return "Model [bodytype=" + bodytype + ", modelName=" + modelName + ", trimPackage="
				+ Arrays.toString(trimPackage) + "]";
	}

		public String getBodytype() {
			return bodytype;
		}
		public void setBodytype(String bodytype) {
			this.bodytype = bodytype;
		}
		public String getModelName() {
			return modelName;
		}
		public void setModelName(String modelName) {
			this.modelName = modelName;
		}
		public String[] getTrimPackage() {
			return trimPackage;
		}
		public void setTrimPackage(String[] trimPackage) {
			this.trimPackage = trimPackage;
		}
		

}


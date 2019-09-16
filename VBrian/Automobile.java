package VBrian;

public class Automobile extends Vehicle

{
	public static void main(String[] args) {}
	Boolean trunk;
	Boolean AC;
	Boolean tint;
	String owner;
	String title;
	Make autoMake;
	Model autoModel;

	
	
	@Override
	public String toString() {
		return "Automobile [trunk=" + trunk + ", AC=" + AC + ", tint=" + tint + ", owner=" + owner + ", title=" + title + 
				"doors = " + getNumdoors()+ "passengers = " +super.passengers +",\n autoMake=" + autoMake + ",\n autoModel=" + autoModel + "]";
	}

	Automobile()
	{
	super();
		
	owner = "Brian";
	title = "Brian's Truck";
	trunk = true;
	AC = true;
	tint = true;
	autoMake = new Make();
	autoModel = new Model();
	updateVehicle();
	}
	
	Automobile(int p, int fC, int m, Make aM, Model aD)
	{	
	super(p,m,fC);
	
	owner = "Brian";
	title = "Brian's Truck";
	trunk = true;
	AC = true;
	tint = true;
	autoMake = aM;
	autoModel = aD;
	updateVehicle();
	}
		
	Automobile( int p, int fC, int m, int d, int tS, int t, int y, int tM, int mph, int s, int fL, String c, String h, String k,
	            boolean aC, boolean tT, boolean tR, String o, String tI, Make aM, Model aD)
	{super(p, fC, m, d, tS, t, y, tM, mph, s, fL, c, h, k);
	
	
	owner = o;
	title = tI;
	trunk = tT;
	AC = aC;
	tint =tR;
	autoMake = aM;
	autoModel = aD;
	updateVehicle();
	

	}
		int getNumdoors()
	{
			return super.doors;
	}
	
	public int getNumwheels()
	{
		String[] trimpackage = autoModel.getTrimPackage();
		int wheelCount = 4;
	try {
		wheelCount = Integer.parseInt(trimpackage[1]);
		}
	catch(Exception e) {
		System.out.println("Awesome Trim Package");
	}
	return wheelCount;
	
	}
	private void updateVehicle()
	{
		String[] trmPak = autoModel.getTrimPackage();
		int m, p, fC;
		double tonage;
		String color =trmPak[5];
	try
	{ 
		m = Integer.parseInt(trmPak[3]);
		p= Integer.parseInt(trmPak[7]);
		fC = Integer.parseInt(trmPak[9]);
	}
	
	catch (NumberFormatException e)
	{
		
		m = 12;
		p = 4;
		fC = 14;
		
		System.out.println("Awesome Trim Package");
	}
	
	try 
	{
		tonage = Double.parseDouble(trmPak[11]);
	}
	
	catch (Exception e)
	{
		tonage = .75;
		System.out.println("Awesome Trim Package");
	}
	
		super.mpg = m;
		super.passengers = p;
		super.fuelcap = fC;
		super.color = color;
		super.tonage = tonage;
	
	
	}
	
	
	public Make getAutoMake() {
		return autoMake;
	}

	public void setAutoMake(Make autoMake) {
		this.autoMake = autoMake;
	}

	public Model getAutoModel() {
		return autoModel;
	}

	public void setAutoModel(Model autoModel) {
		this.autoModel = autoModel;
	}

	public Boolean getTrunk() {
		return trunk;
	}
	public void setTrunk(Boolean trunk) {
		this.trunk = trunk;
	}
	public Boolean getAC() {
		return AC;
	}
	public void setAC(Boolean aC) {
		AC = aC;
	}
	public Boolean getTint() {
		return tint;
	}
	public void setTint(Boolean tint) {
		this.tint = tint;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	void getmakemodel() {
		// TODO Auto-generated method stub
		autoMake.getMake();
		autoModel.getModelName();

	}
	}

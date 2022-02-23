package page;

public class Main {
	public static void main(String[] args) throws InterruptedException{
		title ti = new title();
		ti.Pagetitle();
		
//		Grade gd = new Grade();
//		gd.grade(ti.driver);
//		
//		info in = new info();
//		in.infoicon(ti.driver);	
		
//		onestarreviews os = new onestarreviews();
//		os.onestar(ti.driver);
		
		sumofpercentages so = new sumofpercentages();
		so.sumof(ti.driver);
	}
}
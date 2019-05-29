package day50_inheritance03;

public class AppsFactory {
	
	public static void main(String[] args) {
		
		IPhoneApp iApp = new IPhoneApp();
		IPhoneApp iApp2 = new IPhoneApp("Uber");
		
		AndroidApp droidApp = new AndroidApp();
		AndroidApp droidApp2 = new AndroidApp("Lyft");
		
		System.out.println(iApp.getName());
		System.out.println(iApp2.getName());
		
		System.out.println(droidApp.getName());
		System.out.println(droidApp2.getName());
		
		App.count = 33;
		System.out.println(IPhoneApp.count);
		AndroidApp.count = 100;
		
		System.out.println("App.count: "+App.count);
		System.out.println("IPhoneApp.count: "+IPhoneApp.count);
		System.out.println("AndroidApp.count: "+AndroidApp.count);
		
		
		App.build("Swift");
		IPhoneApp.build("Objective C");
		AndroidApp.build("Java");
		droidApp2.build("JS");
		
	}
}

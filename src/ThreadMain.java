
public class ThreadMain {

	protected static boolean t1WantsToEnter = false;
	protected static boolean t2WantsToEnter = false;
	protected static int favoredThread = 1;
	
	public static void main(String[] args){
		System.out.println("begin");
			Thread1 t1 = new Thread1();
			Thread2 t2 = new Thread2();
			t2.start();
			t1.start();
			

		
		

}

	
	
	
}
import java.util.Random;

public class Thread1 extends Thread {

	private boolean done = false;
	private Random rand;
	public Thread1() {
		rand = new Random(System.currentTimeMillis());
		
	}

	
	public void run() {
		//while (!done)
		int ctr = 0;
		while(++ctr < 5)
		{
			ThreadMain.t1WantsToEnter = true;
			while (ThreadMain.favoredThread == 2)
			{
				
				
				//spin while other wants to enter
				while (ThreadMain.t2WantsToEnter);
						
				ThreadMain.favoredThread = 1;
				
				
			}
			
			
			System.out.println("T1 critical section");
			
			
			try {
				Thread.sleep(rand.nextInt(1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("T1 out of critical section");
			ThreadMain.t1WantsToEnter = false;
		
			
		}
	}
	
	
	
		
	}

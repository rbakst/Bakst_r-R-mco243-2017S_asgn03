import java.util.Random;

public class Thread2 extends Thread{

	private boolean done = false;
	private Random rand;
	public Thread2() {
		rand = new Random(System.currentTimeMillis());
		
	}

	public void run() {
		//while (!done)
		int ctr = 0;
		while(++ctr < 5)
		{
			ThreadMain.t2WantsToEnter = true;
			
			while (ThreadMain.favoredThread == 1)
			{
				while (ThreadMain.t1WantsToEnter);
				try {
					Thread.sleep(rand.nextInt(1000));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				ThreadMain.favoredThread = 2;
				
			}
			
			System.out.println("T2 critical section");
			
			
			System.out.println("T2 out of critical section");
			ThreadMain.t2WantsToEnter = false;
			
			
			
			}
	}
	
	
	
		
	}

/**
 * 
 */
package ved.threaddemo.multiway;

import java.util.concurrent.TimeUnit;

/**
 * @author vedbhasker.t
 *
 */
public class ThirdWay {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Main thread starts..");
		
		new ThirdTask();
		new ThirdTask();
		
		System.out.println("Main thread ends..");
	}

}

// works well in case of fire and forget
class ThirdTask implements Runnable {
	
	private static int count =0;
	private int id; 
	
	@Override
	public void run() {
		
		for (int i = 10; i >= 0	; i--) {
			
			System.out.println("<"+ id +"> TICK TICK- Third way "+i);
			
			try {
				TimeUnit.MILLISECONDS.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public ThirdTask() {
		this.id= ++count;
		
//		Thread t = new Thread(this);
//		t.start();
		
		new Thread(this).start();
	}
	
}

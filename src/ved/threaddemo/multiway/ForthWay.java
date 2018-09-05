/**
 * 
 */
package ved.threaddemo.multiway;

import java.util.concurrent.TimeUnit;

/**
 * @author vedbhasker.t
 *
 */
public class ForthWay {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Main thread starts..");
		
		new Thread(new ForthTask()).start();
		
		Thread t2 = new Thread(new ForthTask());
		t2.start();
		
		System.out.println("Main thread ends..");
	}

}

// works well in case of fire and forget
class ForthTask implements Runnable {
	
	private static int count =0;
	private int id; 
	
	@Override
	public void run() {
		
		for (int i = 10; i >= 0	; i--) {
			
			System.out.println("<"+ id +"> TICK TICK- Forth way "+i);
			
			try {
				TimeUnit.MILLISECONDS.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public ForthTask() {
		this.id= ++count;
	}
	
}

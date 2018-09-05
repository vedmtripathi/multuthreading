/**
 * 
 */
package ved.threaddemo.multiway;

import java.util.concurrent.TimeUnit;

/**
 * @author vedbhasker.t
 *
 */
public class FirstWay {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Main thread starts..");
		
		new FirstTask();
		Thread t = new FirstTask();
		
		System.out.println("Main thread ends..");
	}

}

class FirstTask extends Thread{
	
	private static int count =0;
	private int id; 
	
	@Override
	public void run() {
		
		for (int i = 10; i >= 0	; i--) {
			
			System.out.println("<"+ id +"> TICK TICK- First way "+i);
			
			try {
				TimeUnit.MILLISECONDS.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public FirstTask() {
		this.id= ++count;
		this.start();
	}
	
}

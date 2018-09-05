/**
 * 
 */
package ved.threaddemo.multiway;

import java.util.concurrent.TimeUnit;

/**
 * @author vedbhasker.t
 *
 */
public class SecondWay {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Main thread starts..");
		
		new SecondTask();
		Thread t = new SecondTask();
		t.start();
		
		System.out.println("Main thread ends..");
	}

}

class SecondTask extends Thread{
	
	private static int count =0;
	private int id; 
	
	@Override
	public void run() {
		
		for (int i = 10; i >= 0	; i--) {
			
			System.out.println("<"+ id +"> TICK TICK - Second way "+i);
			
			try {
				TimeUnit.MILLISECONDS.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public SecondTask() {
		this.id= ++count;
//		this.start();
	}
	
}

/**
 * 
 */
package ved.threaddemo.commons;

import java.util.concurrent.TimeUnit;

/**
 * @author vedbhasker.t
 *
 */
public class LoopTaskA implements Runnable {

	private static int count = 0;
	private int id;

	@Override
	public void run() {
		
		System.out.println("######## < Task-" + id + "> Starting ########");

		for (int i = 10; i >= 0; i--) {

			System.out.println("<" + id + "> TICK TICK " + i);

			try {
				TimeUnit.MILLISECONDS.sleep((long)Math.random() * 1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("######## < Task-" + id + "> Done ########");
	}

	public LoopTaskA() {
		this.id= ++count;
	}

}

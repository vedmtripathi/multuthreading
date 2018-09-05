/**
 * 
 */
package ved.threaddemo.multiway;

import java.util.concurrent.TimeUnit;

/**
 * @author vedbhasker.t
 *
 */
public class FifthWay {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Main thread starts..");

		// Anonymous implementation
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 10; i >= 0; i--) {

					System.out.println(" TICK TICK- Fifth way " + i);

					try {
						TimeUnit.MILLISECONDS.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});

		t.start();

		// Anonymous implementation
		new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 10; i >= 0; i--) {

					System.out.println(" TICK TICK- Fifth way " + i);

					try {
						TimeUnit.MILLISECONDS.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}).start();

		System.out.println("Main thread ends..");
	}

}
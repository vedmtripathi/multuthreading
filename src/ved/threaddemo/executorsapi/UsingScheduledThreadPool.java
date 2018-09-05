/**
 * 
 */
package ved.threaddemo.executorsapi;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import ved.threaddemo.commons.LoopTaskA;

/**
 * @author vedbhasker.t
 *
 */
public class UsingScheduledThreadPool {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Main thread starts..");
		
		ScheduledExecutorService executorService = Executors.newScheduledThreadPool(10);
		
		executorService.schedule(new LoopTaskA(), 2, TimeUnit.SECONDS);
		
		executorService.scheduleAtFixedRate(new LoopTaskA(), 2, 5, TimeUnit.SECONDS);
		
		executorService.scheduleWithFixedDelay(new LoopTaskA(), 2, 5, TimeUnit.SECONDS);
		
		executorService.shutdown();
		
		System.out.println("Main thread ends..");
		
	}

}

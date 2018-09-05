/**
 * 
 */
package ved.threaddemo.executorsapi;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import ved.threaddemo.commons.LoopTaskA;

/**
 * @author vedbhasker.t
 *
 */
public class GetCountAvailableCPUCore {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Main thread starts..");
		
		// get count of available CPU core
		int count = Runtime.getRuntime().availableProcessors();
		System.out.println("count of available CPU core.."+count);

		ExecutorService executorService = Executors.newFixedThreadPool(count);

		executorService.execute(new LoopTaskA());
		executorService.execute(new LoopTaskA());
		executorService.execute(new LoopTaskA());

		executorService.execute(new LoopTaskA());
		executorService.execute(new LoopTaskA());
		executorService.execute(new LoopTaskA());

		executorService.shutdown();

		System.out.println("Main thread ends..");

	}

}

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
public class UsingCachedThreadPool {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Main thread starts..");
		
		ExecutorService executorService = Executors.newCachedThreadPool();
		
		executorService.execute(new LoopTaskA());
		executorService.execute(new LoopTaskA());
		executorService.execute(new LoopTaskA());
		
		executorService.execute(new LoopTaskA());
		executorService.execute(new LoopTaskA());
		executorService.execute(new LoopTaskA());

		executorService.shutdown();
		
		// java.util.concurrent.ThreadPoolExecutor$AbortPolicy.rejectedExecution(Unknown Source)
//		executorService.execute(new LoopTaskA());
		
		System.out.println("Main thread ends..");

	}

}

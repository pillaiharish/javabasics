package javabasics;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream; 

import org.junit.Test;

import synchronizedkeyword.SynchronizedExample;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@Test
	public void givenMultiThread_whenNonSyncMethod() throws InterruptedException {
	    ExecutorService service = Executors.newFixedThreadPool(3);
	    SynchronizedExample method = new SynchronizedExample();

	    IntStream.range(0, 1000)
	      .forEach(count -> service.submit(method::calculate));
	    service.awaitTermination(1000, TimeUnit.MILLISECONDS);

	    assertEquals(1000, method.getSum());
	}
    
    @Test
    public void shouldAnswerWithTrue() throws InterruptedException
    {
    	ExecutorService service = Executors.newFixedThreadPool(3);
        SynchronizedExample method = new SynchronizedExample();

        IntStream.range(0, 1000)
          .forEach(count -> service.submit(method::synchronisedCalculate));
        service.awaitTermination(1000, TimeUnit.MILLISECONDS);

        assertEquals(1000, method.getSum());
    }
}

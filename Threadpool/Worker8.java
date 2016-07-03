package threads.Threadpool;

public class Worker8 implements Runnable {
	@Override
	public void run() {
		Thread.currentThread().setName("Worker8");
		System.out.println(Thread.currentThread().getName()+"Start");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"End");
	}
}

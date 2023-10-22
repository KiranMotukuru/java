//Internal thread Communication
public class ThreadA {

	public static void main(String[] args) throws InterruptedException {
		// child
		ThreadB b = new ThreadB();
		b.start();
		Thread.sleep(0);
		

		synchronized (b) {
			System.out.println(Thread.currentThread().getName() + " ...thread Call wait Method");

			b.wait(1);
			System.out.println(" main thread got Notifiaction");
			System.out.println(b.total);
		}

	}

}
 
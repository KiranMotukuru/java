package DeadLock;

public class DeadLock1 extends Thread {
	A a = new A();
	B b = new B();

	public void m1() {
		this.start();
		System.out.println();
		a.d1(b);
	}

	@Override
	public void run() {
		b.d2(a);
	}

	public static void main(String[] args) {
		

		DeadLock1 d = new DeadLock1();
		d.m1();
	}

}
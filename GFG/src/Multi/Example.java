package Multi;

public class Example {

	public void print() {
		synchronized (this) {
			System.out.println("starting " + Thread.currentThread().getName());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Ending " + Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		Example example = new Example();
		Thread t1 = new Thread(new A(example));
		Thread t2 = new Thread(new B(example));
		t1.start();
		t2.start();
	}
}

class A implements Runnable {
	private Example example;

	public A(Example example) {
		this.example = example;
	}

	@Override
	public void run() {
		example.print();
	}
}

class B implements Runnable {

	private Example example;

	public B(Example example) {
		this.example = example;
	}

	@Override
	public void run() {
		example.print();
	}
}
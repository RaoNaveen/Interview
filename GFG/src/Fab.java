
public class Fab {
	public int a;
	
	public static void  method(Fab fab) {
		fab.a=10;
	}

	@Override
	public String toString() {
		return "Fab [a=" + a + "]";
	}

	public static void main(String[] args) {
		Fab fab=new Fab();
		method(fab);
		System.out.println(fab);
	}
}

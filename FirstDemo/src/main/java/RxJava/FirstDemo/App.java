package RxJava.FirstDemo;

/**
 * Hello world!
 * Local
 * remote
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		System.out.println("local");
		System.out.println("remote");
		System.out.println("hello from member 1");
		System.out.println("hello from member 2");
	}
	
	public void mLocal() {
		String s="Local changes";
	}
	
	public void mRemote() {
		String s="Remote changes";
	}
}

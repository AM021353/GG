package Thread;

public class ThreadTest {

	public static void main(String[] args) {
		Thread a = Thread.currentThread();
		System.out.println("執行緒名稱:"+a.getName());
		System.out.println("執行緒priority為:"+a.getPriority());
		a.setName("The main thread");
		System.out.println("改名後的執行緒名稱:"+a.getName());

	}

}

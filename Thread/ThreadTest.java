package Thread;

public class ThreadTest {

	public static void main(String[] args) {
		Thread a = Thread.currentThread();
		System.out.println("������W��:"+a.getName());
		System.out.println("�����priority��:"+a.getPriority());
		a.setName("The main thread");
		System.out.println("��W�᪺������W��:"+a.getName());

	}

}

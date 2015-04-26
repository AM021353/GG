package Thread;

public class Thread3 {

	public static void main(String[] args) {
		Thread a = Thread.currentThread();
		new Thread3A();
		int i;
		for(i=0;i<10;i++){
			System.out.println("main()");
			a.yield();
		}
	}
}
class Thread3A implements Runnable{
	Thread c;
	Thread3A(){
		c = new Thread(this);
		c.start();
	}
	public void run(){
		int i;
		for(i=0;i<10;i++){
			System.out.println("±Ò°Ê");
			c.yield();		
		}
	}
}

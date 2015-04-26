package Thread;

public class Thread2 {

	public static void main(String[] args) {
		Thread a = Thread.currentThread();
		new Thread1A();
		int i;
		for(i=0;i<10;i++){
			System.out.println("main()");
			try{
				a.sleep(1000);
			}catch(Exception e){}
		}
	}
}
class Thread1A implements Runnable{
	Thread c;
	Thread1A(){
		c = new Thread(this);
		c.start();
	}
	public void run(){
		int i;
		for(i=0;i<10;i++){
			System.out.println("±Ò°Ê");
			try{
				c.sleep(1000);
			}catch(Exception e){}
		}
	}
}

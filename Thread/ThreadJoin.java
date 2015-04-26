package Thread;

public class ThreadJoin {

	public static void main(String[] args) {
		Thread a = Thread.currentThread();
		JoinThread b = new JoinThread();
		int i;
		for(i=0;i<10;i++){
			System.out.println("main()");
			try{
				a.sleep(1000);
			}catch(Exception e){}
		}
		System.out.println("main finished,wait");
		try{
			b.getThread().Join();
		}catch(Exception e){}
		System.out.println("ALL finished");
	}

}
class JoinThread implements Runnable(){
	Thread c;
	JoinThread(){
		c = new Thread(this);
		c.start();
	}
	public Thread getThread(){
		return c;
	}
	public void run(){
		int i;
		for(i=0;i<20;i++){
			System.out.println("±Ò°Ê");
			try{
				a.sleep(1000);
			}catch(Exception e){}
		}
	}
}

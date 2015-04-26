package Thread;

public class Thread1 {

	public static void main(String[] args) {
		Thread a = Thread.currentThread();
		Thread01 b = new Thread01();
		b.start();
		int i;
		for(i=0;i<10;i++){
			System.out.println("main()");
			try{
				a.sleep(1000);
			}
			catch(Exception e){}
		}

	}

}
class Thread01 extends Thread{
	public void run(){
		int i;
		for(i=0;i<10;i++)
			System.out.println("°õ¦æºü±Ò°Ê");
		try{
			this.sleep(1000);
		}
		catch(Exception e){}
		
	}
}

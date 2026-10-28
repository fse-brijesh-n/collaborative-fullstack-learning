public class App 
{
	public static void main(String[] args) 
	{
		class Task implements Runnable
		{
			public void run()
			{
				for(int num=10;num>=1;num--)
				{
					System.out.println(num);
					try {
						Thread.sleep(1000);
					}catch(Exception ex) {}
				}
			}
		}
		Thread th=new Thread(new Task());
		th.start();
		
	}
}

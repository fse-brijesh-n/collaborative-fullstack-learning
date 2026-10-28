public class App2 
{
	public static void main(String[] args) 
	{
		Thread th=new Thread(()->{
			for(int num=10;num>=1;num--)
			{
				System.out.println(num);
				try {
					Thread.sleep(1000);
				}catch(Exception ex) {}
			}
		});
		th.start();
		
	}
}

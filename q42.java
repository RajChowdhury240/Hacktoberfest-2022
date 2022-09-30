import java.io.*;

class q42
{
	public static void main (String[] args) throws InterruptedException {
    final Addition a=new Addition();

    Thread t1 = new Thread(new Runnable()
    {
        public void run()
		{
            try 
			{

			   a.add(1,500,1); 
            } 
			catch(Exception e) 
			{
            }
        }
    });

    Thread t2 = new Thread(new Runnable()
    {
        public void run()
		{
            try 
			{
				a.add(501,1000,2);
            } 
			catch(Exception e) 
			{
            }
        }
    });

    t1.start();
    t2.start();

    t1.join();
    t2.join();
}

   public static class Addition{
    int a, b;
    private int sum=0;

    public void add(int a, int b, int id) throws InterruptedException{
        System.out.println("INIT ADD t:[" + id + "]");

        synchronized(this){
            for (int i=a;i<=b;i++){
                System.out.println("Sum Before thread:[" + id + "] i:[" + i + "]=" + sum);
                sum=sum + i;
                System.out.println("Sum After thread:[" + id + "] i:[" + i + "]=" + sum);
                Thread.sleep(10);
            }
        }
        System.out.println("Sum t:[" + id + "]=" + sum);
     }

  }
}
interface Course
  {
    void start();
  }
  
  class Dac implements Course
{

	public void start()
	{
		System.out.println("Here is Dac Course");
	}
	
}

  class pgDbda implements Course
{

	public void start()
	{
		System.out.println("Here is pgDbda Course");
	}
	
}

  class MSCIT implements Course
{

	public void start()
	{
		System.out.println("Here is MSCIT Course");
	}
	
}

public class CourseDemo
  {
    public static void main(String args[]){
	   Course arr[]=new Course[3];
	   arr[0]=new Dac();
	   arr[1]=new pgDbda();
	   arr[2]=new MSCIT();
	   
	   for(int=0;i<=arr.length-1;i++)
	   {
	        arr[i].start();
	   }
	   
	
  }
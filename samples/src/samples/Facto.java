package samples;

public class Facto {
	int ar,br;
	
	
	void facto(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("the factorial is:"+fact);
	}
	void addition()
	{
		int a=1,b=3;
		int c;
		c=a*b;
		System.out.println("Added value is:"+c);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Facto fa=new Facto();
		fa.facto(6);
fa.addition();


	}

}

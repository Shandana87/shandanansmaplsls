package samples;

public class Factorial {
	
void fact(int n)
{
	int i,fact;
	fact=1;
	
	for(i=1;i<=n;i++)
	{
		fact=fact*i;
	}
	System.out.println(+fact);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial f1=new Factorial();
		f1.fact(6);
		

	}

}

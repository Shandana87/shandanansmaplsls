
public class iftest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]={20,10,56,34,85,7,46,93,87};

iftest g=new iftest();
//g.max(a);
int e=10,d=200;
//g.greater(e,d);
g.min(a);

//int c=g.greater(e,d);
//System.out.println(+c); 
	}

	void greater(int l,int b)
	{
		
		int c=l*b;
		System.out.println(+c);	
		
	}
	void min(int a[])
	{
		int min=a[0];
		int i;
		for(i=0;i<=8;i++)
		{
			if(min>a[i])
			{
				min=a[i];
				System.out.println(min);		
			}
			
		}
	}
	
		
	}
	


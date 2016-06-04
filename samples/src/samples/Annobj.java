package samples;

public class Annobj {
	void fact(int n)
	{
		int fact=1;
		for(int i=0;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("fact is" +fact);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

new Annobj().fact(6);
	}

}

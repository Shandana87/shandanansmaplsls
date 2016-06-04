package samples;

public class StudSamp {
	int length;
	int breath;
	void getinfo(int r,int names)
	{
		length=r;
		breath=names;
	}
	
void displayinfo()
{
	System.out.println("The area of rect is"+length * breath );
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
StudSamp s1 = new StudSamp();
StudSamp s2 =new StudSamp();
s1.getinfo(101, 20);
s1.displayinfo();
s2.getinfo(2000, 100);
s2.displayinfo();

	}

}

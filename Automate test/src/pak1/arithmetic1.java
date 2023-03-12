package pak1;



public class arithmetic1 {
	int s;
	public int sum(int a,int b)
	{
		int s=a+b;
		System.out.println("Addition of num"+s);
		return s;
		
	}
	public int sub(int c, int d)
	{
		int sb;
		sb=c-d;
		System.out.println("Subtraction of the num"+sb);
		return sb;
	}
	public int multi(int g, int h)
	{
		int m;
	 m =g*h;

		System.out.println("multipy of the num" +m );
	return m;
	}
	public int div(int j,int k)
	{
		int i;
		i=j/k;
		System.out.println("divide of the num"+i);
		return i;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arithmetic1 obj= new arithmetic1();
	       int result1=obj.sum(10, 2);
	       int result2=obj.sum(result1, 2);
	       int result3=obj.sub(result2, 2);
	       int result4=obj.multi(result3, 2);
	      int result5= obj.div(result4,2);
	      System.out.println( "final result of ((10+2)+2)-2)*2)/2)===="  +obj.div(result4, 2));
	      
	}

}

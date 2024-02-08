public class MathUtils
{
	public int add(int a,int b)
	{
	return a+b;}
	public int subtract(int a,int b){
	return a-b;}
	public int multiply(int a,int b){
	return a*b;}
	public double divide(int a,int b)
	{ 
		if(b==0)
			return -1;
		else
			return (double)a/b;
	}
public static void main(String[] args)
{
	MathUtils mu=new MathUtils();
	System.out.println(mu.add(1,3));
    System.out.println(mu.subtract(1,3));
    System.out.println(mu.multiply(1,3));
    System.out.println(mu.divide(6,3));
	
}
}


	
package TypeConversion;

public class ExplicitTypeConversion 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		double d = 200.04;
		long l = (long)d;
		int i = (int)l;
		float f=(float)i;
		System.out.println("Double value: "+d);
		System.out.println("Long value: "+l);
		System.out.println("Int value: "+i);
		System.out.println("Float value: "+f);
}
}

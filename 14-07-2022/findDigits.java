import java.util.*;
class findDigits{

public static void main(String args[])
{
	int num,digit=0,dummy;
	Scanner bs=new Scanner(System.in);
	num=bs.nextInt();
	dummy=num;
	while(num!=0)
	{
		num=num/10;
		digit++;
	}
	System.out.println("The number of digits in"+dummy+" is "+digit);

}
}
/*
read three values from the user 

first and second values for the operation

third value is for selection of operation

if user press 1 => print addition of first and second
if user press 2 => print subtraction of first and second
if user press 3 => print multiplication of first and second
if user press 4 => print division of first and second

*/
import java.util.Scanner;
class calc{

public static void main(String args[])
{
	calc obj=new calc();//object for calc class
	Scanner bs=new Scanner(System.in);//object scanner
	
	int a,b, op,result=0;
	System.out.println("Enter first value");
	a=bs.nextInt();
	System.out.println("Enter second value");
	b=bs.nextInt();
	System.out.println("Press 1 for Addition \n press 2 for subtraction");
	op=bs.nextInt();
	//based on op value calling different methods
	switch(op)
	{
		case 1:result=obj.addition(a,b);
		break;
		case 2: result=obj.subtraction(a,b);
		break;
		default:System.out.println("Invalid Option");
	}
	System.out.println("Result :"+result);
}
public int addition(int a,int b)
{
	return a+b;
	//returning int value
}
public int subtraction(int a,int b)
{
	return a-b;
}
}
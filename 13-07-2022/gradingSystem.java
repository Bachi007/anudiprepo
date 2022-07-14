/*score >=35<=50 => D grade
score >50 <=70 => c grade
score >70<=80  => B grade
score >80<=90  => A grade
score>90 => O grade

*/
class gradingSystem{
	public static void main(String args[])
	{
		int score=105;
		if(score >35 && score<=50)
		{
			System.out.println("D grade");
		}
		else if(score>50 && score<=70)
		{
			System.out.println("C grade");
		}
		else if(score>70 && score<=80)
		{
			System.out.println("B grade");
		}
		else if(score>80 && score<=90)
		{
			System.out.println("A grade");
		}
		else if(score>90 && score<=100)
		{
			System.out.println("O grade");
		}
		else{
			System.out.println("Invalid Score");
		}
	}
}
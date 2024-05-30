import java.util.Scanner;

public class DoWhileMax{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		
		
		int max =0;
		int num=0;
		
		do{
			System.out.print("숫자 입력 (마지막은 0) : ");
			num =sc.nextInt();
	
			if(num > max) 
				max=num;
					
	
		} while (num != 0); //true 조건 


		System.out.print(max);
	}
}	
import java.util.Scanner;

public class DoWhileMax{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		
		
		int max =0;
		int num=0;
		
		do{
			System.out.print("���� �Է� (�������� 0) : ");
			num =sc.nextInt();
	
			if(num > max) 
				max=num;
					
	
		} while (num != 0); //true ���� 


		System.out.print(max);
	}
}	
package ATM_MACHINE;
import java.util.Scanner;

public class MAINCLASS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AtmOperationInterf op=new AtmOperationImpl();
		int atmnumber=123;
		int atmpin=123;
		Scanner scan=new Scanner(System.in);
		System.out.println("Welcome to ATM Machine!!!!!");
		System.out.print("Enter the ATM number: ");
		int Atmnumber=scan.nextInt();
		System.out.print("Enter the PIN number: ");
		int Atmpin=scan.nextInt();
		if((atmnumber==Atmnumber)&&(atmpin==Atmpin)) {
			while(true) {
				System.out.println("1.VIEW AVAILABLE BALANCE\n2.WITHDRAW AMOUNT\n3.DEPOSIT AMOUNT\n4.VIEW MINI STATEMENT\n5.EXIT");
				System.out.println("Enter your choice : ");
				int ch=scan.nextInt();
				if(ch==1) {
					op.viewbalance();
				}
				else if(ch==2) {
					System.out.println("Enter the withdraw amount :");
					double withdrawAmount=scan.nextDouble();
					op.withdrawAmount(withdrawAmount);
					
				}
				else if(ch==3) {
					System.out.println("Enter the deposit ammount :");
					double depositAmount=scan.nextDouble();
					op.depositAmount(depositAmount);
					
				}
				else if(ch==4) {
					op.viewMiniStatement();
				}
				else if(ch==5) {
					System.out.println("Collect your atm card \n Thank you for using ATM Machine");
					System.exit(0);
					
				}
				else {
					System.out.println("Please enter correct choice");
				}
				}
		}
		else {
			System.out.println("Incorrect ATM number or PIN");
			System.exit(0);
		} 
	}

}

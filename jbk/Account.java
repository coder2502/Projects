package jbk;
import java.util.Scanner;
public class Account {
	int choice ;
	int pin=1234;
	int SavingAccbalance=10000;
	int CurrentAccbalance=20000;
	String WantPrint;
	int accChoice;
	Scanner sc= new Scanner(System.in);
	public void selectAcc() {
		System.out.println("selct 1 for saving acc 2 for current acc");
		int accChoice=sc.nextInt();
		switch (accChoice) {
		case 1:
			System.out.println("you are in saving account");
			System.out.println("selct 1 for withdrawl 2 for statement 3 for change  pin");
			int choice=sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("you choose withdrawl");
				System.out.println("enter your pin");
				int urpin=sc.nextInt();
				if(urpin==pin) {
					System.out.println("enter amount ");
					int amount=sc.nextInt();
					if(SavingAccbalance>=amount) {
						SavingAccbalance-=amount;

						System.out.println("you want print");
						String wantPrint=sc.next();
						if(wantPrint=="y") {
							System.out.println(SavingAccbalance);
						}
						else if (wantPrint=="n") {
							System.out.println("Thank you for Saving tree");

						}
						else
							System.out.println("......");

					}
					else
						System.out.println("Account me paise nahi hai bhai");
					System.out.println("you suceesfully completed transition thank you for banking with us!!!! your accout balance is  "+SavingAccbalance);
				}


				else
					System.out.println("Wrong pin");
				break;
			case 2:
				System.out.println("your acount balance is "+SavingAccbalance);
				System.out.println("thank you !!!!!! have A nice day....");
				break;
			case 3:
				System.out.println("enter your old pin");
				int oldPin=sc.nextInt();
				if(oldPin==pin)
				{
					System.out.println("enter new pin");
					int newPin=sc.nextInt();
					pin=newPin;
					System.out.println("pin change succesfully");
					System.out.println("thank you !!!!!! have A nice day....");
				}
				else
					System.out.println("you enterd wrong pin pls try again");
				break;


			}
			break;






		case 2:
			System.out.println("you are in current account");
			System.out.println("selct 1 for withdrawl 2 for statement 3 for change  pin");
			int choice1=sc.nextInt();
			switch (choice1) {
			case 1:
				System.out.println("enter pin");
				int urpin=sc.nextInt();
				if(urpin==pin) {
					System.out.println("enter amount ");
					int amount=sc.nextInt();
					if(CurrentAccbalance>=amount) {
						CurrentAccbalance-=amount;

						System.out.println("you want print");
						String wantPrint=sc.next();
						if(wantPrint=="y") {
							System.out.println(CurrentAccbalance);
						}
						else if (wantPrint=="n") {
							System.out.println("Thank you for Saving tree");

						}
						else
							System.out.println("......");

					}
					else
						System.out.println("Account me paise nahi hai bhai");
					System.out.println("you suceesfully completed transition thank you for banking with you your accout balance is  "+CurrentAccbalance);
				}


				else
					System.out.println("Wrong pin");
				break;
			case 2:
				System.out.println("your acount balance is "+CurrentAccbalance);
				System.out.println("thank you !!!!!! have A nice day....");
				break;
			case 3:
				System.out.println("enter your old pin");
				int oldPin=sc.nextInt();
				if(oldPin==pin)
				{
					System.out.println("enter new pin");
					int newPin=sc.nextInt();
					pin=newPin;
					System.out.println("pin change succesfully");
					System.out.println("thank you !!!!!! have A nice day....");
				}
				else
					System.out.println("you enterd wrong pin pls try again");
				break;
			}

		}

	}
}






public class BankAccountTester {
public static void main(String[] args){
	BankAccount Test=new BankAccount(0);
	Test.deposit(2);
	Test.withdraw(1);
	System.out.println(Test.getBalance());
}
}

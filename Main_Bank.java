
public class Main_Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount SA=new SavingsAccount();
		CurrentAccount CA=new CurrentAccount();
		SA.checkBankBalance();
		SA.validateUser();
		System.out.println("------------------------------------------");
		CA.checkBankBalance();
		CA.validateUser();

	}

}

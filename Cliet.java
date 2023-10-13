
public class Cliet {

	public static void main(String[] args) {
		
		        BankAccount account = new BankAccount(1000); // Initial balance
		        ATM atm = new ATM(account);
		        atm.run();  
			}
		}
	

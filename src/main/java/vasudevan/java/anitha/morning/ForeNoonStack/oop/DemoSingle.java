package vasudevan.java.anitha.morning.ForeNoonStack.oop;

import java.util.Arrays;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class DemoSingle {
	public static void main(String[] args) {
		Operations op1=new Operations();
		
		op1.setHolder("Razak Mohamed");op1.setBalance(1000);
		op1.setNumber(76545678764L);
		
		System.out.println(op1);
		
		op1.withdraw(500);
		op1.withdraw(100);
		op1.withdraw(500);
		
		op1.deposite(20000);
		op1.deposite(3000);
		
		op1.withdraw(12500);
		
		System.out.println(op1);
	}
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Bank{
	private String holder;
	private long number;
	private double balance;
}

@Data
class Operations extends Bank{
	private double[] transactions=new double[10];
	int count=0;
	
	public String toString() {
		return super.toString()+" "+Arrays.toString(transactions);
	}
	
	public void withdraw(int userAmount) {
		if(getBalance()>=userAmount) {
			setBalance(getBalance()-userAmount);
			transactions[count]=getBalance();
			count++;
		}
		else {
			System.out.println(getHolder()+" doesn't have enough balance in "+getNumber());
		}
	}
	
	public void deposite(int userAmount) {
		setBalance(getBalance()+userAmount);
		transactions[count]=getBalance();
		count++;
	}
}
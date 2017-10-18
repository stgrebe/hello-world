package myJava;

public class Money {
	private double amount;
	private String currency;

	public Money(double amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	public double getAmount() {
		return this.amount;
	}

	public String getCurrency() {
		return this.currency;
	}

	public Money add(Money oMoney) {
		return new Money(this.amount + oMoney.getAmount(), this.currency);
	}

	public boolean equals(Object aObject) {
		if (aObject instanceof Money) {
			Money aMoney = (Money) aObject;

			return aMoney.getCurrency().equals(this.currency)
					&& aMoney.getAmount() == this.amount;
		}

		return false;
	}
}

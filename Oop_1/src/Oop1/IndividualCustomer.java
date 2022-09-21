package Oop1;
/*
 Burada sadece bireysel müşterilere ait bilgiler tutulur. ve kurumsal müşterilerle ORTAK olan özellikler
 ana müşteri sınıfımızdan miras alınır dersteki genişletmek (extends Customer) bu manaya gelir 
  
 */
public class IndividualCustomer extends Customer {
	private String firstName;
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}

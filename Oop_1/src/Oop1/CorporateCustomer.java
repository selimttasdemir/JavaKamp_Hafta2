package Oop1;
/*
Burada sadece kurumsal müşterilere ait bilgiler tutulur. ve bireysel müşterilerle ORTAK olan özellikler
ana müşteri sınıfımızdan miras alınır dersteki genişletmek (extends Customer) bu manaya gelir 
 
*/
public class CorporateCustomer extends Customer {
	private String companyName;
	private String taxNumber;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getTaxNumber() {
		return taxNumber;
	}

	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}

}

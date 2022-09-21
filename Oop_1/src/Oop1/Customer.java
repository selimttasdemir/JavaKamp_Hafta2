package Oop1;
/* müşteriler adı altında genel bir sınıf oluşturup burada genel özellikler 
 tutulur ardından bireysel ve kurumsal olmak üzere iki farklı müşteri sınıfı buradaki ana sınıftan miras alır (inheritance)
 şimdi o sınıflara bakalım 
 * */
public class Customer {
	private int id;
	private String customerNumber;
	private String phone;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}

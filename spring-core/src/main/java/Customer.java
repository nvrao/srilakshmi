
public class Customer {
	private int id;
	private String name;
	private String address;
	private double balance;
	public Customer(int id, String name, String address, double balance) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.balance = balance;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", address=" + address + ", balance=" + balance + "]";
	}
	

}

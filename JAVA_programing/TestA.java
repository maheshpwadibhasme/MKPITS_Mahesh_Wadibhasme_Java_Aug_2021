//A Account class which is a fully encapsulated class.
//It has a private data member and getter and setter methods.
class Account{
	private long acc_no;
	private String name,email;
	private float amount;

	public void setAcc_no(long acc_no){
		this.acc_no=acc_no;
	}
	public long getAcc_no(){
		return acc_no;
	}

	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}

	public void setEmail(String email){
		this.email=email;
	}
	public String getEmail(){
		return email;
	}

	public void setAmount(float amount){
		this.amount=amount;
	}
	public float getAmount(){
		return amount;
	}
}
class TestA{
	public static void main(String[] args){
		Account a=new Account();
		a.setAcc_no(123456789L);
		System.out.println("Account No ="+a.getAcc_no());

		a.setName("mahesh");
		System.out.println("Name ="+a.getName());

		a.setEmail("maheshp@gmail.com");
		System.out.println("Email ="+a.getEmail());

		a.setAmount(12000);
		System.out.println("Amount ="+a.getAmount());
	}
}

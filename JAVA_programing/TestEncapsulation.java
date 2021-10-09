class User{
	private String userName;
	private String password;

	public void setUserName(String userName){
		this.userName=userName;
	}
	public String getUserName(){
		return userName;
	}

	public void setPassword(String password){
		this.password=password;
	}
	public String getPassword(){
		return password;
	}

	public String checkLogin(String userName,String password){
		if(userName.equals("admin") && password.equals("admin")){
			return "login successful for user " + userName;
		}else{
			return "invalid credentials , try again !";
		}
	}
}
public class TestEncapsulation{
	public static void main(String[] args){
		User u=new User();
		java.util.Scanner scan=new java.util.Scanner(System.in);

		System.out.println("Enter User Name = ");
		String un=scan.next();

		System.out.println("Enter Password = ");
		String pwd=scan.next();

		u.setUserName(un);
		u.setPassword(pwd);

		String result=u.checkLogin(u.getUserName(),u.getPassword());
		System.out.println(result);
	}
}

/*
Q6. Consider a CUI based application, where you are asking a user to enter his Login name and password, 
after entering the valid user-id and password it will print the message �Welcome� along with user name. 
As per the validation is concerned, the program should keep a track of login attempts. 
After three attempts a message should be flashed saying �Contact Admin� and the program should terminate.              
*/
import java.util.*;
class Login{
    String userId = "Ajay",password = "password";
    Scanner sc = new Scanner(System.in);
    int count=0;
    public String getUser()
    {
    	System.out.println("Enter UserId");
		String user=sc.next();
		return user;
    }
    public String getPassword()
    {
    	System.out.println("Enter Password");
	    String  pass=sc.next();
	     return pass;
    }
    public String loginUser(String user, String pass) {
    	
    	  user=getUser();
		  pass=getPassword();
		  
    if(user.equals(userId) && pass.equals(password))
    {
    	System.out.println(" Hello ");
    	return " welcome "+"  "+user;
    }
    else
    {
    	count++;
	    if(count<3)
	    {
	       System.out.println("You have entered wrong credentials ,please enter the right credentials.");
	       loginUser(user,pass);
	       
	    }
    }
	    return "You have entered wrong credentials 3 times"+"\n"+"Contact Admin";
    }

}
public class Assignment1Q6 {

	public static void main(String[] args) {
		Login user=new Login();
		String userId="",password="";
		
		System.out.println(user.loginUser(userId, password));
	}

}
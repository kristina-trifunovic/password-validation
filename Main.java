import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main
{
    
    public static void Password_Validation(String password) {
    if(password.length() >= 6) {
        Pattern lowerLetter = Pattern.compile("[a-z]+");
        Pattern upperLetter = Pattern.compile("[A-Z]+");
        Pattern digit = Pattern.compile("[0-9]+");
        Pattern special = Pattern.compile ("[!@#$%^&*()-+]+");
        //Pattern six = Pattern.compile (".{6}");


           Matcher hasUpperLetter = upperLetter.matcher(password);
           Matcher hasLowerLetter = lowerLetter.matcher(password);
           Matcher hasDigit = digit.matcher(password);
           Matcher hasSpecial = special.matcher(password);

           if(hasUpperLetter.find() && hasLowerLetter.find() && hasDigit.find() && hasSpecial.find()) {
               System.out.println("Pass is valid");
           } else {
               System.out.println("Pass is invalid");
           }
           

    }
    else
        System.out.println("Pass is invalid, contains less than 6 characters");;
}
    
    
	public static void main(String[] args) {
		Password_Validation("Kristina98!");
		Password_Validation("Kristina!");
		Password_Validation("Kika!");
	}
}


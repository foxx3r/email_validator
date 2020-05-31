import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class EmailValidator {
    public static void main(String args[]) {
        Scanner email_instance = new Scanner(System.in);
        System.out.print("Enter the email: ");
        String email = email_instance.nextLine();
        String pattern = "^\\w+@[a-zA-Z_]+?\\.[a-zA-Z]{2,3}$";
        Pattern regex = Pattern.compile(pattern);

        Matcher matcher = regex.matcher(email);
        if (matcher.matches()) {
            System.out.println("Valid email");
        } else {
            System.out.println("This email is not correct");
        }
    }
}

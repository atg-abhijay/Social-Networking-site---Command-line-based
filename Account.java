import java.util.ArrayList;
import java.util.Scanner;
public class Account {
    private String realName;
    private int age;
    private String gender;
    private String picture;
    private String email;
    private String password;
    private String alias;
    private ArrayList<Account> friends;

    public Account() {
        Scanner reader = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = reader.next();
        System.out.println("What is your age?");
        int age = reader.nextInt();
        System.out.println("What is your gender? (M/F)");
        String gender = reader.next();
        System.out.println("What is your email ID?");
        String emailID = reader.next();
        System.out.println("Please make a new password for your account");
        String password = reader.next();
        System.out.println("What is your alias?");
        String alias = reader.next();
        System.out.println("Are these details correct? (y/n)");
        String answer = reader.next();
        if(!answer.equals("y") && !answer.equals("n")) {
            System.out.println("You must answer using 'y' or 'n'!");
        }
        if(answer.equals("y")) {
            this.realName = name;
            this.age = age;
            this.gender = gender;
            this.email = emailID;
            this.password = password;
            if(alias.equals("null")) {
               this.alias = "";
            }
            System.out.println("Congratulations! You have made your profile!");
            if(this.gender.equals("M")) {
                this.picture = "[[>_<]]";
            }
            else {
                this.picture = "[[[>.<]]]";
            }
            System.out.println(this.picture + "  " + this.realName + "\n" + "   Age: " + this.age + "    " + this.gender);
            System.out.println();
        }
        else {
            System.out.println("Do you wish to re-enter the details? (y/n)");
            String reenter = reader.next();
            if(reenter.equals("y")) {
                //this.Account();  >>>>>>>>> call the constructor again
            }
            else {
                System.out.println("Thank you for using this site!");
                return;
            }
        }
    }

    public String getName() {
        return this.realName;
    }

    private void displayProfile(Account person) {
        if(friends.contains())
        System.out.println(this.picture + "  " + this.realName + "\n" + "   Age: " + this.age + "    " + this.gender);
        System.out.println();
    }

    private boolean contains(Account person) {
        
        if friends.contains()
    }
}
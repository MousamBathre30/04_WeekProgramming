package advancedproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractProgrammingLanguage {
    public static String extractProgramming(){
        String text = "I love Java, Python, and javaScript, but I haven't tried Go yet.";
        String[] programmingLangauge = {"Java", "Python", "javaScript", "Go"};

        StringBuilder ans = new StringBuilder();
        for(int i=0; i<programmingLangauge.length; i++){
            String regex = programmingLangauge[i];
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);
            while(matcher.find()){
               ans.append(matcher.group()).append(" ");
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        System.out.println(extractProgramming());
    }

    public static class BankAccount {
       static double initial_Amount = 0;
        public static String deposite(double amount){
            if(amount < 0){
                return "Amount is less then 0";
            }
            initial_Amount += amount;
            return "Deposite Done";
        }

        public static double withdraw(double amount){
            if(amount > initial_Amount){
                System.out.println("not sufficient amount");
                return 0;
            }
            initial_Amount -= amount;
            return initial_Amount;
        }

        public static double getBalance(){
            return initial_Amount;
        }

        public static void main(String[] args) {
            System.out.println(deposite(1200));
            System.out.println("amount after withdraw "+withdraw(200));
            System.out.println(getBalance());
        }
    }
}


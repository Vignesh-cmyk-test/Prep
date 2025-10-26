package prep;
public class ReverseNumber {
    public static void main(String[] args) {
        int num = 12345986;  
        int rev = 0;      

        while (num != 0) {
            int digit = num % 10;     // step 1: get last digit
            rev = rev * 10 + digit;   // step 2: add digit to reverse
            num = num / 10;           // step 3: remove last digit
        }

        System.out.println("Reversed Number: " + rev);
    }
}

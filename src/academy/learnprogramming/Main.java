package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);

        char myCopywriteChar = '\u00A9';
        System.out.println(myCopywriteChar);

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean isCustomerOverTwentyOne = true;

        System.out.println(myFalseBooleanValue==isCustomerOverTwentyOne);
    }
}

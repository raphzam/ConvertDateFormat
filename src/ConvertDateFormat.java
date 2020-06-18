
import java.util.Arrays;
import java.util.Scanner;

public class ConvertDateFormat {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String dateNumFormat;
        String [] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        boolean allGood = false;
        String[] separtedDate;
        int monthNum;

        do {
            allGood = true;
            //Prompt user for the date in number format
            System.out.println("Enter a date (mm/dd/yyyy):");
            dateNumFormat = input.nextLine();

            //split input into an array
            separtedDate = dateNumFormat.split("/");

//            System.out.println(Arrays.toString(separtedDate));

            monthNum = Integer.parseInt(separtedDate[0]);
            int monthDay = Integer.parseInt(separtedDate[1]);

            if (monthNum < 1 || monthNum > 12){
                System.out.println("You entered an invalid month.");
                allGood = false;
            }
            if (monthDay < 1 || monthDay > 31){
                System.out.println("You entered an invalid day");
                allGood = false;
            }
        } while (!allGood);

        System.out.println("It is " + months[monthNum-1] + " " + separtedDate[1] + ", " + separtedDate[2]);

    }
}









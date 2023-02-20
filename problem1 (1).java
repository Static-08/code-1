import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Problem1{
    public static void main(String[] args) {
        String amounts = "100 200 500 50"; // input string containing all amounts

        // Define a regular expression pattern to match each amount
        Pattern p = Pattern.compile("\\d+");

        // Use a Matcher to extract the amounts from the input string
        Matcher matcher = p.matcher(amounts);
        int a = matcher.find() ? Integer.parseInt(matcher.group()) : 0;
        int b = matcher.find() ? Integer.parseInt(matcher.group()) : 0;
        int c = matcher.find() ? Integer.parseInt(matcher.group()) : 0;
        int d = matcher.find() ? Integer.parseInt(matcher.group()) : 0;

        // Calculate the total and average amounts
        int total = a + b + c + d;
        int average = total / 4;

        // Calculate the difference between what each person spent and the average
        int aDiff = average - a;
        int bDiff = average - b;
        int cDiff = average - c;
        int dDiff = average - d;

        // Print the results
        System.out.println("Person A has to " + (aDiff < 0 ? "receive" : "pay") + " " + Math.abs(aDiff) + " rupees.");
        System.out.println("Person B has to " + (bDiff < 0 ? "receive" : "pay") + " " + Math.abs(bDiff) + " rupees.");
        System.out.println("Person C has to " + (cDiff < 0 ? "receive" : "pay") + " " + Math.abs(cDiff) + " rupees.");
        System.out.println("Person D has to " + (dDiff < 0 ? "receive" : "pay") + " " + Math.abs(dDiff) + " rupees.");
    }
}

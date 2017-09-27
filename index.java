import java.util.Scanner;
/**
 *
 * @author Michal
 */
public class SoloLearn {

    /**
     * Put in string. If it contains "sololearn", output is true, else false.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Put in string with/without sololearn:");
        String string = sc.nextLine();
        string = string.toLowerCase();
        System.out.println(string.contains("sololearn"));
        System.out.println("Thank You for trying it!");
    }
    
}
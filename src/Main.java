import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //test Utils
        String test = Utils.readFileAsString("data/2016_Presidential_Results.csv");
        //System.out.println(test);

        ArrayList<ElectionResult> test2 = Utils.parse2016PresidentialResults(test);
        System.out.println(test2.get(0).toString());
    }
}

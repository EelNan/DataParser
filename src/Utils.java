import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Utils {
    public static String readFileAsString(String filepath) {
        StringBuilder output = new StringBuilder();

        try (Scanner scanner = new Scanner(new File(filepath))) {

            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                output.append(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return output.toString();
    }

    public static ArrayList<ElectionResult> parse2016PresidentialResults(String data) {
        String[] lines = data.split("\n");

        ArrayList<ElectionResult> output = new ArrayList<>();
        for (int i = 1; i < lines.length; i++) {
            String line = lines[i];
            line = betterClean(line);

            String[] values = line.split(",");
            double votes_dem = Double.parseDouble(values[1].trim());
            double votes_gop = Double.parseDouble(values[2].trim());
            double total_votes = Double.parseDouble(values[3].trim());
            double per_dem = Double.parseDouble(values[4].trim());
            double per_gop = Double.parseDouble(values[5].trim());
            double diff = Double.parseDouble(values[6].trim());
            double per_point_diff = Double.parseDouble(values[7].trim());
            String state_abbr = values[8].trim();
            String county_name = values[9].trim();
            double combined_fips = Double.parseDouble(values[10].trim());
            ElectionResult temp = new ElectionResult(votes_dem, votes_gop, total_votes, per_dem, per_gop, diff, per_point_diff, state_abbr, county_name, combined_fips);

            output.add(temp);
        }

        return output;
    }

    private static String betterClean(String line){
        line.replaceAll("%", "");
        int startIndex = line.indexOf("\"");
        int endIndex = line.indexOf("\"", startIndex + 1);

        if(startIndex != -1) {
            String beforeQuotes = line.substring(0, startIndex);
            String imbetween = line.substring(startIndex + 1, endIndex);
            String afterQuotes = line.substring(endIndex + 1);


            imbetween = imbetween.replaceAll(",", "");

            return beforeQuotes + imbetween + afterQuotes;
        }
        return line;
    }
}

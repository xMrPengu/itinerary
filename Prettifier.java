public class Prettifier {
    public static void main(String[] args) {
        
        String usage = "itinerary usage:\n$ java Prettifier.java ./input.txt ./output.txt ./airport-lookup.csv";

        if (args.length < 3) {
            System.out.println(usage);
        }
        else if (args[0].equals("-h")) {
            System.out.println(usage);
        }
    }
}
package logic;

public class Demo {
    public static int minStops(int n, String[] spins) {
        int totalStops = 0;
        for (int i = 0; i < spins[0].length(); i++) {
            char maxDigit = '0';
            for (int j = 0; j < n; j++) {
                if (spins[j].charAt(i) > maxDigit) {
                    maxDigit = spins[j].charAt(i);
                }
            }
            totalStops += maxDigit - '0';
        }
        return totalStops;
    }

    public static void main(String[] args) {
        int n = 4;
        String[] spins = {"137", "364", "115", "724"};
        int result = minStops(n, spins);
        System.out.println("Minimum number of stops on each wheel: " + result);
    }
}
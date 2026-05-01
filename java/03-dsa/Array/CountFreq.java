class CountFreq {
    public static void main(String[] args) {

        int num = 1223445;        // Original number
        int original = num;       // Backup copy (important)
        
        // This loop selects WHICH digit we are counting (0 to 9)
        for (int d = 0; d <= 9; d++) {

            int count = 0;        // Frequency of digit 'd'
            num = original;       // Reset number before scanning again

            // This loop scans the number digit by digit (from right)
            while (num > 0) {

                int lastDigit = num % 10; 
                // %10 extracts the LAST digit of the number
                // Example: 1223445 % 10 = 5

                if (lastDigit == d) {
                    // If extracted digit matches the digit we are counting
                    count++;
                }

                num = num / 10;
                // Removes last digit
                // Example: 1223445 / 10 = 122344
            }

            // Print only digits that appear at least once
            if (count > 0) {
                System.out.println(d + " -> " + count);
            }
        }
    }
}

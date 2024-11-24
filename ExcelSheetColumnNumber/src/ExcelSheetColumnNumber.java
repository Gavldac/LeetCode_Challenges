public class ExcelSheetColumnNumber {

    public static int titleToNumber(String columnTitle) {
        int magnitude = 0;
        int result = 0;
        for (int i = columnTitle.length() - 1; i >= 0; i--) {
            // 'A' - '@' = 1, @ is the perfect offest for (A,1),(B,2),(C,3), etc.
            result += (int) ((Math.pow(26, magnitude++)) * (columnTitle.charAt(i) - '@' ));
        }
        return result;
    }

    public static void main(String[] args) {
        // Test cases with expected values
        String[] testColumns = {"A", "Z", "AA", "AB", "ZY", "AAA"};
        int[] expectedValues = {1, 26, 27, 28, 701, 703};

        // Test the titleToNumber method with various column titles
        for (int i = 0; i < testColumns.length; i++) {
            String column = testColumns[i];
            int expectedValue = expectedValues[i];
            int columnNumber = titleToNumber(column);

            // Print the test result and compare with expected value
            System.out.println("Column Title: " + column
                    + " => Column Number: " + columnNumber
                    + " (Expected: " + expectedValue + ")");
        }
    }
}
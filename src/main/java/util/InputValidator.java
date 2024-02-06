package util;

public class InputValidator {

    public static boolean isValidDouble(String value) {
        try {
            Double.parseDouble(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isValidInteger(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Add more validation methods as needed, for example:
    public static boolean isPositiveDouble(String value) {
        return isValidDouble(value) && Double.parseDouble(value) > 0;
    }

    public static boolean isPositiveInteger(String value) {
        return isValidInteger(value) && Integer.parseInt(value) > 0;
    }
}

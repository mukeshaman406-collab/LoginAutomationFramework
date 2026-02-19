package utils;

public class TestData {

    public static String name = "Mukesh";
    public static String firstName = "Mukesh";
    public static String lastName = "Kumar";
    public static String company = "DemoCompany";
    public static String address1 = "My address 1";
    public static String address2 = "My address 2";
    public static String state = "Madhya Pradesh";
    public static String city = "Indore";
    public static String zipcode = "452010";
    public static String mobile = "9329327854";

    public static String generateEmail() {
        return "testuser" + System.currentTimeMillis() + "@gmail.com";
    }

    public static String generatePassword() {
        return "Pass@" + System.currentTimeMillis();
    }
}

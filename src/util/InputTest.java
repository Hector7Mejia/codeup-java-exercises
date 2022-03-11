package util;

public class InputTest {

    public static void main(String[] args) {
        Input input = new Input();
        System.out.println(input.getString("Enter a string: "));

        System.out.println(input.yesNo("Continue y/n? "));

        System.out.println(input.getInt("Enter an int: "));
        System.out.println(input.getInt("Enter an int between 1 and 10 : ", 1, 10));
        System.out.println(input.getDouble("Enter an double: "));
        System.out.println(input.getDouble("Enter an double between 1 and 10 : ", 1, 10));

        input.close();
    }
}

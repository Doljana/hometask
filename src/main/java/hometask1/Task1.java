package hometask1;

public class Task1 {
    public static void main(String[] args) {

        int input = 345;
        int hundreds = 345 / 100;
        int tens = (345 % 100) / 10;
        int ones = (345 % 100) % 10;

        System.out.println(input + "->" + hundreds + "," + tens + "," + ones);
    }

}

public class addTwoInts {
    public static void main(String[] args) {

        int num1 = 3;
        int num2 = 4;

        int num3 = addTwoInts(num1, num2);

        System.out.println(num3);

    }

    static int addTwoInts(int num1, int num2) {

        int num3 = num1 + num2;
        return num3;

    }
}
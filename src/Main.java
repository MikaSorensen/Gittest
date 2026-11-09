public class Main {
    public static void main(String[] args) {
        System.out.println("numbers " + addNumbers(1,2));
        System.out.println("three numbers " + addThreeNumbers(1,2,3));
        System.out.println("Subtracted numbers" + subtractNumbers(1,2));
    }
    public static int addNumbers(int x, int y){
        return x + y;
    }

    public static int addThreeNumbers(int x, int y, int z){
        int temp = addNumbers(x, y);
        return addNumbers(z, temp);
    }

    public static int subtractNumbers(int x, int y){
        return x - y;
    }
}
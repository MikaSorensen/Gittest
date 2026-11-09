public class Main {

    public int addNumbers(int x, int y){
        return x + y;
    }

    public int addThreeNumbers(int x, int y, int z){
        int temp = addNumbers(x, y);
        return addNumbers(z, temp);
    }

    public int subtractNumbers(int x, int y){
        return x - y;
    }
}
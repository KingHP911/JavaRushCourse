package level02;

public class level02_lecture08_Min3Nums {

    public static int min(int a, int b, int c) {
        int[] myValues = new int[]{a, b, c};
        int minimum = a;
        for (int i: myValues){
            if (i < minimum){
                minimum = i;
            }
        }
        return minimum;
    }

    public static void main(String[] args) {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }

}

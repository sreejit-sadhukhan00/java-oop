import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int [] marks=new int[] {50,89,98,34};
        // sorting function--->>>
        Arrays.sort(marks);
        // 2D ARRAY-->
        int [][] m=new int[][] {{54,32},{90,65},{99,23}};
        // marks[0]=50;
        // marks[1]=76;
        System.out.println(Arrays.toString(marks));
        System.out.println(m[0][1]);
        System.out.println(Arrays.deepToString(m));

    // constants declaration----->>>
    final float PI_num=3.14F;
    }
}

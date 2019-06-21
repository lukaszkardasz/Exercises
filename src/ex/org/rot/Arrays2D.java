package ex.org.rot;

/**
 * @author n2god on 09/06/2019
 * @project org
 */
public class Arrays2D {

    public static void main(String[] args) {

        int[] firstArray = {1,2,3};
        int[] secondArray = {4,5,6};

        int sum = 0;

        for (int i = 0; i < firstArray.length; i++) {
            sum +=firstArray[i];
        }
        for (int i = 0; i < secondArray.length; i++) {
            sum +=secondArray[i];
        }
        System.out.println(sum);


    }
}

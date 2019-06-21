package ex.org.rot;

/**
 * @author n2god on 09/06/2019
 * @project org
 */
public class Array3d {

    public static void main(String[] args) {

        double[][] array3d = new double[3][];
        double[] line0 = {1.0,1.5,2.0};
        double[] line1 = {1.5,2.0,2.5};
        double[] line2 = {2.0,2.5,3.0};

        array3d[0] = line0;
        array3d[1] = line1;
        array3d[2] = line2;
        //or
        //double array3d[][] = {{1.0,1.5,2.0},{1.5,2.0,2.5},{2.0,2.5,3.0}};



        double result = (array3d[0][0]*array3d[1][1]*array3d[2][2]) + (array3d[0][2]*array3d[1][1]*array3d[2][0]);
        System.out.println("Suma iloczynów przekątnych tablicy: " + result);

        result = (array3d[0][1]+array3d[1][1]+array3d[2][1]) * (array3d[1][0]+array3d[1][1]+array3d[1][2]);
        System.out.println("Iloczyn sum środkowego wiersza i środkowej kolumny tablicy: " + result);

        result = array3d[0][0] + array3d[0][1] + array3d[0][2] + array3d[1][0] + array3d[1][2] + array3d[2][0] + array3d[2][1] + array3d[2][2];
        System.out.println("Sumę wszystkich elementów znajdujących się przy krawędzi tablicy: " + result);
        System.out.println(Integer.MAX_VALUE);


    }

}

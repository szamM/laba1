import java.util.Random;
public class Main {
    public static void main(String[] args) {
        long[] c = new long[17];
        float[] x = new float[13];
        for (int i = 0; i < c.length; i++) {
            c[i] = i + 3;

        }
        for (int i = 0; i < x.length; i++) {
            Random randomFill = new Random();
            x[i] = randomFill.nextFloat() * 17 - 11;

        }
        double[][] twoC = new double[17][13];
        for (int i = 0; i < twoC.length; i++) {
            for (int j = 0; j < twoC[i].length; j++) {
                switch ((int)(c[i])){
                    case 8: twoC[i][j] = Math.cbrt((Math.pow(((Math.asin((x[j] - 2.5) / 17.0)) / 2.0), 3)));
                        break;
                    case 3, 4, 9, 10, 15, 17, 18, 19:
                        twoC[i][j] = (Math.pow(0.25 / (2 - Math.cbrt(Math.atan((x[j] - 2.5) / 17.0))), 3));
                        break;
                    default:
                        twoC[i][j] = Math.cos(Math.pow((Math.tan(x[j]) / 3.0), Math.atan(Math.cos(x[j]))));
                        break;
                }
                }
            }
        for (int i = 0; i < twoC.length; i++) {
            for (int j = 0; j < twoC[i].length; j++) {
                System.out.printf("%.5f ", twoC[i][j]);
            }
            System.out.println();
        }
    }
}
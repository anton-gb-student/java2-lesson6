
public class Methods {

    public static int[] after4 (int[] src) throws RuntimeException {

        if (src[src.length-1] == 4) throw new RuntimeException("\"4\" на последней позиции");
        int [] result = new int[1];
        for (int i = src.length - 2; i >= 0; i--) {
            if (src[i] == 4) {
                result = new int [src.length - i - 1];
                System.arraycopy(src,i+1, result, 0, result.length);
                break;
            } else if (i == 0) throw new RuntimeException ("Массив не содержит числа \"4\"");
        }
        return result;
    }

    public static boolean only1and4 (int[] ints){
        int ones = 0;
        int fours = 0;
        for (int i : ints) {
            if (i == 1) {
                ones++;
            } else if (i == 4) {
                fours++;
            }
        }
        if (ones == 0 || fours == 0) return false;
        else return (ints.length == ones + fours);
    }
}

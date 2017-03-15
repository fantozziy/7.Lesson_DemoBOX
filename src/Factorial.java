/**
 * Created by pst on 08.02.2017.
 */
public class Factorial {

    public static int fact(int i) {
        int result;

        if (i == 1)
            return 1;
        result = fact(i - 1) * i;
        System.out.println(result);
        return result;
    }
}

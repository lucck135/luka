import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class If {


    public static void main(String[] args) {
        int x = 10;
        int cond = (x > 0) ? 1 : 0;
        System.out.println(cond);

        UnaryOperator<Integer> u = (i) -> (i > 0) ? 1 : 0;

        System.out.println(u.apply(x));


        Predicate<Integer> p = (i) -> (i > 0);

        System.out.println(p.test(x));



    }

}

/**
 * Java1 Home work 2
 *
 * @author Anna Velichko
 * @version 17.10.2021
 */
class HomeWork2 {

    public static void main(String[] args) {
        System.out.println(Number(10, 5));
        System.out.println(Number(13, 7));
        System.out.println(Number(8, -3));

        PositiveVsNegative(-1);
        PositiveVsNegative(0);
        PositiveVsNegative(1);

        System.out.println(NegativeVsPositive(-1));
        System.out.println(NegativeVsPositive(0));
        System.out.println(NegativeVsPositive(1));

        repeatString("Repeat", 4);
    }

    static boolean Number(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    static void PositiveVsNegative (int a) {
        System.out.println(a < 0? "Negaive" : "Positive");
    }

    static boolean NegativeVsPositive(int a) {
        return a >= 0;
    }

    static void repeatString (String s, int count) {
        for (int c = 0; c < count; c++) {
            System.out.println(s);
        }
    }
}


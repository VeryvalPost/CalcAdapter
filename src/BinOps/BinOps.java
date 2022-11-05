package BinOps;

public class BinOps {
    public String sum(String a, String b) {
        //  /*ѕереведите числа из двоичной записи в
        //    строках в int, сложите и переведите
        //    обратно в двоичную запись*/

        int sumInt = Integer.parseInt(a, 2) + Integer.parseInt(b, 2);
        String sumStr = Integer.toBinaryString(sumInt);
        return sumStr;
    }

    public String mult(String a, String b) {
        //  /*ѕереведите числа из двоичной записи в
        //    строках в int, перемножьте и переведите
        //    обратно в двоичную запись*/
        int multiInt = Integer.parseInt(a, 2) * Integer.parseInt(b, 2);
        String multiStr = Integer.toBinaryString(multiInt);
        return multiStr;

    }
}

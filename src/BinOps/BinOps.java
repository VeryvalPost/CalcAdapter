package BinOps;

public class BinOps {
    public String sum(String a, String b) {
        //  /*���������� ����� �� �������� ������ �
        //    ������� � int, ������� � ����������
        //    ������� � �������� ������*/

        int sumInt = Integer.parseInt(a, 2) + Integer.parseInt(b, 2);
        String sumStr = Integer.toBinaryString(sumInt);
        return sumStr;
    }

    public String mult(String a, String b) {
        //  /*���������� ����� �� �������� ������ �
        //    ������� � int, ����������� � ����������
        //    ������� � �������� ������*/
        int multiInt = Integer.parseInt(a, 2) * Integer.parseInt(b, 2);
        String multiStr = Integer.toBinaryString(multiInt);
        return multiStr;

    }
}

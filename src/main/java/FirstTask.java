/*�������� ����� ����������� (������������), ������� �������� ���������� ����������� ������:
sum(), multiply(), divide(), subtract().
��������� ���� ������� � ��� ����� ������� ���� (�� ������������� ������� ����� �����),
 ��� �������� ������ ���� ����������� ��������.
 */
public class FirstTask {
    public static void main(String[] args) {
        Calculator.sum(12, 0.5);
        Calculator.divide(143, 0.6);

    }
}

class Calculator{
    public static <T extends Number, V extends Number> double sum(T a, V b) {
        return a.doubleValue() + b.doubleValue();
    }

    public static <T extends Number, V extends Number> double multiply(T a, V b) {
        return a.doubleValue() * b.doubleValue();
    }

    public static <T extends Number, V extends Number> double subtraction(T a, V b) {
        return a.doubleValue() - b.doubleValue();
    }

    public static <T extends Number, V extends Number> double divide(T a, V b) {
        return a.doubleValue() / b.doubleValue();
    }
}

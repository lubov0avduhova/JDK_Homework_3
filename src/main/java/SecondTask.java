/*
�������� ���������� ����� compareArrays(),
������� ��������� ��� ������� � ���������� true, ���� ��� ����������,
� false � ��������� ������.
������� ����� ���� ������ ���� ������, �� ������ ����� ���������� ����� � ��������� �������� ������ ����.
 */

public class SecondTask {
    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3};
        Double[] arr2 = {4.0, 5.0, 6.89};
        System.out.println(compareArrays(arr1, arr2));
    }

    public static <T> boolean compareArrays(T[] arr, T[] arr2) {
        if (arr.length == arr2.length && arr.getClass() == arr2.getClass()) {
            return true;
        } else return false;
    }
}

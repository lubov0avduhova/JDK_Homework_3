/*
�������� ���������� ����� Pair,
������� ������������ ����� ���� �������� ������� ����.
����� ������ ����� ������ getFirst(), getSecond()
��� ��������� �������� ������� �� ������������ ����,
 � ����� ��������������� ������ toString(), ������������ ��������� ������������� ����.
 */
public class ThirdTask {
    public static void main(String[] args) {
        Pair<String, Integer> pairs = new Pair<>("������", 12);
        System.out.println(pairs);
    }
}

class Pair<T, V> {
    private T t;

    private V v;

    public Pair(T t, V v) {
        this.t = t;
        this.v = v;
    }

    public T getFirst() {
        return t;
    }

    public V getSecond() {
        return v;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "t=" + t +
                ", v=" + v +
                '}';
    }
}
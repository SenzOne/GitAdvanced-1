//Вычислить n-ое треугольного число(сумма чисел от 1 до n).
// Внутри класса Answer напишите метод countNTriangle,
// который принимает число n и возвращает его n-ое треугольное число.

package homeworks.hw1;

public class task1 {
    public static void main(String[] args) {
        System.out.println(countNTriangle(4));
        for (int i = 0; i < 10; i++) {
            System.out.println(countNTriangle(i));
        }
    }

    public static int countNTriangle(int n) {
        return n*(n +1)/ 2;
    }
}

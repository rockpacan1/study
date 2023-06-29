/**
 Урок с кодом
 Реализуйте метод, возвращающий ответ на вопрос: правда ли, что a + b = c ?
 Допустимая погрешность – 0.0001 (1E-4)
 Можно использовать класс Math и его методы. Класс Math доступен всегда, импортировать его не надо.
 В качестве примера написано заведомо неправильное выражение. Исправьте его.

 Требования:
 Метод должен иметь сигнатуру: doubleExpression(double a, double b, double c)

 public static boolean doubleExpression(double a, double b, double c) {
 return a + b == c;
 }
 }
 */
package lesson4;
public class Lesson4 {

    public static boolean doubleExpression(double a, double b, double c) {
        if (a + b == c) {
            System.out.println(c);
            return true;
        } else {
            c = a + b;
            System.out.println(c);
            return false;
        }

    }
    public static void main(String[] args) {
        System.out.println(doubleExpression(1.2,2.112,3.3));
    }
}

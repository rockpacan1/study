/**
 Урок с кодом
 Напишите публичный метод priceCalculation, который считает стоимость товара.
 В метод передается цена товара (может быть дробной) и количество товара, метод должен возвращать итоговую цену покупки.

 Пример ввода: 8.50, 2
 Пример вывода: 17.0

 Требования:
 Сигнатура метода должна быть: priceCalculation(double price, int count)


 public double priceCalculation(double price, int count) {
 //Твой код здесь
 }
 */
package lesson3;
public class Lesson3 {

    public static double priceCalculation(double price, int count) {
        double a = price * count;
        System.out.println(a);
        return (0);
    }
        public static void main(String[] args) {

        priceCalculation (8.50,2);
    }
}
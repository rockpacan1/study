/**
 * Задание «Объявление примитивных типов данных»
 *
 * Цель: научиться объявлять переменные
 *
 * В методе main (точка входа в программу) объяви переменные всех простых (примитивных) типов. Проинициализируй их значениями, отличными от значений по умолчанию (измени значение переменных).
 *
 * Требования:
 *
 * 1. Переменные должны находиться внутри метода main.
 *
 * 2. В методе main должны быть переменные всех простых типов.
 *
 * 3. В методе main должны быть переменные только простых типов.
 *
 * 4. Значения переменных должны отличаться от значений по умолчанию.
 *
 * 5. Переменные должны иметь имя var + тип примитива без пробелов и подчеркиваний, например, переменная типа int должна называться varint
 */
package lesson1;
public class Lesson1 {

        public static void main(String[] args) {
                byte varbyte = 127;
                short varshort = 32767;
                int varint = 228;
                long varlong = 111_111_111L;
                char varchar = '✝';
                float varfloat = 2.28f;
                double vardouble = 0.228;
                boolean varboolean = false;

                 System.out.println(varbyte);
                 System.out.println(varshort);
                 System.out.println(varint);
                 System.out.println(varlong);
                 System.out.println(varchar);
                 System.out.println(varfloat);
                 System.out.println(vardouble);
                 System.out.println(varboolean);
        }
}
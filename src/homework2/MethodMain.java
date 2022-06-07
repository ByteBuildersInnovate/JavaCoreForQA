package homework2;

import static homework2.SummingArrayValues.getSum;
import static homework2.TwoDimensionalArrays.*;

public class MethodMain {

    public static void main(String[] args) {

        try {
            System.out.println("Сумма первого массива: " + getSum(arrayWithoutError));
        } catch (SummingArrayValues.MyArraySizeException | SummingArrayValues.MyArrayDataException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            System.out.println("Сумма массива: " + getSum(arraySizeException));
        } catch (SummingArrayValues.MyArraySizeException | SummingArrayValues.MyArrayDataException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            System.out.println("Сумма массива: " + getSum(arrayDataException));
        } catch (SummingArrayValues.MyArraySizeException | SummingArrayValues.MyArrayDataException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

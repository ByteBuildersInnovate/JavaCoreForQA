package homework2;

import static homework2.TwoDimensionalArrays.*;

public class SummingArrayValues {
   static void checkValue(String[][] array) throws MyArraySizeException {
       if(array.length != sizeX || array[0].length != sizeY) {
           throw new MyArraySizeException();
       }
   }

   static Integer getSum(String[][] array) throws MyArrayDataException, MyArraySizeException {
       checkValue(array);
       Integer result = 0;
       int i = 0;
       int j = 0;
       try {
           for (; i < array.length; i++) {
               j = 0;
               for (; j < array.length; j ++) {
                   result = result + Integer.parseInt(array[i][j]);
               }
           }
       } catch (NumberFormatException ex) {
           throw new MyArrayDataException("MyArrayDataException - неверные данные в поле: " + i + "," + j);
       }

       return result;
   }

    public static class MyArraySizeException extends Exception {
        public MyArraySizeException() {
            super("MyArraySizeException - Ошибка размера массива");
        }
    }

    public static class MyArrayDataException extends Exception {
        public MyArrayDataException(String message) {
            super(message);
        }
    }
}

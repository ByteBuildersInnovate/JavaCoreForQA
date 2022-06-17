package homework3.task2;

public class Main {

    public static void main(String[] args) {
        Box<Orange> or = new Box<>();
        Box<Orange> or1 = new Box<>();
        Box<Apple> ap = new Box<>();
        Box<Apple> ap1 = new Box<>();
        System.out.println(" Реализация пункта 'g' - addFruit: ");
        or.addFruit(new Orange(),10);
        or1.addFruit(new Orange(),12);
        ap.addFruit(new Apple(),20);
        ap1.addFruit(new Apple(),15);
        System.out.println("Box 1 с апельсинами: " + or.getWeight());
        System.out.println("Box 2 с апельсинами: " + or1.getWeight());
        System.out.println("Box 3 с яблоками: " + ap.getWeight());
        System.out.println("Box 4 с яблоками: " + ap1.getWeight());
        System.out.println(" Реализация пункта 'f' - pourTo(): ");
        or.pourTo(or1);
        ap.pourTo(ap1);
        System.out.println(" Реализация пункта 'd' - getWeight(): ");
        System.out.println("Box 1 с апельсинами: " + or.getWeight());
        System.out.println("Box 2 с апельсинами: " + or1.getWeight());
        System.out.println("Box 3 с яблоками: " + ap.getWeight());
        System.out.println("Box 4 с яблоками: " + ap1.getWeight());
    }
}

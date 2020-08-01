public class Main {

    public static void main(String[] args) {

        Square square = new Square("kwadrat", 5);
        Rectangle rectangle = new Rectangle("prostokat", 5, 6);
//        System.out.println(rectangle.getField());
//        System.out.println(square.getField());

        Figura[] figury = {square,rectangle};
        for (Figura figura: figury) {
            System.out.println(figura.getField());
        }
    }
}

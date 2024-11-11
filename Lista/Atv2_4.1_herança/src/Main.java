import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Valor do raio: ");
        double radius = scanner.nextDouble();
        System.out.print("Altura: ");
        double height = scanner.nextDouble();

        scanner.nextLine();

        System.out.print("Cor: ");
        String color = scanner.nextLine();

        Circle circle = new Circle(radius, color);
        Cylinder cylinder = new Cylinder(radius, height, color);

        System.out.println(circle);
        System.out.println("Area do circulo: " + circle.getArea());
        System.out.println("Volume do cilindro: " + cylinder.getVolume());
        scanner.close();
    }
}

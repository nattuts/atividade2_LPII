import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do cachorro: ");
        String dogName = scanner.next();
        Dog dog = new Dog(dogName);

        System.out.print("Nome do outro cachorro: ");
        String anotherName = scanner.next();
        Dog anotherDog = new Dog(anotherName);

        System.out.print("Nome do gato: ");
        String catName = scanner.next();
        Cat cat = new Cat(catName);

        System.out.print("Nome do cachorro grande: ");
        String bigdogName = scanner.next();
        BigDog bigdog = new BigDog(bigdogName);

        System.out.print("Nome do outro cachorro grande: ");
        String anotherbigdogName = scanner.next();
        BigDog anotherbigdog = new BigDog(anotherbigdogName);

        scanner.close();

        System.out.println("...");
        dog.greets();
        anotherDog.greets();
        bigdog.greets();
        anotherbigdog.greets();;
        cat.greets();

    }
}

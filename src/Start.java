import java.io.IOException;

public class Start {
    public static void main(String[] args) {
        System.out.println("Введите число от 1 до 10 или от I до X:");
        System.out.println("Калькулятор работает как с римскими ,так и с арабскими");
        try {
            Logic l = new Logic();
            l.logic();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

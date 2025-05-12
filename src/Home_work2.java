import java.util.Random;

public class Home_work2 {
    public static void main(String[] args) {
        // Задание №3
        System.out.println("Возраст: " + generateRandomAge() + ", Температура: 10 - " +
                permission(generateRandomAge(), 10)); //Задание №5
        System.out.println("Возраст: " + generateRandomAge() + ", Температура: -15 - " +
                permission(generateRandomAge(), -15)); //Задание №5
        System.out.println("Возраст: " + generateRandomAge() + ", Температура: 30 - " +
                permission(generateRandomAge(), 30)); //Задание №5
        System.out.println("Возраст: " + generateRandomAge() + ", Температура: 0 - " +
                permission(generateRandomAge(), 0)); //Задание №5
        System.out.println("Возраст: " + generateRandomAge() + ", Температура: 26 - " +
                permission(generateRandomAge(), 26));
    }

    // Задание №4
    public static int generateRandomAge() {
        Random random = new Random();
        return random.nextInt(91);
    }

    // Задание №1, №2
    public static String permission(int age, int temperature) {
        if (age > 20 && age < 45 && temperature > -20 && temperature <= 30) {
            return "Можно идти гулять";
        } else if (age < 20 && temperature > 0 && temperature < 28) {
            return "Можно идти гулять";
        } else if (age > 45 && temperature > -10 && temperature < 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }
}


/**
 * Created by Devil Trigger S on 05.10.2014.
 */
public class Mas2 {
    public static void main(String[] args) {
        int i;
        String[] names = {"Павел", "Иван", "Сергей", "Александр", "Елена", "Юлия", "Ирина"};
        String[] greetings = new String[names.length];
        for (i = 0; i < names.length; i++)
            greetings[i] = "Привет " + names[i];
        for (i = 0; i < greetings.length; i++) System.out.println(greetings[i]);

    }
}

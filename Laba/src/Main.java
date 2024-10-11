import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Чтение текста от пользователя
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String inputText = scanner.nextLine();
        scanner.close();

        // Разделение текста на слова
        String[] words = inputText.split("\\s+");

        // Список для сохранения пар перевёрнутых слов
        ArrayList<String> wordPairs = new ArrayList<>();
        int counter = 0;

        // Основной цикл по всем словам
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reversedWord = new StringBuilder(word).reverse().toString();

            // Проверяем, есть ли перевёрнутое слово в тексте
            for (int j = i + 1; j < words.length; j++) {
                if (reversedWord.equals(words[j])) {
                    wordPairs.add(word + "-" + words[j]);
                    counter++;
                }
            }
        }
        // Вывод результата
        System.out.println("Всего найдено: " + counter);
        for (String pair : wordPairs) {
            System.out.println(pair);
        }
    }
}
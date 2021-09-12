package geekbrains.homeworks.Homework10;

import java.util.*;
import java.util.stream.Collectors;

public class Phonebook {

    public static void main(String[] args) {
        makePhonebook();
    }

    public static void makePhonebook() {
        Map<String, String> unsortNamesPhonebook = new HashMap<>();
        unsortNamesPhonebook.put("123-998", "Ivanov");
        unsortNamesPhonebook.put("123-6895", "Ivanov");
        unsortNamesPhonebook.put("123-456", "Pushkin");
        unsortNamesPhonebook.put("123-098", "Pushkin");
        unsortNamesPhonebook.put("345-345", "Konev");
        unsortNamesPhonebook.put("567-345", "Sidorov");
        unsortNamesPhonebook.put("456-1293", "Pushkin");
        unsortNamesPhonebook.put("456-123", "Sidorov");

        addNamesToPhonebook(unsortNamesPhonebook);

//        Map<String, String> NamesPhonebook = unsortNamesPhonebook.entrySet().stream()
//                .sorted(Map.Entry.comparingByValue(Comparator.naturalOrder()))
//                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
//                        (oldValue, newValue) -> oldValue, LinkedHashMap::new)); // сортировка справочника по фамилиям (по value)
//
//        for (Map.Entry<String, String> book : NamesPhonebook.entrySet()) { // печать всего списка фамилий и номеров телефонов
//            System.out.println(book.getValue() + ": " + book.getKey());
//        }

        getSearch(unsortNamesPhonebook);
    }

    static void getSearch(Map<String, String> unsortNamesPhonebook) { //поиск по value "фамилии"
        String surname = "Pushkin";
        System.out.println("Search by surname: " + surname);
        for (Map.Entry<String, String> book : unsortNamesPhonebook.entrySet()) {
            if (book.getValue().equals(surname)) {
                System.out.println(book.getValue() + ": " + book.getKey());
            }
        }
    }

    static void addNamesToPhonebook(Map<String, String> unsortNamesPhonebook) { //доп. добавление записей в справочник
        unsortNamesPhonebook.put("377-23", "Chehov");
        unsortNamesPhonebook.put("576-134", "Ivanov");
        unsortNamesPhonebook.put("69-789", "Pushkin");
    }

}

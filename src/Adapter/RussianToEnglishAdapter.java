package Adapter;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RussianToEnglishAdapter implements Dictionary{
    private RussianDictionary russianDictionary;
    private EnglishDictionary englishDictionary;

    public RussianToEnglishAdapter(RussianDictionary russianDictionary, EnglishDictionary englishDictionary) {
        this.russianDictionary = russianDictionary;
        this.englishDictionary = englishDictionary;
    }

    @Override
    public String translation(String word) {
        Map<String, String> dictionaryRus = new HashMap<>();
        dictionaryRus.put("������", "Hello");
        dictionaryRus.put("��� ����", "How are you");
        dictionaryRus.put("��� ���� �����", "What is your name");

        String translation = russianDictionary.translation(dictionaryRus.get(word));

        return translation;
    }
}

package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
    HashMap<String,String> dictionary = new HashMap<String,String>();
    private String[] englishWord = { "apple", "peach", "banana", "lemon", "pear", "kiwi", "strawberry", "grape", "muscat", "cherry" };
    private String[] japaneseWord = { "りんご", "桃", "バナナ", "レモン", "梨", "キウィ", "いちご", "ぶどう", "マスカット", "さくらんぼ"};

    public Dictionary_Chapter21() {
        for( int i = 0; i < englishWord.length; i++ ) {
            dictionary.put(englishWord[i],japaneseWord[i]);
        }
    }

    public void searchDictionary(String[] words) {
        for(String word : words) {
            String mean = dictionary.get(word);
            if(mean == null) {
                System.out.println(word + "は辞書に存在しません");
            } else {
                System.out.println(word + ":" + mean);
            }
        }
    }
}
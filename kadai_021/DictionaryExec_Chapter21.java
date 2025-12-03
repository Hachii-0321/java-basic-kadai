package kadai_021;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;


public class DictionaryExec_Chapter21 {
    public static void main(String[] args) {
        Dictionary_Chapter21 searchDictionary4 = new Dictionary_Chapter21();
        String[] searchWords = { "apple", "banana", "grape", "orange" };
        searchDictionary4.searchDictionary(searchWords);
    }
}

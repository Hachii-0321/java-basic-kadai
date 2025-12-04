package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
    public String getMyChoice() {
        System.out.println("自分のじゃんけんの手を入力しましょう\nグーはrockのrを入力しましょう\nチョキはscissorsのsを入力しましょう\nパーはpaperのpを入力しましょう");
        Scanner jyankenInput = new Scanner(System.in);
        String getJyankenMy;
        while (true) {
            getJyankenMy = jyankenInput.nextLine();
            if (getJyankenMy.equals("r") || getJyankenMy.equals("s") || getJyankenMy.equals("p")) {
                jyankenInput.close();
                break;
            }
            else {
                System.out.println("入力値が正しくありません。r,s,pで入力してください");
            }
        }
        return getJyankenMy;
    }

    public String getRandom() {
        String[] jyankenType = {"r", "s", "p"};
        int randomNumber = (int)Math.floor(Math.random() * jyankenType.length);
        return jyankenType[randomNumber];
    }

    public void play(String getJyankenMy, String jyankenServer) {
        HashMap<String, String> jyankenMap = new HashMap<>();
        jyankenMap.put("r", "グー");
        jyankenMap.put("s", "チョキ");
        jyankenMap.put("p", "パー");
        System.out.println("自分の手は" + jyankenMap.get(getJyankenMy) + ",対戦相手の手は" + jyankenMap.get(jyankenServer));
        if (getJyankenMy.equals(jyankenServer)) {
            System.out.println("あいこです");
        } else if (getJyankenMy.equals("r") && jyankenServer.equals("s") || getJyankenMy.equals("s") && jyankenServer.equals("p") || getJyankenMy.equals("p") && jyankenServer.equals("r") ) {
            System.out.println("自分の勝ちです");
        } else {
            System.out.println("自分の負けです");
        }
    }
}

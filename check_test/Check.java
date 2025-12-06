package check_test;

import java.util.Scanner;

public class Check {
    public String getTest() {
//        名前の入力受付
        int[] evaluation = {0,0,0,0,0};

        Scanner testInput = new Scanner(System.in);
        while(true) {
            System.out.println("名前を入力してください");
            String name = testInput.nextLine();
//        点数の入力受付
            System.out.println(name + "さんのテストの点数を入力してください");
            int score = testInput.nextInt();
            testInput.nextLine();
//        点数に基づいて、評価を表示する
            while (!(score >= 0 && score <= 100)) {
                System.out.println(score + "は不適切な入力値です\nテストの点数は0以上100以下の数字で入力して下さい");
                score = testInput.nextInt();
                testInput.nextLine();
            }
            if (score >= 90) {
                System.out.println(name + "さんの評価は5");
                evaluation[4] += 1;
            } else if (score >= 70) {
                System.out.println(name + "さんの評価は4");
                evaluation[3] += 1;
            } else if (score >= 50) {
                System.out.println(name + "さんの評価は3");
                evaluation[2] += 1;
            } else if (score >= 30) {
                System.out.println(name + "さんの評価は2");
                evaluation[1] += 1;
            } else {
                System.out.println(name + "さんの評価は1");
                evaluation[0] += 1;
            }
//        「入力を続けますか？（yes/no）」の表示
            System.out.println("入力を続けますか? (yes/no)");
            String answer = testInput.nextLine();
            while(!(answer.equals("yes") || answer.equals("no"))) {
                System.out.println(answer + "は不適切な入力値です\nyes/noで入力してください");
                answer = testInput.nextLine();
            }
            if (answer.equals("no")) {
                break;
            }
        }
//        入力終了で評価ごとの人数を表示
        System.out.println("---- 評価ごとの人数 ----");
        for (int i = 0; i < evaluation.length; i++) {
            System.out.println((i+1) + ":" + evaluation[i] + "人");
        }
        System.out.println("------------------------");
//        評価2以下で、補習の対象とする
        System.out.println("夏休みの補習の対象は、" + (evaluation[0]+evaluation[1]) + "人です");

        testInput.close();
        return "";
    }
}

package jp.dcworks;

public class Original1_4 {
    public static void main(String[] args) {

        int[] number = new int[100];

        // 1〜100を入れる
        for (int i = 0; i < 100; i++) {
            number[i] = i + 1;
        }

        // 偶数だけ出力
        for (int i = 0; i < 100; i++) {
            if (number[i] % 2 == 0) {
                System.out.print(number[i] + " ");
            }
        }
    }
}
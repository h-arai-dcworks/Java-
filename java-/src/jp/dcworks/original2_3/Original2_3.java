package jp.dcworks.original2_3;

public class Original2_3 {
	
	public static void main (String[] args){
        int a = 3;
        int b = 5;
       
        //計算結果を出力
        System.out.println("足し算：" + Original2_3add.add(a, b)); // 足し算
        System.out.println("引き算：" + Original2_3sub.sub(a, b)); // 引き算
        System.out.println("掛け算：" + Original2_3mul.mul(a, b)); // 掛け算
        System.out.println("割り算：" + Original2_3div.div(a, b)); // 割り算
    }

}

package jp.dcworks;

//計算クラスの動作確認を行うためのメインクラス
public class original2_4 {
	public static void main (String[] args) {
		
		int a ;
		int b ;
		
		//calクラスのインスタンス作成
		cal c = new cal();
	    
		//計算結果を出力
		System.out.println(c.add(3,5));
		System.out.println(c.sub(3,5));
		System.out.println(c.mul(3,5));
		System.out.println(c.div(3,5));
		
	
	}

}
//動的メソッドをまとめたクラス
class cal{
	   //足し算
	   public int add(int a, int b){
	        return a + b;
	    }
       //引き算
	    public int sub(int a, int b){
	        return a - b;
	    }
        //掛け算
	    public int mul(int a, int b){
	        return a * b;
	    }
        //割り算
	    public int div(int a, int b){
	        return a / b;
        }
	    
}   

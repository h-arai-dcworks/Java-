package jp.dcworks;

public class Original2_1 {
	 
	public static void main (String[] args){
    	
    	// addメソッドを呼び出して 3 + 5 の結果を受け取る
    	int result = add(3,5);
    
    	//計算結果を表示
        System.out.println(result);
    }
	
	
	//2つの整数を足して結果を返すメソッドを作成
	public static int add(int a, int b){
	        return a + b;
	        
	    }
	
}

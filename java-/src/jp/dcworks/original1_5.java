package jp.dcworks;

import java.util.HashMap;

public class original1_5 {
	public static void main(String[] args){
    
		
	//キーと値をセットで管理するためのHashMapを作成
	HashMap<Integer,String> Fruit = new HashMap<>();
    
	//果物データを登録
	Fruit.put(1,"りんご");
    Fruit.put(2,"いちご");
    Fruit.put(3,"みかん");
    Fruit.put(4,"バナナ");
    Fruit.put(5,"メロン");

    //キ一覧を取得して繰り返し処理
    for(Integer key  : Fruit.keySet()){
    	
    //キーを使って値を取得
    System.out.println(key+ ":"+ Fruit.get(key));
    }
    
    }

}

package jp.dcworks;

import java.util.LinkedHashMap;
import java.util.Map;

public class Original1_5 {
	public static void main(String[] args) {

		// キーと値をセットで管理するためのHashMapを作成
		Map<Integer, String> fruit = new LinkedHashMap<>();

		// 果物データを登録
		fruit.put(1, "りんご");
		fruit.put(2, "いちご");
		fruit.put(3, "みかん");
		fruit.put(4, "バナナ");
		fruit.put(5, "メロン");

		// キ一覧を取得して繰り返し処理
		for (Integer key : fruit.keySet()) {

			// キーを使って値を取得
			System.out.println(key + ":" + fruit.get(key));
		}

	}

}

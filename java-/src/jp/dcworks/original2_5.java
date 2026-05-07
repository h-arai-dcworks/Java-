package jp.dcworks;

public class original2_5 {
	static Point p1 = new Point(2,5);
	static Point p2 = new Point(3,6);
	  
 //計算結果を出力
  public static void main(String[] args) {
	  System.out.println(cal());
  }
  //2点の距離を計算するクラス
   public static double cal(){
		return Math.sqrt((p1.x - p2.x) * (p1.x- p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
  }
}
//座標を表すクラス
 class Point{
	
	int x;
    int y;
  
 //コンストラクタ
 Point(int x, int y){
    	this.x = x ;
    	this.y = y ;	
    }
   
  
}



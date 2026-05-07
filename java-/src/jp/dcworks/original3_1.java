package jp.dcworks;

public class original3_1 {
    public static void main (String[] args) {
	  
       //各図形のインスタンス
       shape a = new Rectangle(3,4);
	   shape b = new Circle(2);
	   shape c = new Triangle(3);
   	  
	   //各図形の面積と週の長さを出力
       System.out.println(a.area() + " " + a.perimeter());
	   System.out.println(b.area() + " " + b.perimeter());
	   System.out.println(c.area() + " " + c.perimeter());
    
  }

    //長方形クラス
    static class Rectangle implements shape{
	  double w; 
	  double h; 
	
	  Rectangle (double w, double h) {
		this.w = w;
		this.h = h;
	  }
		
	   public double area() {
		return w * h;
	   }
	   
	   public double perimeter() {
   		return (w + h) * 2;
  	   }
	   
	 }
	 
    
     //円のクラス
     static class Circle implements shape{
    	double  r;
    	
        Circle (double r){
    		this.r = r ;
    	}
    
    	public double area() {
    		return r * r;
        }
          
    	public double perimeter() {
    		return r * r * Math.PI;
    	}
    	
     }
    
    
    //三角形のクラス
     static class Triangle implements shape{
    	double w;
    
    	
    	Triangle(double w){
    		this.w = w;
    	}
    	
    
        public double area() {
    		return  (Math.sqrt(3) / 4) *  w * w;
        }
    	   
        public double perimeter() {
    		return w * 3;
        }
    
     }
   
    
 }
    
//図形の面積と周囲の長さを共通で扱うためのインターフェース
interface shape{

double area();
double perimeter();
}
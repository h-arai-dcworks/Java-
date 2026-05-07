package jp.dcworks;


//動物の共通の性質を表す親クラス
  class Animal {
    String name ; //動物の名前
    
     //コンストラクタ
     Animal(String name) {
       this.name = name ;
     }
      
     //鳴き声
      void sound() {
      System.out.println(name + ":"+ "鳴き声");
     }

  }

    //Dogクラス（Animalを継承）
   class Dog extends Animal{
	   
	 //コンストラクタ
	  Dog(String name){
      super(name);
      }
    
    @Override
    void sound () {
      System.out.println(name +":"+ "ワンワン");
    }
  }

   
   //Catクラス（Animalを継承）
   class Cat extends Animal{
	   
	 //コンストラクタ
	   Cat(String name){
      super(name);
      }
    
    @Override
    void sound() {
      System.out.println(name + ":"+ "ニャーニャー");
    }
  }

   //Lionクラス（Animalを継承）
   class Lion extends Animal{
	 
	   //コンストラクタ
	  Lion(String name){
      super(name);
       }
    
    @Override
    void sound() {
      System.out.println(name + ":"+ "ガオー");
    }

  }
    //動作確認用メインクラス
    public class original4_1 {
    	public static void main(String[] args) {
    		
    		// 各動物のインスタンスを作成
    		Dog a = new Dog("dog");
    		Cat b = new Cat("cat");
    		Lion c = new Lion("lion");

    		a.sound();
    		b.sound();
    		c.sound();

    	}
}
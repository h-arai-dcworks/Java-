package jp.dcworks;
import java.util.ArrayList;

public class original1_4{
    public static void main(String[] args){
        //偶数を格納するためのArrayListを作成
    	ArrayList <Integer> number = new ArrayList <>();
        
       //100までの偶数を出力
        for(int i = 0 ; i < 101; i++){
            if(i % 2 == 0){
            number.add(i);
            }
        }
        System.out.println(number);
    }
}




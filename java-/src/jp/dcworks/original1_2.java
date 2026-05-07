package jp.dcworks;

import java.util.Arrays;

public class original1_2 {
public static void main(String[] args) {
	   int[] arr1 = new int[10];
	   int[] arr2 = new int[10];
	    
	   // arr1に０〜９までを順番に代入
	   for(int i = 0 ; i < 10 ; i++) {
		   arr1[i] = i;
	   }
	   // arr1の要素を逆順でarr2にコピー
	   for(int i = 0 ; i < 10 ; i++) {
		   arr2[i] = arr1[9 - i];
	   }
	   //配列の中身を出力
	   System.out.println(Arrays.toString(arr1));
	   System.out.println(Arrays.toString(arr2));
	        
 } 
}


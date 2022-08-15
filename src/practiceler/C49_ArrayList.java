package practiceler;

import java.util.ArrayList;
import java.util.List;

public class C49_ArrayList {
    public static void main(String[] args) {
        //verilen arrayin n sayisi kadar maksimum degerlerini bulan java programi yaziniz
        //kisa methodlar kullanmayiniz
        int []arr={1,2,3,4,5,6,7,8,9,9};
        int n=4;

        List<Integer> list=new ArrayList<>();

        for (int each:arr) {
            list.add(each);
        }
        List<Integer>maxList=new ArrayList<>();
        int sayac=1;
        while(sayac<=n){
            int max=list.get(0);//listin ilk elemani max olsun
            for (int i = 0; i <list.size() ; i++) {
                if(list.get(i)>max&&!(maxList.contains(list.get(i)))){
                    max= list.get(i);//listenin herhangi bir elemani maxtan buyukse yeni buyuk o
                }

            }
            maxList.add(max);
            list.remove(list.indexOf(max));//tekrar ayni sayiya bakmamasi icin kaldirdik
            sayac++;
        }
        System.out.println("arrayin max "+n+"elemani " +maxList);

    }
}

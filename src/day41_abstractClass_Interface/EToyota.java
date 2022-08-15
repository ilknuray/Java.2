package day41_abstractClass_Interface;

import day37_overriding.Daraba;

public abstract class EToyota extends DAraba {

    protected void motor(){
        System.out.println("Toyota arabalar cevreci motor kullanir");

        /*
        parent classtaki standart belirleyici methodlarin (abstract method)tamami
        child class tarafindan override edilmelidir

        concrete methodlarin override edilme mecburiyeti yoktur
        istersek override edebiliriz,istemezsek etmeyiz

        aslinda toyota classi da obje uretecegimiz bir class degil
        bu durumda eger proje tasarimi yapiyorsaniz toyota clasini da abstract
        yapmaniz guzel olur



         */

    }
}

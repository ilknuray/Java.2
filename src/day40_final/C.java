package day40_final;

public abstract class C {

    void toplama() {
        System.out.println("Bu method toplama yapar");
    }
   abstract void carpma();

    /*
    bir methodun basina abstract yazarsaniz bu methodun child class
    lar icin bir standart oldugunu deklare ederiz ve method bodysine
    ihtiyac kalmaz
     */
    abstract void bolme();

    void cikarma(){
        System.out.println("bu method cikarma yapar");
    }


}
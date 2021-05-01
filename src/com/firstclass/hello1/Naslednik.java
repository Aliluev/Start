package com.firstclass.hello1;

public class Naslednik {
    public int a=10;
    public int b;
    public Naslednik(){
        b=30;
    }
   public void pechat()
    {
        System.out.println(this.a+this.b);
    }
}

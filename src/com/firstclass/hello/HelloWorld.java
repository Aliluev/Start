package com.firstclass.hello;
import com.firstclass.hello1.Naslednik;
import com.firstclass.hello3.Pp;
import com.firstclass.hello2.Progger;
import javax.sound.midi.Soundbank;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;


public class HelloWorld {
    public static void main(String args[] ) {
        System.out.println("Privet vsem, ya budu millionerom");
        Naslednik first = new Naslednik();
        first.pechat();
        switch (42) {
            case 42:
                System.out.println("yes");
            case 33:
                System.out.println("ok");
                break;
            default:
                System.out.println("ploxo vse");
        }

//        do {
//
  //          System.out.println("Zachel v do");
//
  //      } while(2<3);
        int []array={1,3,5,7};
        for (int i:array)
        {
            System.out.println(i);

        }
Pp primer=new Pp();
        System.out.println(primer.ab);
    }}



package org.example.week5.specialClass;

//class App1 extends Thread{
//    public void run(){
//        for(int i=1;i<7;i++){
//            // the thread will sleep for the 500 milli seconds
//            try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}
//            System.out.println(i);
//        }
//    }
//    public static void main(String args[]){
//        App1 t1=new App1();
//        App1 t2=new App1();
//
//        t1.start();
//        t2.start();
//    }
//}
// important import statements
import java.lang.Thread;
import java.io.*;


public class App1
{
    // main method
    public static void main(String argvs[]) {
    for(int j = 0; j <5; j++){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(j);
    }
    }
}

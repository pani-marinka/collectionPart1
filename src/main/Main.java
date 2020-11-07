package main;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Collection <Integer> c;
        List<Integer> l;
        //OurList ol=new OurArrayList();
        OurList ol=new ourLinkedList();
        OurList olD=new OurDoubleLinkedList();
        ol.add(1);
        ol.add(2);
        System.out.println(ol);
        ol.get(1);
        ol.set(0,3);
        System.out.println("Get 1 elmnt "+ ol.get(1));
        int i=ol.Indexof(3);
        System.out.println("Indexof: "+i);
        ol.add(4);
        ol.add(3);
        System.out.println(ol);

        i =ol.LastIndexof(3);
        System.out.println("LastIndexof: "+i);
        i=ol.size();
        System.out.println("Size "+i);
        ol.clear();

        i=ol.size();
        System.out.println("Size  "+i);
        boolean b= ol.isEmpty();
        System.out.println(b);
        ol.add(1);
        ol.add(2);
        System.out.println(ol.isEmpty());
        ol.add(3);
        ol.add(5);
        System.out.println("Size "+ ol.size());
        System.out.println(ol);
        ol.remove(2);
        System.out.println("----");
        System.out.println(ol);
        System.out.println("----");
        System.out.println("Size  + "+ ol.size());
        i=ol.LastIndexof(7);
        System.out.println("LastIndexof: "+i);
        System.out.println("Size "+ ol.size());
        ol.remove(8);
        System.out.println("Size "+ ol.size());
        ol.remove(2);
        System.out.println("Size "+ ol.size());
        ol.remove(0);
        System.out.println("Size "+ ol.size());
        ol.remove(0);
        System.out.println("Size "+ ol.size());
        ol.remove(0);
        System.out.println("Size "+ ol.size());
        ol.add(1);
        ol.add(2);
        System.out.println(ol.isEmpty());
        ol.add(3);
        ol.add(5);
        System.out.println("Size "+ ol.size()+ " ----------");
        System.out.println(ol);
        System.out.println(" ----------DoubleList-------");
        olD.add(11);
        olD.add(15);
        System.out.println(olD);
        olD.add(16);
        olD.add(15);
        olD.add(17);
        olD.add(19);
        olD.add(20);
       // olD.add(20);
        System.out.println(olD);
        System.out.println("Size "+ olD.size()+ " ----------");
        System.out.println(olD.get(6));

        System.out.println("Size "+ olD.size()+ " ----------");
        olD.remove(0);
        System.out.println("Size "+ olD.size()+ " ----------");
        System.out.println(olD);
        olD.remove(5);
        System.out.println("Size "+ olD.size()+ " ----------");
        System.out.println(olD);
        olD.remove(-1);
        System.out.println("Size "+ olD.size()+ " ----------");
        System.out.println(olD);
        olD.set(4,3);
        olD.set(3,2);
//        //olD.add(14);
        System.out.println( olD);
        System.out.println("Size "+ olD.size());
        System.out.println("Indexof "+olD.Indexof(15));
        System.out.println("LastIndexof "+olD.LastIndexof(3));
//        System.out.println(olD);
//        System.out.println("Get 0 elmnt 11="+olD.get(0));
//        System.out.println("Get 1 elmnt 15="+olD.get(1));
//        System.out.println("Get 2 elmnt 16="+olD.get(2));
//        System.out.println("Get 3 elmnt 15="+olD.get(3));
       // System.out.println("Get 4 elmnt 14="+olD.get(4));

    }
}

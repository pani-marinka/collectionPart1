package main;

import java.util.Arrays;

public class OurArrayList implements OurList {

  private Integer[] values =new Integer[0];

    @Override
    public void add(Integer e) {
     Integer [] tmp=new Integer[values.length+1];
     System.arraycopy(values,0,tmp,0,values.length);
     tmp[size()]=e;
     values=tmp;
    }

    @Override
    public Integer get(int index) {
        return values[index];
    }

    @Override
    public void set(int index, Integer e) {
     values[index]=e;
    }

    @Override
    public void remove(int index) {
        if (index>values.length-1){
            System.out.println("the value is greater than the size of the array "+values.length);
        } else {

            Integer[] tmp = new Integer[values.length - 1];
            if (index == 0) {
                System.arraycopy(values, index+1, tmp, 0, tmp.length);
                values = tmp;
            } else {
                System.arraycopy(values, 0, tmp, 0, index);
                if (tmp.length != index) {

                    System.arraycopy(values, index + 1, tmp, index, tmp.length-index );
                    values = tmp;
                } else {
                    values = tmp;
                }
            }
        }

    }

    @Override
    public void clear() {
        values =new Integer[0];

    }

    @Override
    public boolean isEmpty() {
        return values.length==0;
    }

    @Override
    public int Indexof(Integer e) {
       int k=0;

        for (Integer i: values )
       // for (int i=0; values.length>i; i++) -for
        {
       if (i==e)     return k;
           // if (values[i]==e ) k=i; - for
         k++;
        }

         return -1;

    }

    @Override
    public int LastIndexof(Integer e) {

        for (int i = values.length; i >0; i--) {

            if (values[i-1]==e)  return i-1;

        }
              return -1;

    }

    @Override
    public int size() {
        return values.length;
    }

//    public void printvalues() {
//        for (Integer i: values  ) {
//            System.out.println(i);
//        }
//    }

    @Override
    public String toString() {
        return "OurArrayList{" +
                 Arrays.toString(values) +
                '}';
    }
}

package main;



public class ourLinkedList implements OurList{

    private class Element {
        Integer value;
        Element next=null;

        public Element (Integer value){
        this.value=value;
    }

    }

    private Element first=null;
    private int sizeLinkedList;
    @Override
    public void add(Integer e) {

        Element newElement=new Element(e);
        if ( first==null) {
            first = newElement;
            sizeLinkedList =1;
        }else {
            Element tmp=first;
            while(tmp.next!=null){
                tmp=tmp.next;
            }

            tmp.next=newElement;
            sizeLinkedList = sizeLinkedList +1;
        }

    }

    @Override
    public Integer get(int index) {
        if (first==null|| index<0){
          return  null;
        }
        Element tmp =first;
        for (int i=0;i<index;i++)
        {
        try {
            tmp = tmp.next;
        } catch (NullPointerException e){
            return null;
        }
        }
        try {
        return tmp.value;
        }catch (NullPointerException e){
            return  null;
        }
    }

    @Override
    public void set(int index, Integer e) {
//todo set tmp.value=e
        if (first==null|| index<0){
            return ;
        }
        Element tmp =first;
        for (int i=0;i<index;i++)
        {

                tmp = tmp.next;

            }
            tmp.value=e;
    }

    @Override
    public void remove(int index) {
           if (index>size()) {
               System.out.println("the value is greater than the size of the array " + size());
                          }
        if (first==null||index<0) {
            return;
        }
         if (index==0){
             first=first.next;
             sizeLinkedList = sizeLinkedList -1;

         }else {

             Element tmp = first;
             for (int i = 0; i < index - 1; i++) {
                 try {
                     tmp = tmp.next;
                 } catch (NullPointerException e) {
                     return;
                 }
             }
         try{
             tmp.next = tmp.next.next;
             sizeLinkedList = sizeLinkedList -1;
             }catch (NullPointerException e){
             return  ;
             }

         }
    }

    @Override
    public void clear() {
            first=null;
        sizeLinkedList =0;
    }

    @Override
    public boolean isEmpty() {
        return first==null;
    }

    @Override
    public int Indexof(Integer e) { //index++ tmp=i return tmp
        Element tmp =first;
        int size=size();

        for (int i=0;i<size;i++)
        {
            if (tmp.value==e) return i;
        }
    return -1;
    }

    @Override
    public int LastIndexof(Integer e) {

        Element tmp =first;

        int size=size();
        int LastNum=-1;

        for (int i=0;i<size;i++) {
            if (tmp.value == e) LastNum = i;
        }
        return LastNum;
    }

    @Override
    public int size() {
        if (first==null){
            return  0;
        }
        return sizeLinkedList;
//      Element tmp=first;  //подсчет вручную
//        int counter=1;
//        while (tmp.next!=null){
//            tmp=tmp.next;
//            counter ++;
//        }
//        return counter++;
    }

    @Override
    public String toString() {
        String result ="ourLinkedList{" ;
        Element tmp=first;
        if (first!=null){
            result+=tmp.value+",";
            while (tmp.next!=null){
                tmp=tmp.next;
                result+=tmp.value+",";
                            }
            result=result.substring(0,result.length()-1);
        }
        result+="}";
        return result;
        }



}


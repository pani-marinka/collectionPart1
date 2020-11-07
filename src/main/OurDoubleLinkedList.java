package main;

public class OurDoubleLinkedList implements OurList{

    // OurDoubleLinkedList
    //private Element last(next&prev -- lastindexof - от конца last po prev to seek

    //Element prev = null

    // add {+prev}
//    private class Element {
//        Integer value;
//        Element next=null;
//        Element last=null;
//        public Element (Integer value){
//            this.value=value;}

    // get po index ( if index v 2oy part of list then use last &priv to seek
    //set po index ( if index v 2oy part of list then use last &priv to seek



     class DElement {

        Integer value;
        DElement next = null;
        DElement prev = null;

        public DElement(Integer value) {
            this.value = value;
        }


    }

    private DElement first=null;
    private DElement last=null;
    private int sizeDoubleLinkedList=0;

    private int indexSizeList;

        @Override
    public void add(Integer e) {
            DElement newDElement=new DElement(e);
            last=newDElement;
            DElement tmp1=null;
            if ( first==null) {
                first = newDElement;

            }else {
                DElement tmp=first;

                while(tmp.next!=null){
                    tmp=tmp.next;
                   if (sizeDoubleLinkedList>1)  {tmp1=tmp;} // получаем предыдущий для нового
                }

                tmp.next=newDElement;//апролняем предыдущий элемент ссылкой на ново добавленный
                //заполняем ссылки на предыдущий для 2ого элемента
                if (sizeDoubleLinkedList==1){ newDElement.prev=first;last.prev=first;}
                //если >=2 о заполняем ссылки на предыдущий
                if (sizeDoubleLinkedList>1) {newDElement.prev=tmp1;last.prev=tmp1;}
            }


            sizeDoubleLinkedList=sizeDoubleLinkedList+1;

        }

    @Override
    public Integer get(int index) {
        if (first==null|| index<0 ||index>=size()){
            return  null;
        }

        if (index==0) return first.value;
        if (index==size()) return last.value;
        DElement tmp =first;
        indexSizeList= size()/2;
        //return indexSizeList;//   7/2 =3

       if ( index<=indexSizeList) {

          for (int i=0; i<index; i++) {
              tmp = tmp.next;
          }

       }else {
           tmp = last;
           for (int i = size(); i > index+1; i--) {
               tmp=tmp.prev;
           }

       }
        return tmp.value;
    }

    @Override
    public void set(int index, Integer e) {
        if (first == null || index < 0 || index >= size()) {
            return;
        }

       DElement tmp = (DElement) getObjectDoubleLinkedList(index);
        tmp.value=e;
    }

    @Override
    public void remove(int index) {
        if (first == null || index < 0 || index >= size()) {
            return;
        }

        DElement tmp = (DElement) getObjectDoubleLinkedList(index);

        //first?
        if (tmp.prev == null) {

            tmp=tmp.next;
            tmp.prev=null;
            first=tmp;
            System.out.println("tmp.value "+tmp.value);
        } else {
            //last?
            if (tmp.next == null) { //3
                tmp = tmp.prev;
                tmp.next = null;
                last = tmp;
            } else {
                System.out.println(tmp.value);
                tmp.prev.next = tmp.next;
                tmp.next.prev = tmp.prev;

            }
        }

        sizeDoubleLinkedList=sizeDoubleLinkedList-1;
        }






    @Override
    public void clear() {
        first=null;
        last=null;
        sizeDoubleLinkedList=0;
    }

    @Override
    public boolean isEmpty() {
        return first==null;
    }

    @Override
    public int Indexof(Integer e) {
        if (first==null ){
            return  -1;
        }
          //if один объект
        if (size()==0) {
            if(first.value==e)
        {return 0;}else {return -1;}
        }

        DElement tmp =first;// first не проверяем
        for (int i=0; i<size(); i++) {
            if(tmp.value==e)  return  i;
            tmp = tmp.next;
        }
        return -1;
    }

    @Override
    public int LastIndexof(Integer e) {
        if (first==null ){
            return  -1;
        }
// if один объект
        if (size()==0) {
            if(first.value==e)
            {return 0;}else {return -1;}
        }



        DElement tmp = last;
        for (int i=size()-1; i>0; i--) {
            if(tmp.value==e)  return  i;
            tmp = tmp.prev;
        }
        return -1;
    }

    @Override
    public int size() {
            if (first==null)   return  0;

            return sizeDoubleLinkedList;
    }

    @Override
    public String toString() {

        DElement tmp=first;
String result ="ourDoubleLinkedList"+"\n"+ "First "+  first.value+ " first.next: "+first.next +" first.prev: " +first.prev+ "\n"+"{" ;
        if (first!=null){
            result+=tmp.value+", tmp.next: "+tmp.next+ " tmp.prev: "+tmp.prev+"\n";
            while (tmp.next!=null){
                tmp=tmp.next;

                result+=tmp.value+", tmp.next: "+tmp.next+ " tmp.prev: "+tmp.prev+"\n";
            }
            result=result.substring(0,result.length()-1);
        }
        result+="}"+"\n"+ "Last "+last.value+ " next: "+last.next+" prev: "+last.prev;
        return result;
    }

      private Object getObjectDoubleLinkedList(int index) {
          DElement tmp = first;
          if (index == 0)  return tmp;
          indexSizeList = sizeDoubleLinkedList / 2;
          //return indexSizeList;//   7/2 =3

          if (index <= indexSizeList) {

              for (int i = 0; i < index; i++) {
                  tmp = tmp.next;
              }

          } else {
              tmp = last;
              for (int i = size(); i > index + 1; i--) {
                  tmp = tmp.prev;
              }

          }
          return tmp;
      }

}

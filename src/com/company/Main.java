package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList=new ArrayList<Integer>(20);
        for (int i = 0; i <10 ; i++) {
            arrayList.add(i);
        }
        //ArrayList`s  first  Traversal method
//        Iterator value=null;
//        Iterator iter=arrayList.iterator();
//        while(iter.hasNext()) {
//            System.out.println((Integer) iter.next());
//        }
//        //ArrayList`s  second  Traversal method,随机访问遍历的效率最高
//        int size=arrayList.size();
//        for (int i = 0; i < size; i++) {
//            System.out.println((Integer) arrayList.get(i));
//
//        }
//        //ArrayList`s  third  Traversal methods
//        for ( Integer tvalue:arrayList) {
//            System.out.println(tvalue);
//        }
        arrayList.add(10,10);
        arrayList.set(1,10);
        Integer[] arr=(Integer[])arrayList.toArray(new Integer[0]);
        //参考ArrayList的toArray() 得知：
       // toArray() 会抛出异常是因为 toArray() 返回的是 Object[] 数组，将 Object[] 转换为其它类型(如如，将Object[]转换为的Integer[])则会抛出“java.lang.ClassCastException”异常
       // ，因为Java不支持向下转型。具体的可以参考前面ArrayList.java的源码介绍部分的toArray()。
        //Integer[] newText = (Integer[])v.toArray(new Integer[0]);
        Iterator iter=arrayList.iterator();
        while(iter.hasNext()) {
            System.out.println((Integer) iter.next());
        }
        System.out.println("ArrayList is empty:"+arrayList.isEmpty());

    }
}

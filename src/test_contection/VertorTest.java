package test_contection;
//vector 和ArrayList不同，Vector中的操作是线程安全的


import java.util.Enumeration;
import java.util.Vector;

public class VertorTest {
    public static void main(String[] args) {
        Vector vector=new Vector(10);
        for (int i = 0; i <10 ; i++) {
            vector.add(i);
        }
        vector.set(1,100);
        vector.add(22);
        Enumeration enu=vector.elements();
        System.out.println(vector);
        System.out.println("100`s 索引："+vector.indexOf(100));
        System.out.println("Vector 的真实长度为："+vector.size());
        System.out.println("Vector`s capacity:"+vector.capacity());
        //所以Vector数组作为一种可伸缩的数组,当数据个数大于初始给定的数组大小时
        // ，容量就会成两倍increse;

        //sublist() 函数实现了数组的截断
        System.out.println("vec 2 to 4"+vector.subList(2,5));
        while (enu.hasMoreElements())
            System.out.println(enu.nextElement());
        System.out.println("Vector 数组也可以转化为其他类型的数组：");

        //Object [] 数组向Integer数组的转型，Integer、String、Object
        Integer[] arr=(Integer[]) vector.toArray(new Integer[0]);
        for (int inte:arr) System.out.println(inte);
        System.out.println("toString()方法"+vector.toString());
        System.out.println("获取最后一个元素:"+vector.lastElement());
        System.out.println();
        vector.clear();
        System.out.println("Vector 被清空："+vector.isEmpty());

    }
}

package test_contection;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack stack=new Stack();
        for (int i = 0; i <10 ; i++) {
            stack.push(i);
        }
        System.out.println(stack);
        System.out.println("stack`s length:"+stack.size());
        //使用从Vector继承下来的indexOf查找时，失去了栈的意义，相当于普通数组
        System.out.println("6 的索引位置是："+stack.indexOf(6));
        //使用栈本身自带的search函数.可以得到元素在STACK中的位置
        System.out.println("6 的索引位置是："+stack.search(6));
        for (int i = 0;!stack.isEmpty(); i++) {
            System.out.println(stack.pop());
        }

    }
}

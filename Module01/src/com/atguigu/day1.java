package com.atguigu;

import java.util.ArrayList;

/**
 * @author lyh
 * @date 2020/12/19-16:46
 */
public class day1 {
    public static void main(String[] args) {
        String[] arr=new String[]{"1","2","3"};
        for (int i = 0; i <arr.length ; i++) {//fori
            System.out.println(arr[i]);
        }

        for (String s : arr) {//iter
            System.out.println(s);
        }
        ArrayList<Object> li = new ArrayList<>();
        li.add("hh");
        li.add("jj");
        li.add("kk");
        for (Object o : li) {//li.for
            System.out.println(o);
        }
        for (int i = 0; i < li.size(); i++) {//li.fori//顺序输出
            System.out.println(li);
        }
        for (int i = li.size() - 1; i >= 0; i--) {//li.forr倒序输出
            System.out.println(li);
        }
        if (li == null) {//ifn

        }
        if (li != null) {//inn

        }
        if (li != null) {//li.nn

        }
        if (li == null) {//li.null

        }
    }
}

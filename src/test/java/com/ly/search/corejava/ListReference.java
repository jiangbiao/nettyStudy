package com.ly.search.corejava;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jb28755 on 2017/9/14.
 */
public class ListReference {

    private void test(){
        List<Bean> list = new ArrayList<Bean>();
        list.add(new Bean("a"));
        list.add(new Bean("b"));
        list.add(new Bean("c"));
        for (Bean s : list) {
            s.a = "g";
        }

        for (Bean s : list) {
            System.out.println(s);
        }
    }

    private void test2(){
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        for (Integer s : list) {
            s = 4;
        }

        for (Integer s : list) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        new ListReference().test();
    }

    class Bean{
        String a;

        public Bean(String a) {
            this.a = a;
        }

        public String getA() {
            return a;
        }

        public void setA(String a) {
            this.a = a;
        }

        @Override
        public String toString() {
            return "Bean{" +
                    "a='" + a + '\'' +
                    '}';
        }
    }
}

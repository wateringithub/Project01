package com.xuwl.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by xuwl on 2019/5/1.
 */
public class HelloWorld {
    private static final int INITIAL_SIZE=10;

    @Override
    public String toString() {
        return "HelloWorld{}";
    }

    public HelloWorld() {

    }

    public static void main(String[] args) {
        ttt();

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        //</editor-fold>
        for (int i : arrayList) {
            System.out.println(i);
        }
        if (true) {
            method1();
        }
    }

    private static void ttt() {
        //<editor-fold desc="Description">
        System.out.println("helloworld!!!");
        //region Description
        Map map = new HashMap();
        //endregion
    }

    public static void method1() {
        try {
            FileInputStream fis =new FileInputStream("ttt.text");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

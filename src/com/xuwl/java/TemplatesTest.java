package com.xuwl.java;

import com.xuwl.bean.Customer;

import java.util.ArrayList;

/**
 * Created by xuwl on 2019/5/1.
 */
public class TemplatesTest {
    private static final Customer CUST=new Customer();
    public static final int NUM=1;
    public static final int NUM2=2;
    public static final String S="";

    public static void main(String[] args) {
        System.out.println();
        System.out.println("args = [" + args + "]");
        System.out.println("TemplatesTest.main");
        System.out.println("args = " + args);
        int t=0;
        System.out.println("t = " + t);

        String[] arr=new String[]{"111","222"};
        for (int i = 0; i < arr.length; i++) {
            
        }
        for (String s : arr) {
            
        }
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            
        }

        ArrayList list = new ArrayList();
        for (Object o : list) {

        }
        for (int i = 0; i < list.size(); i++) {
            
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }
        if (list == null) {

        }
        if (list != null) {

        }
        if (list == null) {

        }
        if (list != null) {

        }


    }

}

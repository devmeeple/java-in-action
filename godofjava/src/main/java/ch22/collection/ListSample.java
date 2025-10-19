package ch22.collection;

import java.util.ArrayList;

public class ListSample {
    public static void main(String[] args) {
        ListSample sample = new ListSample();

//        sample.checkArrayList2();
//        sample.checkArrayList3();
//        sample.checkArrayList4();
//        sample.checkArrayList5();
//        sample.checkArrayList6();
        sample.checkArrayList7();
    }

    public void checkArrayList2() {
        ArrayList<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add(1, "A1");

        for (String tempData : list) {
            System.out.println(tempData);
        }
    }

    public void checkArrayList3() {
        ArrayList<String> list1 = new ArrayList<>();

        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");
        list1.add("E");
        list1.add(1, "A1");

        ArrayList<String> list2 = new ArrayList<>();

        list2.add("0 ");
        list2.addAll(list1);
        for (String tempData : list2) {
            System.out.println("List2 " + tempData);
        }
    }

    public void checkArrayList4() {
        ArrayList<String> list1 = new ArrayList<>();

        list1.add("A");

        ArrayList<String> list2 = list1;
        list1.add("Ooops");
        for (String tempData : list2) {
            System.out.println("List2 " + tempData);
        }
    }

    public void checkArrayList5() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");

        int listSize = list.size();
        for (int loop = 0; loop < listSize; loop++) {
            System.out.println("list.get(" + loop + ") = " + list.get(loop));

        }
    }

    public void checkArrayList6() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");

        String[] strList = list.toArray(new String[0]);
        System.out.println(strList[0]);
    }

    public void checkArrayList7() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        String[] tempArray = new String[3];
        String[] strList = list.toArray(tempArray);
        for (String temp : strList) {
            System.out.println(temp);
        }
    }
}

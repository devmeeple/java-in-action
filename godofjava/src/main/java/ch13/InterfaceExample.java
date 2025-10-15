package ch13;

import ch13.service.MemberManager;
import ch13.service.MemberManagerImpl;

public class InterfaceExample {
    public static void main(String[] args) {
//        MemberManager manager = new MemberManager(); // compile error
        MemberManager manager = new MemberManagerImpl();
    }
}

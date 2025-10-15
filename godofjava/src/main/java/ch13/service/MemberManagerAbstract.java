package ch13.service;

import ch13.model.MemberDTO;

public abstract class MemberManagerAbstract {
    public abstract boolean addMember(MemberDTO memberDTO);

    public abstract boolean updateMember(MemberDTO memberDTO);

    public abstract boolean removeMember(String name, String phone);

    public void printLog(String data) {
        System.out.println("Data = " + data);
    }
}

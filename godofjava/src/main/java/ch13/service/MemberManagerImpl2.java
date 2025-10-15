package ch13.service;

import ch13.model.MemberDTO;

public class MemberManagerImpl2 extends MemberManagerAbstract {
    @Override
    public boolean addMember(MemberDTO memberDTO) {
        return false;
    }

    @Override
    public boolean updateMember(MemberDTO memberDTO) {
        return false;
    }

    @Override
    public boolean removeMember(String name, String phone) {
        return false;
    }
}

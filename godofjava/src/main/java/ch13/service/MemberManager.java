package ch13.service;

import ch13.model.MemberDTO;

public interface MemberManager {
    public boolean addMember(MemberDTO member);

    public boolean updateMember(MemberDTO member);

    public boolean removeMember(String name, String phone);
}

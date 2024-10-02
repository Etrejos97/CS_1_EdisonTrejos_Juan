package com;

public class AuthorizedPersons extends ClubMember {
    private Member member;


    public AuthorizedPersons(String name, String id, Member member) {
        super(name,id);
        this.member = member;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    @Override
    public String toString() {
        return  "Cedula: "+ id + "\nNombre: " + name  +
                "\nCedula del socio al que esta afiliado: " + member.getId();
    }
}

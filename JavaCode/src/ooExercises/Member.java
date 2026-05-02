package ooExercises;

public class Member {
    private String name;
    private int memberId;
    private static int memberCount;

    Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
        Member.memberCount++;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    //getter
    public String getName() {
        return name;
    }

    public int getMemberId() {
        return memberId;
    }

    public static int getMemberCount() {
        return memberCount;
    }

    public String getMemberDetails() {
        return "Member Details" + "\n" +
                "Member ID: " + memberId + "\n" +
                "Name: " + name + "\n";
    }
}

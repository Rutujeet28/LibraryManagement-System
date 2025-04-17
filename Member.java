public class Member{
    private String name;
    private String membershipId;

    public Member(String name, String membershipId)
    {
        this.name = name;
        this.membershipId = membershipId;
    }

    public String getName(){
        return name;
    }

    public String getmembershipId(){
        return membershipId;
    }
}
package samsungtdd.builderlombok;

public class BuilderDemo {
    public static void main(String[] args) {
        SDSUser user = SDSUser.builder().userName("Khanh Tran").Id(1).password("abc123").build();
        SDSUser user2 = new SDSUser();
        SDSUser user3 = new SDSUser(1, "KhanhTran", "ABC123");
        System.out.println(user.getUserName());
        System.out.println(user3.getUserName());
    }
}

public class Member {
    // 회원정보
    private final int id;
    private String name;
    private int age;
    private int phoneNumber;

    // 생성자
    public Member(int id, String name, int age, int phoneNumber) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }
    // getter 메서드
    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public int getPhoneNumber() { return phoneNumber; }

    // setter 메서드, id는 변경되지 않는 값이라 setter X
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setPhoneNumber(int phoneNumber) { this.phoneNumber = phoneNumber; }
}
public class Member {
    private final int id;
    private String name;
    private int age;
    private int phoneNumber;

    public Member(int id, String name, int age, int phoneNumber) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }
    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public int getPhoneNumber() { return phoneNumber; }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setPhoneNumber(int phoneNumber) { this.phoneNumber = phoneNumber; }
}

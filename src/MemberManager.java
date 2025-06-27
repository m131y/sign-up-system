import java.util.Scanner;

public class MemberManager {
    private static final int MAX = 50;
    private static Member[] members = new Member[MAX];
    private int count = 0;
    private int idCounter = 1;

    public void addMember(Scanner sc) {
        if (count >= members.length) {
            System.out.println("50명 초과.️ 더 이상 회원을 등록할 수 없습니다.");
            return;
        }

        System.out.print("이름: ");
        String name = sc.nextLine();
        System.out.print("나이: ");
        int age = sc.nextInt();
        System.out.print("전화번호(숫자만): ");
        int phoneNumber = sc.nextInt();
        sc.nextLine();

        members[count++] = new Member(idCounter++, name, age, phoneNumber);
        System.out.println(" 회원 등록 완료 . . .");
    }

    public void printAllMembers() {
        if (count == 0) {
            System.out.println("등록된 회원이 없습니다.");
            return;
        }
        System.out.println("\n전체 회원 목록:");
        for (int i = 0; i < count; i++) {
            System.out.println("[" + members[i].getId() + "] 이름 : " + members[i].getName() + " 나이 : " + members[i].getAge());
        }
    }

    public void deleteMember(Scanner sc){
        printAllMembers();
        System.out.print("삭제할 회원의 ID를 입력하세요: ");
        int id = sc.nextInt();
        sc.nextLine();

        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (members[i].getId() == id) {
                // 삭제: 뒤 요소를 한 칸씩 당김
                for (int j = i; j < count - 1; j++) {
                    members[j] = members[j + 1];
                }
                members[--count] = null;
                System.out.println("회원이 삭제되었습니다.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("해당 ID의 회원이 없습니다.");
        }

    }

    public void updateMember(Scanner sc){
        printAllMembers();
        System.out.print("수정할 회원의 ID를 입력하세요: ");
        int id = sc.nextInt();
        sc.nextLine();

        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (members[i].getId() == id) {
                System.out.println("\n현재 정보 : [" + members[i].getId() + "] 이름 : " + members[i].getName() + " 나이 : " + members[i].getAge());

                System.out.print("이름: ");
                String name = sc.nextLine();
                System.out.print("나이: ");
                int age = sc.nextInt();
                System.out.print("전화번호(숫자만): ");
                int phoneNumber = sc.nextInt();
                sc.nextLine();

                members[i].setName(name);
                members[i].setAge(age);
                members[i].setPhoneNumber(phoneNumber);
                System.out.println("회원 정보가 수정되었습니다.");

                System.out.println("\n현재 정보 : [" + members[i].getId() + "] 이름 : " + members[i].getName() + " 나이 : " + members[i].getAge());

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("해당 ID의 회원이 없습니다.");
        }

    }
}

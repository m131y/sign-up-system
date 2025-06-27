import java.util.Scanner;

public class MemberManager {
    private static final int MAX = 50;           // 최대 회원 수 상수 선언
    private static Member[] members = new Member[MAX]; // 회원 정보를 저장할 배열
    private int count = 0;                       // 현재 등록된 회원 수
    private int idCounter = 1;                   // 고유 ID를 생성하기 위한 카운터

    // 회원 등록 기능
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

        // 새 Member 객체를 배열에 추가
        members[count++] = new Member(idCounter++, name, age, phoneNumber);
        System.out.println(" 회원 등록 완료 . . .");
    }

    // 전체 회원 목록 출력
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

    // 회원 삭제 기능
    public void deleteMember(Scanner sc){
        printAllMembers(); // 현재 회원 목록 먼저 출력
        System.out.print("삭제할 회원의 ID를 입력하세요: ");
        int id = sc.nextInt();
        sc.nextLine();

        boolean found = false;

        // 배열에서 해당 ID를 가진 회원을 찾아 삭제
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
    // 회원 정보 수정 기능
    public void updateMember(Scanner sc){
        printAllMembers(); // 현재 회원 목록 먼저 출력
        System.out.print("수정할 회원의 ID를 입력하세요: ");
        int id = sc.nextInt();
        sc.nextLine();

        boolean found = false;

        // 배열에서 해당 ID를 가진 회원을 찾아 수정
        for (int i = 0; i < count; i++) {
            if (members[i].getId() == id) {
                // 기존 정보 출력
                System.out.println("\n현재 정보 : [" + members[i].getId() + "] 이름 : " + members[i].getName() + " 나이 : " + members[i].getAge());

                System.out.print("이름: ");
                String name = sc.nextLine();
                System.out.print("나이: ");
                int age = sc.nextInt();
                System.out.print("전화번호(숫자만): ");
                int phoneNumber = sc.nextInt();
                sc.nextLine();

                // 수정 적용
                members[i].setName(name);
                members[i].setAge(age);
                members[i].setPhoneNumber(phoneNumber);
                System.out.println("회원 정보가 수정되었습니다.");

                // 수정 후 정보 출력
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

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MemberManager manager = new MemberManager();

        // 사용자가 종료(0)을 입력할 때까지 반복
        while (true) {
            // 메뉴 안내 출력
            System.out.println("\n회원 등록 시스템 입니다.");
            System.out.println("원하시는 메뉴를 골라주세요.");
            System.out.println("1. 회원 등록");
            System.out.println("2. 회원 삭제");
            System.out.println("3. 회원 정보 수정");
            System.out.println("4. 전체 회원 출력");
            System.out.println("0. 종료");
            System.out.print("선택: ");

            int choice = sc.nextInt();
            sc.nextLine();

            // 메뉴 선택 처리
            switch (choice) {
                case 1:
                    System.out.println("회원등록");
                    manager.addMember(sc); // 회원 등록 기능 호출
                    break;
                case 2:
                    System.out.println("회원삭제");
                    manager.deleteMember(sc); // 회원 삭제 기능 호출
                    break;
                case 3:
                    System.out.println("회원수정");
                    manager.updateMember(sc); // 회원 정보 수정 기능 호출
                    break;
                case 4:
                    System.out.println("전체 회원 출력");
                    manager.printAllMembers(); // 전체 회원 목록 출력 기능 호출
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 입력입니다.");
            }
        }
    }
}
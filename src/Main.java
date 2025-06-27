import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MemberManager manager = new MemberManager();

        while (true) {
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

            switch (choice) {
                case 1:
                    System.out.println("회원등록");
                    manager.addMember(sc);
                    break;
                case 2:
                    System.out.println("회원삭제");
                    manager.deleteMember(sc);
                    break;
                case 3:
                    System.out.println("회원수정");
                    manager.updateMember(sc);
                    break;
                case 4:
                    System.out.println("전체 회원 출력");
                    manager.printAllMembers();
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
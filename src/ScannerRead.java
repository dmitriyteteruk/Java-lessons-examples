import java.util.Scanner;

public class ScannerRead {

    public static void main (String[] args){
        System.out.println("������� ����� ����� ���: ");
        Scanner scan42 = new Scanner(System.in);
        int scan42int = scan42.nextInt();

        System.out.println("������� ����� ���: ");
        Scanner scan100 = new Scanner(System.in);
        int scan100int = scan100.nextInt();

        System.out.println("������� ����� ��� �������� ����: ");
        Scanner scan125 = new Scanner(System.in);
        int scan125int = scan125.nextInt();

        System.out.println("�� ����� �����: \n" + scan42int + "\n" + scan100int + "\n" + scan125int);
    }
}
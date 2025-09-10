import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ten: ");
        String ten = sc.nextLine();

        System.out.print("Nhap tuoi: ");
        int tuoi = sc.nextInt();

        System.out.print("Nhap chieu cao (m): ");
        double chieucao = sc.nextDouble();

        sc.nextLine(); 

        System.out.print("Nhap gioi tinh (M/F): ");
        char gioitinh = sc.nextLine().charAt(0);

        System.out.print("Ban co thich lap trinh khong? (Co/Khong): ");
        String likeInput = sc.nextLine();
        boolean likesProgramming = likeInput.equalsIgnoreCase("Co");

        sc.close();

     
        System.out.println("\n--- Thong tin ---");
        System.out.println("Ten: " + ten);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Chieu cao: " + chieucao + " m");
        System.out.println("Gioi tinh: " + gioitinh);
        System.out.println("Thich lap trinh: " + (likesProgramming ? "Co" : "Khong"));
    }
}

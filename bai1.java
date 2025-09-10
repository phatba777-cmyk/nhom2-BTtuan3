import java.util.Scanner;  // Thư viện để nhập dữ liệu từ bàn phím

public class Bai1 {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để nhập dữ liệu
        Scanner scanner = new Scanner(System.in);

        // Yêu cầu người dùng nhập tên
        System.out.print("Nhap ten cua ban: ");
        String ten = scanner.nextLine();  // Đọc chuỗi nhập vào

        // Xuất kết quả ra màn hình
        System.out.println("Hello " + ten);

        // Đóng Scanner
        scanner.close();
    }
}


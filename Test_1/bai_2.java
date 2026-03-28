import java.util.Scanner;

public class bai_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("----- CHUONG TRINH GIAI PHUONG TRINH -----");
        System.out.println("1. Phuong trinh bac nhat 1 an (ax + b = 0)");
        System.out.println("2. He phuong trinh bac nhat 2 an");
        System.out.println("3. Phuong trinh bac hai 1 an (ax^2 + bx + c = 0)");
        System.out.print("Moi ban chon (1-3): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                solveLinearEquation(scanner);
                break;
            case 2:
                solveLinearSystem(scanner);
                break;
            case 3:
                solveQuadraticEquation(scanner);
                break;
            default:
                System.out.println("Lua chon khong hop le!");
        }
        scanner.close();
    }

    // 1. Giai phuong trinh bac nhat: ax + b = 0
    public static void solveLinearEquation(Scanner scanner) {
        System.out.print("Nhap a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhap b: ");
        double b = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh co vo so nghiem.");
            } else {
                System.out.println("Phuong trinh vo nghiem.");
            }
        } else {
            double x = -b / a;
            System.out.println("Phuong trinh co nghiem duy nhat: x = " + x);
        }
    }

    // 2. Giai he phuong trinh bac nhat 2 an (dung quy tac Cramer)
    public static void solveLinearSystem(Scanner scanner) {
        System.out.println("Nhap cac he so cho he: ");
        System.out.println("a11*x1 + a12*x2 = b1");
        System.out.println("a21*x1 + a22*x2 = b2");
        
        System.out.print("a11 = "); double a11 = scanner.nextDouble();
        System.out.print("a12 = "); double a12 = scanner.nextDouble();
        System.out.print("b1  = "); double b1  = scanner.nextDouble();
        System.out.print("a21 = "); double a21 = scanner.nextDouble();
        System.out.print("a22 = "); double a22 = scanner.nextDouble();
        System.out.print("b2  = "); double b2  = scanner.nextDouble();

        double D  = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;

        if (D != 0) {
            double x1 = D1 / D;
            double x2 = D2 / D;
            System.out.println("He co nghiem duy nhat: x1 = " + x1 + ", x2 = " + x2);
        } else {
            if (D1 == 0 && D2 == 0) {
                System.out.println("He co vo so nghiem.");
            } else {
                System.out.println("He vo nghiem.");
            }
        }
    }

    // 3. Giai phuong trinh bac hai: ax^2 + bx + c = 0
    public static void solveQuadraticEquation(Scanner scanner) {
        System.out.print("Nhap a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhap b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhap c: ");
        double c = scanner.nextDouble();

        if (a == 0) {
            // Tro thanh phuong trinh bac nhat bx + c = 0
            System.out.println("Vi a=0, giai phuong trinh bac nhat " + b + "x + " + c + " = 0");
            if (b == 0) {
                if (c == 0) System.out.println("Phuong trinh vo so nghiem.");
                else System.out.println("Phuong trinh vo nghiem.");
            } else {
                System.out.println("Nghiem x = " + (-c / b));
            }
        } else {
            double delta = b * b - 4 * a * c;
            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phuong trinh co 2 nghiem phan biet: x1 = " + x1 + ", x2 = " + x2);
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Phuong trinh co nghiem kep: x = " + x);
            } else {
                System.out.println("Phuong trinh vo nghiem (khong co nghiem thuc).");
            }
        }
    }
}
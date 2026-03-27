import javax.swing.JOptionPane;

public class bai_1 {
    public static void main(String[] args) {
        // Nhập số thứ nhất
        String strNum1 = JOptionPane.showInputDialog(null, 
            "Please input the first number: ", "Input the first number", 
            JOptionPane.INFORMATION_MESSAGE);
        
        // Nhập số thứ hai
        String strNum2 = JOptionPane.showInputDialog(null, 
            "Please input the second number: ", "Input the second number", 
            JOptionPane.INFORMATION_MESSAGE);

        // Chuyển đổi từ chuỗi sang số thực double [1]
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        // Tính toán
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        
        String result = "Sum: " + sum + "\n"
                      + "Difference: " + difference + "\n"
                      + "Product: " + product + "\n";

        // Kiểm tra số chia để tính thương [1]
        if (num2 != 0) {
            double quotient = num1 / num2;
            result += "Quotient: " + quotient;
        } else {
            result += "Quotient: Cannot divide by zero!";
        }

        // Hiển thị kết quả
        JOptionPane.showMessageDialog(null, result, 
            "Calculation Results", JOptionPane.INFORMATION_MESSAGE);
        
        System.exit(0);
    }
}

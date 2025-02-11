public class BitwiseOperatots {
    public static void main(String[] args) {
        int a = 5;  // 0101 in binary
        int b = 3;  // 0011 in binary

        int and = a & b;
        int or = a | b;
        int xor = a ^ b;
        int not = ~a;
        int leftShift = a << 1;
        int rightShift = a >> 1;

        System.out.println("AND : " + and);  // AND
        System.out.println("OR : " + or);  // OR
        System.out.println("XOR : " + xor);  // XOR
        System.out.println("NOT : " + not);  // NOT
        System.out.println("Left Shift : " + leftShift);  // Left Shift
        System.out.println("Right Shift : " + rightShift);  // Right Shift

        }

    }

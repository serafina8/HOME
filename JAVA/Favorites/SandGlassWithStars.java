public class SandGlass {
 
    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
 
    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }
 
    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printSpaces(size - i);
            printStars(i);
        }
    }
 
    public static void sandGlass(int height) {
        for (int i = 0; i < height; i++) {
            printSpaces(i);
            printStars(height - i + (height - i - 1));
        }
        for (int i = 2; i <= height; i++) {
            printSpaces(height - i);
            printStars(i + (i - 1));
        }
    }
 
    public static void main(String[] args) {
        printTriangle(5);
        System.out.println("---");
        sandGlass(4);
        System.out.println("---");
        sandGlass(10);
    }
    
}
 

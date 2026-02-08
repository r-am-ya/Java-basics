public class Alphabets {
    public static void main(String[] args) {
        //uppercase
        for(char c = 'A'; c <= 'Z'; c++) {
            System.out.print(c + " ");
        }
        System.out.println();
        //lowercase
        for(char c = 'a'; c <= 'z'; c++) {
            System.out.print(c + " ");
        }
        
        System.out.println();
        //using ASCII(A=65,Z=90; a=97, z=122)
        // for(int i = 65; i <= 90; i++) {
        //     System.out.print((char)i + " ");
        // }
        // System.out.println();
        // for(int i = 97; i <= 122; i++) {
        //     System.out.print((char)i + " ");
        // }
    }
}

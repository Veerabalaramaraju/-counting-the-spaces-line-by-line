import java.util.Scanner;
class New5 {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String[] abc = new String[a+1];
        for (int i = 0; i < a+1; i++) {
            abc[i] = sc.nextLine();
        }
        for (int j = 0; j < a+1; j++) {
            int count = 0;
            String b = abc[j];
            for (int k = 0; k < b.length(); k++) {
                if (b.charAt(k) == ' ') {
                    count = count + 1;
                } else if (b.charAt(k) == '\t') {
                    count = count + 4;
                } else {

                }
            }
            System.out.println(count + " " + abc[j]);
        }
    }
}
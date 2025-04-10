package BasicsOfJava;

public class Pattern1 {

    public static void main(String[] args) {

        pattern(4);

    }

    static void pattern(int size){

        int symbols = 1;
        for(int line = 1 ; line <= size + 1 ; line ++) {

            for ( symbols; symbols < (line + symbols); symbols++) {

                System.out.print(symbols);
            }
            System.out.println();
        }

    }
}

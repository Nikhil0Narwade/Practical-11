package BasicsOfJava;

public class Sum {
    public static void main(String[] args) {


        System.out.println(getSum(142));

    }
    static String getSum(int num){

        String s = String.valueOf(num);
        int a = s.length();
      //  System.out.println(a);
        int mod,sum=0;
        String ss = "";
        for(int i = 0; i<a ; i++ ){

             mod =  num %10;
             sum += mod;
              ss = ss +  String.valueOf(mod) + "+" ;
             num = num / 10;



        }
       // System.out.println(sum);
    //    System.out.println(ss);
        int aa = ss.length();
      //  System.out.println(aa);
        int b = aa-1;
        String aq = ss.substring(0,b);
        //int ab = aq.length();
        //System.out.println(aq);
        StringBuilder str = new StringBuilder(aq);
      //  str.reverse();
        str.reverse();
        String szz = str.toString();
        szz = szz + "=" + sum;
        String amz =  String.valueOf(szz);
        //System.out.println(szz);

        return amz;
    }
}

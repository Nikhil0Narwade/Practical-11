public class Ise5 {
    
Ise5(int no){

    System.out.println("Hi from Ise5()"+no);
}

public int generateSum( int b,int... numbers){
int sum = 0;
for(int num : numbers){
    sum+=num;
}
return sum;

}
static public void main(String[] args) {

    int[] a = {10,20,30};
   
    System.out.println(new Ise5(111).generateSum(6,a));

   // System.out.println(new Ise5(111).generateSum(10,20,30,50));
  //  System.out.println(new Ise5(111).generateSum());

    
}


}

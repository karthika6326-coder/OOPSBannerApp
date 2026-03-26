public class OOPSBannerApp {
    public static void main(String[] args) {
       System.out.println(args[0]);
	   int[] numbers = new int[5];
	   for(int i=0;i<numbers.length;i++){
		   numbers[i]=i+1;
	   }
	   for(int i=0;i<numbers.length;i++){
		System.out.println(numbers[i]);   
	   }
    }
}
public class Main
{
	public static void main(String[] args) {
		System.out.println(fact(5));
	}
	public static int fact(int num){
        if(num>0){
            return (num*fact(num-1));
        }
        return 1;
    }
}

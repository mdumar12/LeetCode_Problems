
Slow & Fast Pointer Solution :

Basically, this approach is used in linked lists for cycle detection!
/*
This is my solution :
Using brute force :
//I don't know much about Asymptotic Analysis, but soon, I will.
//Space Complexity is O(log n)
//Time Complexity is O(n).
class Solution {
    public boolean isHappy(int n) {
        //
        int temp1=n;
        do{
            int sum=0;
            while(temp1!=0){
                sum+=(int)Math.pow(temp1%10,2);
                temp1/=10;
            }
            temp1=sum;
            if(sum==1){
                return true;
            }
            //Why I am taking it as 4 in condition because, if a number is not a happy number then it will iterate until it reaches to 4 or 20 
            //We can take any one of them 20 or 4.
        }while(temp1!=4);

        return false;
    }
}

*/
class HappyNumberSlow&FastAlgoFromLinkedList {
    public boolean isHappy(int n) {
	
        int slow = n;
        int fast = n;
		
		do {
			slow = HappyNumber(slow);
            fast = HappyNumber(HappyNumber(fast));
		} while (slow != fast);
		
		if (slow == 1) {
			return true;
		}
		return false;
	}
	static int HappyNumber(int n) {

		int sum = 0;
		while (n > 0) {
      sum+=(int)Math.pow(n%10,2);
      n/=10;
			/*int Rem = N % 10;
			N /= 10;
			sum += (Rem * Rem);*/
		}
    return sum;
	}
}

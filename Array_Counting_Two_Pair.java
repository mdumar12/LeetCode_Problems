/*

#faq-wrap #faq .card {
  margin-bottom: 20px;
}

#faq-wrap #faq .card .card-header {
  border: 0;
  border-radius: 2px;
  padding: 0;
}

#faq-wrap #faq .card .card-header .btn-collapse {
  color: white;
  display: block;
  text-align: left;
  background: rgb(121, 62, 62);
  padding: 20px;
  font-family: "Montserrat", sans-serif;
  font-size: 14px;
}

#faq-wrap #faq .card .card-header .btn-collapse.collapsed {
  background: rgb(121, 62, 62);
  color: white
}

#faq-wrap #faq .card .collapsing {
  background: rgb(228, 219, 219);
  
}

#faq-wrap #faq .card .collapse.show {
  background: rgb(228, 219, 219);
  color: rgb(121, 62, 62);
  font-family: "Montserrat", sans-serif;
  font-size: 14px;
}
*/
public class Counting_Two_Pair
{
	public static void main(String[] args) {
	    int nums[]={1,1,1,2,2,3};
	    int k=0;
	    int count=0;
        for(int i=0;i<nums.length;i++){
            if(i<nums.length-1 || nums[nums.length-1]!=nums[nums.length-2]){
                k++;
            }
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                    if(count==1){
                        k++;
                    }
                }
                else{
                    i=j-1;
                    count=0;
                    break;
                }
            }
        }
		System.out.println(k);
	}
}

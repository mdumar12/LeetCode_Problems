/*

import {Utilities} from "./utilities.js";
//login
const login=(e)=>{
    // fetch form data
    const loginFormData={
        email : e.target.user.value,
        password : e.target.pass.value
    }
    //check if user exists in backend
    Utilities.getUser(loginFormData)
    .then(user=> {
        if(user){
            return user;
        }else{
            throw new Error('Please register before you login');
        }
    })
    .then(user=> Utilities.authenticateUser(loginFormData,user))// authenticate the user
    .then(user=>{
        //set the local storage
        localStorage.setItem('userName',user.id);
        //navigate the user to the home page
        window.location='../html/home.html';
    })
    .catch(err=>{
        alert(err.message);
    });
}


//called after the login.html completes the load event
window.onload=()=>{
    //get the login form
    const loginForm = document.getElementById('loginform');
    // bind the onSubmit event to login function
    loginForm.onsubmit=(e)=>{
        e.preventDefault();
        login(e);
    };
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

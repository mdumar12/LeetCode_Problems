/*

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />
    <meta http-equiv="Content-Security-Policy" content="style-src 'self' https://fonts.googleapis.com/css" />
    <link rel="stylesheet" href="../css/main.css" />
    <link rel="stylesheet" href="../css/responsive.css" />
    <link href="https://fonts.googleapis.com/css?family=Abel&display=swap" rel="stylesheet" />
    <link href="https://fonts.googleapis.com/css?family=Montserrat&display=swap" rel="stylesheet" />
    
    <title>WayFar - Login</title>
    <script type="module" src="../js/login.js"></script>
    
</head>

<body>
    <header class="nav-header">
        <div class="nav-title">
            <a href="./home.html">WayFar</a>
        </div>
        <input type="checkbox" id="nav-check" />
        <div class="nav-btn">
            <label for="nav-check">
                <span></span>
                <span></span>
                <span></span>
            </label>
        </div>

    </header>

    <main>
        <section class="login-main">
            <header>
                <h3 class="login-head">Login</h3>
            </header>
            <br />
            <form class="login-content" id="loginform" class="login">
                <label for="name">Username</label> &nbsp;&nbsp;&nbsp;
                <input type="text" placeholder="Enter Username" name="username" id="user" required  /><br />
                <label for="name">Password</label> &nbsp;&nbsp;&nbsp;&nbsp;
                <input input type="password" placeholder="Enter Password" name="password" id="pass" required /><br />
                <button type="submit">Submit</button>
            </form><br /><br /><br />
            <div class="container extralogin">
                <span class="Fpassword">Forgot <a href="#">password?</a></span>
                <span class="newUser"><a href="register.html" target="_blank"
                        rel="noopener noreferrer">Register</a></span>
            </div>
        </section>

    </main>
    <footer>
        <span> Copyright @ WayFar, 2021 </span>
        <div class="footer-links">
            <a href="./contact-us.html">Contact Us</a>
            &nbsp;&nbsp;|&nbsp;&nbsp;
            <a href="./terms-condition.html">Terms &amp; Conditions</a>
            &nbsp;&nbsp;|&nbsp;&nbsp;
            <a href="./about-us.html">About Us</a>
        </div>
    </footer>
</body>

</html>

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

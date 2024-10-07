class Solution {
    public int[] twoSum(int[] nums, int target) {
        int diff=0,ind1=0,ind2=0;
        int res[]={1,2};
        for(int i=0;i<nums.length;i++){
            if(i+1<nums.length){
                diff=nums[i]-target;
                if(Math.abs(diff)==nums[i+1]){
                    res[0]=i;
                    res[1]=i+1;
                    break;
                }
            }
        }
        return res;     
    }
}
// RefactorChamp(RC) 
// •	Leetcode, Codechef, HackerRank, Geeks of Geeks and Coding Ninjas are an sample applications to build an application with add on new features. 
// •	Application where can refactor the problem compete with users to horn logical skills. 
// •	For a beginner guide to learn refactor the problem by pushing user to follow mindset while solving a problem.
// •	Set the daily reminder goal while preparing for DSA to solve the problem, if unable to solve then Can watch lectures which is provided by community.
// •	For now, we can have three language support that is C++, Java and Python.
// •	User can start his own contest by adding his friends, adding a problem randomly or particular topic or set the problems by his own and also duration of the exam but in some cases, duration is limited even if user wants to increase the timer.
// •	A platform which offers learning, competing, setting daily challenges to horn Logical skills which can stand-out from others.
// Functional requirements:
// •	User registration or login (JWT and access control).
// •	Profile Management 
// o	Profile photo or Text.
// o	Name
// o	Phone number with region
// o	Mail id
// o	Reset new password via sending mail with an otp.
// o	Track Daily Activity.
// 	Daily Activity board -> as like leetcode 
// 	Friendly Contest Board
// 	Daily Contest Board 
// •	Setting -> Color, fonts and templates.
// •	Contest: 
// o	Friendly Contest as per the user requirements.
// o	Daily Contest
// o	Random Contest
// o	Contest Ranking as per the Daily Contest.
// •	Refactor Journey:
// o	Topic – wise (Bitwise, Stack, Sorting, Hashing, Two Pointer, Matrix, Trees, Graphs and many more…)
// Note: Preparation module there will be daily 3 problems set after starting preparation journey, if user missed any day then user has to start from beginning until or unless completes all topics.
// •	Refactor Challenge:
// o	User can select problem by filtering as per requirement.
// o	Right after the user get starts, user will be allocated to a time frame where problem can be solved.
// o	User must and should has to try to code on his own within allocated time frame, when 75% of time frame is completed then hints will be unlocked then at from problem will explain in clear way. Even after he fails to code then he can find codes.
// o	If user has passed all Test cases, then user can see competency level with time and space complexity.
// Non Functional Requirements :
// As per the CAP Theorem, we can have any one of the properties but for this application, it is better to go with Availability and Partition Tolerance (The system continuously operates despite network participation).
// If we assume user per second on Leetcode platform is 1million then we have to think about performance, security, Usability and Scalability which plays vital role to support a minimal viable application.
// Note: AWS EC2 instance require significant  management while configuring, maintaining servers and for large scaling require manual intervention or complex auto scaling configuration to handle massive user load efficiently.
// 	Performance: 
// o	Latency (responded quickly within milliseconds).
// o	Throughput (Handle the high number of transactions without any performance degradation.
// o	Global Load Balancing:
// 	Tools: AWS Global Accelerator, Google Cloud Load Balancing.
// 	Benefits: Distributes user requests to the nearest data center, reducing latency and improving user experience.

// o	Edge Computing:
// 	Tools: AWS Lambda@Edge, Cloudflare Workers.
// 	Benefits: Processes data closer to the user, reducing latency and offloading traffic from central servers.
// o	Microservices Architecture:
// 	Tools: Kubernetes, Docker.
// 	Benefits: Breaks down the application into smaller, independent services that can be scaled independently, improving both latency and throughput.
// o	Distributed Databases:
// 	Tools: Apache Cassandra, CockroachDB, MongoDB.
// 	Benefits: Ensures high availability and scalability by distributing data across multiple nodes.
// o	Content Delivery Network (CDN):
// 	Tools: Cloudflare, Akamai.
// 	Benefits: Caches static content closer to users, reducing latency and offloading traffic from origin servers.
// o	Asynchronous Processing:
// 	Tools: RabbitMQ, Apache Kafka.
// 	Benefits: Handles background tasks without blocking the main application flow, improving responsiveness.
// o	Advanced Caching:
// 	Tools: Redis, Memcached.
// 	Benefits: Reduces load on databases and application servers by storing frequently accessed data in memory.
// 	Security
// o	Authentication: JWT (JSON Web Tokens) for secure user authentication.
// o	Data Encryption: SSL/TLS for data in transit, AES for data at rest.
// o	Access Control: Role-based access control (RBAC) for different user roles.
// o	Denial of service: single server is utilized a lot or number of users attempts has to be controlled.
// o	Prevent from web scrapping - limit set for particular IP address.
// o	Tools like API gateways to enforce rate limit.
// o	Implementing Captcha on form and login pages, if we want, we can add reCAPTCHA.
// o	Bot detection and blocking by using Date dome or Cloudflare bot management.
// o	Honeypots, Legal Measures.
 
// 	Risks and Mitigation
// •	Risk: High traffic during peak times.
// o	Mitigation: Implement auto-scaling and load balancing.
// •	Risk: Data breaches.
// o	Mitigation: Regular security audits and encryption.

	 
// 1. Frontend: React.js
// Components: Modular and reusable UI components.
// State Management: Use Context API or Redux for state management.
// Routing: React Router for client-side routing.
// WebSockets: For real-time updates, integrate WebSocket connections to collect and update tokens.
// 2. Backend: Node.js with Express
// API Endpoints: RESTful APIs to handle CRUD operations.
// WebSocket Server: Implement WebSocket server for real-time communication.
// Authentication: JWT-based authentication for secure API access.
// 3. Database: MongoDB
// Collections: Design collections for Users, Problems, Submissions, Contests, Achievements, and Leaderboard.
// Indexes: Create indexes on frequently queried fields to optimize performance.
// 4. Caching: Redis
// Session Management: Store session data.
// Caching: Cache frequently accessed data to reduce database load.
// 5. Message Queue: RabbitMQ
// Task Queues: Handle background tasks and asynchronous processing.
// Event-Driven Architecture: Use RabbitMQ for decoupling services and handling events.
// 6. Containerization: Docker
// Docker Images: Create Docker images for frontend, backend, and database services.
// Docker Compose: Use Docker Compose for local development and testing.
// 7. Orchestration: Kubernetes
// Deployment: Deploy Docker containers using Kubernetes.
// Scaling: Auto-scale services based on load.
// Service Discovery: Use Kubernetes services for discovering and connecting microservices.
// 8. CI/CD: GitHub Actions
// Build and Test: Automate build and test processes.
// Deployment: Automate deployment to Kubernetes clusters.
// 9. Load Balancing: CloudFlare
// DNS Management: Use CloudFlare for DNS management.
// Load Balancing: Distribute traffic across multiple instances to ensure high availability.
// Detailed Component Interaction
// User Interaction:
// Users interact with the React.js frontend.
// Frontend communicates with the backend via RESTful APIs and WebSockets.
// Backend Processing:
// Node.js with Express handles API requests.
// WebSocket server manages real-time communication.
// RabbitMQ handles background tasks and event processing.
// Data Management:
// MongoDB stores application data.
// Redis caches frequently accessed data and manages sessions.

// Deployment and Scaling:
// Docker containers encapsulate application components.
// Kubernetes manages container orchestration, scaling, and service discovery.
// GitHub Actions automate CI/CD pipelines.
// Traffic Management:
// CloudFlare manages DNS and load balancing to ensure high availability and performance.
// Example Deployment Workflow
// Code Commit:
// Developers push code to GitHub repository.
// GitHub Copilot assists with code suggestions and improvements.
// CI/CD Pipeline:
// GitHub Actions trigger build and test processes.
// Docker images are built and pushed to a container registry.
// Kubernetes deployment is updated with the new images.
// Monitoring and Scaling:
// Kubernetes monitors application performance and scales services as needed.
// CloudFlare distributes traffic and ensures high availability.


// Database Design
// User :
// UserId
// Role(admin or user)
// Profile(photo or text).
// UserName
// UserPhoneNumber
// UserMailID
// Created on
// Achievements:
// 	achvId(achivedId)
//  	userId(indexing)
// titile(Contest Winner or Participent)
// achieved_at ISODate("2024-10-07T15:20:47Z")

// Contest :
// 	Contest_Id
// 	Contest_type
// 	Description
// Start_date
// End_date
// Problems[{objId1, objId2,…objIdn}]
// Participants[{objId1, objId2,…objIdn}]
// Problems :
// 	PID
// 	title
// 	pName
// 	pID_UserID
// 	level(Medium or Hard or Easy)
// 	created_at
// created_by(It should not show in an UI)
// allocated_time(to complete a problem as per level) or default
// Leadearship Board :
// o	Friendly Contest as per the user requirements.
// o	Daily Contest
// o	Random Contest
// o	Contest Ranking as per the Daily Contest.
// Refer the same :
// 		Const_Id
// 		User_Id
// 		username
// 		totalPoints
// 		rank
// 		last_Updated
// 		time_range
// Submission :
// 	subId
// 	userId
// 	problem_Id
// 	sub_code
// 	status
// 	submitted : ISODate("2024-10-07T15:20:47Z")

	
// Refactor Journey : 
// 	Courses
// 		Course_Id
// 		Title
// 		Description
// 		Created_Id
// Modules[(mod_Id,title,description),…. (mod_Id,title,description)]
// User Courses :
// 	Course_Id
// 	userId
// 	progress[(mod_Id,completed,completed_perc,completed_at,Estimate_time),….]
	


	



// Flow Diagram :
// Peniding………..












 

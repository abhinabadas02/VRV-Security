# VRV-Security
Developed an Backend Using Springboot for Authentication,Authorization and Role Based Access Control
Java version=21
Step 1= Open any Compiler(e.g= Visual Studio Code(version:1.95.3) or InteliJ Idea(version:17.0.10+8-b1207.12 amd64))
Step 2= For the first time Debug the Main file after that the Tomcat Server will start in 8065. Make sure that the 8065 server is free none other application is running.
Step 3= Open MySQL Workbench 8.0(Version: 8.0.36) and just import the whole Schema that is attched with the file. File name is SQL Table.
Step 4= Open the Postman and call the API's of Registration,login,getall,getbyid etc and make sure after login to an profile copy the Token and after that go to Headers in the PostMan and select Authorization and paste the token on the next row followed by the Authorization and add (Bearer) on the beginning and after that call API for checking the role based access.

The Changes i made is that i just use ID to search the profiles when login because i saw more that 5 or 6 source code where they use email or username to find an profile but i uses the most perfect way to find the profiles because in 100 it is possible that two persons have same email or username but the ID is not same.
Also the security is too strong to break and also the role based access which is mentioned in the assignment i clearly give the access to the admin,moderator and user differently so that user can't access the admin or moderator type access.


<----------------------------------------------------------+++++++++++++++++++++++------------------------------------------------------------------------------->

REGISTRATION API CALL.
![Screenshot (21)](https://github.com/user-attachments/assets/594c96df-b23e-4e34-9c59-0eddce544c2e)




LOGIN API CALL.
![Screenshot (22)](https://github.com/user-attachments/assets/7917e13e-af66-4a78-9a06-a08f9d869cbd)




ACCESS CHECK OF GETALL API CALL USING THE TOKEN(Remember to use the Bearer and Authorization type in Header).
![Screenshot (23)](https://github.com/user-attachments/assets/2578b5d6-e67e-4501-9db1-87b264f4e17a)




ACCESS CHECK OF GETBYID API CALL USING THE TOKEN.
![Screenshot (24)](https://github.com/user-attachments/assets/c137b3dd-7100-47d6-934d-64c554c2c192)




LOGIN TO AN USER TYPE ROLE.
![Screenshot (25)](https://github.com/user-attachments/assets/349dbdb6-4f3d-485f-8285-9e6903806dd1)





CHECKING ACCESS IF THE USER CAN FETCH GETALL API BUT FAILED BECAUSE THE ROLE ACCESS IS ONLY GIVEN TO ADMIN AND MODERATOR.
![Screenshot (26)](https://github.com/user-attachments/assets/582836b6-5100-470e-a9ee-4c3743e8520b)





LOGING IN MODERATOR TYPE ROLE.
![Screenshot (27)](https://github.com/user-attachments/assets/ff34d803-f43b-45f3-9f9e-55e6d8cd05f0)





CALLING GETALL API TO CHECK IF THE ACCESS IS WORKING OR NOT.
![Screenshot (28)](https://github.com/user-attachments/assets/f12c09d7-357b-4ab6-82e5-b51142c2f351)




CALLING UPDATE USING ID API FOR THE MODERATOR ROLE BUT THE ACCESS IS ONLY GIVEN TO ADMIN TYPE ROLE.
![Screenshot (29)](https://github.com/user-attachments/assets/750fc334-9e5c-4f87-949e-4798edf01493)




<----------------------------------------------------------+++++++++++++++++++++++------------------------------------------------------------------------------->

THANK YOU IF YOU HAVE ANY DOUBT CONTACT ME ON 8910285278 or abhinabadas02@gmail.com.

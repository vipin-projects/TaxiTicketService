# TaxiTicketService
#Import
1. Import the project as existing maven application in your IDE.
2. Once import is successfull follow the below steps to build the application.

#Build
1. Right Click on Project Folder and go to run as->Maven clean
2. Follow the same and do run as -> Maven install to download all the required jars
3. Once the above steps completed, follow below steps to run the application.

#Run the application from IDE or independent
1. Right click on the project, Run As -> Spring Boot
2. Above command will start the application, you can see the application started on the console at port 8080.
3. From any REST client invoke POST call to book the ticket.

#JUnit
1. Go to src/test/java folder
2. Run this class com.serrala.taxiticketservice.controller.TicketBookingControllerTests as Junit 
3. 1 test will fail and that is intentional.
4. bookTicketForSingleTraveller_printTicket() method will print the ticket on the console.

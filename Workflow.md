## Project Setup

1. &nbsp;Created an IntelliJ Maven Spring Boot Project with the name RecepBorekciQaracter-assignment-4
2. Chose the Spring Boot Dependencies: Spring Web, Spring Boot DevTools, Spring Data JPA.
3. And created the template project with the name RecepBorekciQaracter-assignment-4.
4. Created an empty repository on GitHub with the name RecepBorekciQaracter-assignment-4. No .gitignore, no Readme.md, and no license is selected.
5. In git bash, I went into the project location initialized a git project using git init
6. And renamed the name of the main branch to main from master using this command: `git branch -M main`
7. Added the below lines into the project's .gitignore file:

```
\### Maven ###

pom.xml.tag

pom.xml.releaseBackup

pom.xml.versionsBackup

pom.xml.next

release.properties
```

## Initial Commit

1. Executed `git add .` to stage all of the project files.
2. Executed `git commit -m "Initial commit - Springboot Project Initialization"` to commit my changes to my local main branch
3. Added the remote repo by using the following command `git remote add origin https://github.com/RecepBorekciQaracter/RecepBorekciQaracter-assignment-4.git`
4. Executed `git push -u origin main` to synchronize my main branch to the local branch.

## Customer Management Handling

1. Created a new branch with the name "feature/customer-management" using ` git branch -c feature/customer-management`
2. Switch to this branch using `git switch feature/customer-management`
3. Created a new package called "entities" in the com.example.RecepBorekciQaracter_assignment_4 package. This package will store all of the entities in the project.
4. Created a new Customer Entity as a class in this entities package.
5. Created the id, fullName, email, phoneNumber fields for this Customer entity with respective Customer Constructor and getters and setters.
6. Executed `git add .` to stage my changes.
7. Committed my changes using `git commit -m "Created the Customer Entity"`
8. Created a new package called "services" in the com.example.RecepBorekciQaracter_assignment_4 package. This package will store all of the services in the project.
9. Created a new CustomerService Service as a class in this services package.
10. Implewmented the requested methods for CustomerService class.
11. Executed `git add .` to stage my changes.
12. Commit my changes using `git commit -m "Implement CustomerService"`
13. Created a new package called "controllers" in the com.example.RecepBorekciQaracter_assignment_4 package. This package will store all of the controllers in the project.
14. Created a new CustomerController Controller as a class in this controllers package.
15. Implewmented the requested RESTful methods for CustomerController class using the CustomerService.
16. Executed `git add .` to stage my changes.
17. Commit my changes using `git commit -m "Implement CustomerController Endpoints"`
18. Executed `git push -u origin feature/customer-management` to push my changes to remote
19. Switched to main branch
20. And did a no fast forward merge using `git merge --no-ff feature/customer-management`
21. And I did git push main to complete the changes

## Appointment Scheduling

1. Created a new branch with the name "feature/appointment-scheduling" using `git branch -c feature/appointment-scheduling`
2. Switched to this branch using `git switch feature/appointment-scheduling`
3. Created the Appointment Entity with id, customerId, dateTime, type, status.
4. Created AppointmentService with the required methods.
5. Created the AppointmentController to use the methods in the AppointmentService.
6. Executed `git add .` to stage my changes.
7. Committed my changes using `git commit -m "Created Appointment Entity, AppointmentService and AppointmentController"`
8. Executed `git push -u origin feature/appointment-scheduling` to push my changes to remote
9. Switched to main branch
10. And did a no fast forward merge using `git merge --no-ff feature/appointment-scheduling`
11. And I did git push main to complete the changes

## Support Ticket System

1. Created a new branch with the name "feature/support-ticket-system" using `git branch -c feature/support-ticket-system`
2. Switched to this branch using `git switch feature/support-ticket-system`
3. Created the SupportTicket Entity with id, title, description, priority, assignedTo, status.
4. Created SupportTicketService with the required methods.
5. Created the SupportTicketController to use the methods in the SupportTicketService.
6. Executed `git add .` to stage my changes.
7. Committed my changes using `git commit -m "Created SupportTicket Entity, SupportTicketService and SupportTicketController"`
8. Executed `git push -u origin feature/support-ticket-system` to push my changes to remote
9. Switched to main branch
10. And did a no fast forward merge using `git merge --no-ff feature/support-ticket-system`
11. And I did git push main to complete the changes

## Exceptions

1. Created a new branch with the name "feature/exceptions" using `git branch -c feature/exceptions`
2. Switched to this branch using `git switch feature/exceptions`
3. Created a new package called "exceptions" in the com.example.RecepBorekciQaracter_assignment_4 package. This package will store all of the exceptions in the project.
4. Created the required CustomerNotFoundException, InvalidAppointmentException, and EmployeeNotFoundException in the exceptions package.
5. Threw these errors in the corresponding methods of CustomerService, AppointmentService and SupportTicketService.
6. Add the changes `git add .`
7. Committed my changes `git commit -m "Created the required exceptions and throw them in the services."`
8. Executed `git push -u origin feature/exceptions` to push my changes to remote
9. Switched to main branch
10. And did a no fast forward merge using `git merge --no-ff feature/exceptions`
11. And I did git push main to complete the changes

## Uploading the Workflow.md

1. Created a new branch with the name "docs/add_workflow_markdown" using `git branch -c docs/add-workflow-markdown`
2. Switched to this branch using `git switch docs/add-workflow-markdown`
3. Add this file into the root directory.
4. Add this file to git with `git add .`
5. Commit this file using `git commit -m "Added the workflow file"`
6. Executed `git push -u origin docs/add-workflow-markdown` to push this file to the remote repository.
7. Switched to main branch
8. And did a no fast forward merge using `git merge --no-ff docs/add-workflow-markdown`
9. And I did git push main to complete the changes

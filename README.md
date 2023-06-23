## Maintenance Monitor
We are a small hydro-power electricity supplier near Vienna. Our customers expect electricity around the clock with a very high service level agreement. It is easy to derive that service times are very important to us. Huge monitors were installed that should show the current service message.

"Everything operates as expected" is the default message. But a service operator can set the message manually to something else (e.g., "Service checks: No power until 5:00 pm"). A service operator can also reset the message to its default message.

# Project
A team of max 3 members should implement a REST-based application in Java (using Spring Boot). The service should be able to manage a centrally stored message. It should be able to

- deliver the message to a client <br />
- set it to a specific message <br />
- reset the message <br />

using its API. <br />

# Requirements
Use GitHub for the project and follow the correct DevOps procedure. Use a Kanban board to manage your User Stories and use a git branching model (preferable gitflow) to manage your code. Track your development process by updating your Kanban board and write at least one unit tests for every requirement. A Continuous Integration pipeline that produces the finished software artifact should be implemented as well.

Document<br />

- the whole process<br />
- the user stories<br />
- the repository URL (it has to be public)<br />
- the usage of the software<br /> 
in a PDF file with screenshots and explanatory text. Submit the code (including the .git folder) as a .zip file.<br />

You can use external resources as long as you mark them: “ // taken from: <URL> ”<br />

# Points
20% Documentations of the process<br />
15% Requirement Definition (User Stories)<br />
15% Correct Status / Linking / Branching (Kanban, git)<br />
15% Implementation<br />
15% Testing<br />
10% Continuous Integration (Pipeline Testing)<br />
10% Continuous Delivery (Pipeline Artifact)<br />
All elements must be present in the documentation.<br />

# References
/api/message -> "Everything works as expected" <br />
/api/message/set?m=Service+checks:+No+power+until+5:00+pm -> "ok" <br />
/api/message -> "Service checks: No power until 5:00 pm" <br /> 
/api/message/reset -> "ok" <br />

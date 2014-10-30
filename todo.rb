1. Project stored at Github, teacher can track commit history
	100% Ready, the project is stored on Github

2. The system is setup with automatic build that must run all unit tests.
	100% Ready, the build_and_test script in the bin folder takes care of this.

3. The output is deployable or executable artifact such as jar/war or equivalent.
	100% Ready, gradle is up and running and stores the jar in the build folder.

4. The build script has deploy/install target that deploys the executable outside of the working directory or on external server.
	#75% Ready, have to configure Gradle to finish this part.
	100% Ready, added a megma_build script which deploys the excecutable jar file to my server hordur.me

5. The business logic should be coded using TDD.
	100% Ready, the code has been writting using TDD.

6. The code should be loosely coupled and follow good object oriented design practices.
	50% Ready, please confirm that everything is in order.

EXTRAS

7.1 More build targets
	* Code coverages
	* Code inspection
	* Integrate database

7.2 Run focused integration or End-to-end tests (e.g. Selenium). It is necessary to run this on external staging server (e.g. Heroku). To run integration test the application needs to connect to external system e.g. database. To run end-to-end test the system needs to have GUI (e.g. webUI).

7.3 Use Automated Continuous Integrations Server (Travis)
	#25% Ready, have to implement the function into the project
	100% Ready, Travis is now integrated in our project.

7.4 Continuous Delivery. For each code change the CI server runs these steps:
	* Run build script (all targets)
		Travis..
	* Run unit and integration tests
		Travis..
	* Deploy on staging and run End-to-end tests.
		Have to explore better..
	* Deploy to production server.
		Have to explore better..
	* Only continue next step if previous step is success
		Have to explore better..
	* Generate feedback to developer
		Travis, email notifycation?

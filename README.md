# R-Programming

How to Call R from Java using Rserve

- Simple program to call R from Java using Eclipse and Rserve
- How to Integrate R With Java Using Rserve
- Execute R from Java
- R PROGRAMMING THROUGH JAVA


We will use Rserve software to connect our Java code to R environment. Rserve is a TCP/IP server which allows other programs to use facilities of R  from various languages without the need to initialize R or link against R library. Every connection has a separate workspace and working directory. For more details please refer this page https://www.rforge.net/Rserve/
	
	1. Install R software in your computer somewhere. (My case it is D:\InstalledSoftware\R-3.4.3)
	2. Start your R environment
	3. Install Rserve package (use command install.packages("Rserve"))
	4. Start Rserve in your R environment (use command library(Rserve))
	5. That’s it from R side.
	6. Now setup your Java project.
	7. Open any Eclipse, create java project say "RJavaConnect"
	8. Add two Rserve related jar file in your RJavaConnect project (REngine.jar and Rserve.jar)
	9. You can get both jar from D:\InstalledSoftware\R-3.4.3\library\Rserve\java (In your case check your R installation path)
	10. Create one Java Class say Demo.java and execute below code. That’s it :)

You can also add these dependency in pom.xml instaed adding two external jar files in your Java project.

		<dependency>
			<groupId>org.nuiton.thirdparty</groupId>
			<artifactId>REngine</artifactId>
			<version>1.8-5</version>
		</dependency>

		<dependency>
			<groupId>org.nuiton.thirdparty</groupId>
			<artifactId>Rserve</artifactId>
			<version>1.8-5</version>
		</dependency>

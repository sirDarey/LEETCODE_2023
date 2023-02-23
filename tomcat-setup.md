
# HOW TO SET UP TOMCAT 10. . SERVER IN CENTOS7
		
1. 	### PRE - INSTALLATION 

	1.1 Login to your server with its root credentials
	
	1.2 	`sudo su -`  To make sure you are at the root directory in case you're not
	
	1.3 `sudo dnf -y update` To run a system update, so you can get the latest varsion of any file to be downloaded
	
	1.4 `sudo reboot`  To reboot the server for changes to take effect
	

2. ### JAVA 17 (Oracle JDK 17) INSTALLATION
	
	2.1 `wget https://download.oracle.com/java/17/latest/jdk-17_linux-x64_bin.rpm` To download Oracle Java JDK 17
	
	2.2 `rpm -ivh jdk-17_linux-x64_bin.rpm` To install the downloaded  JDK 17
	
	2.3 `java -version` To verify installation. You should get this output or something similar: 
		
			```
			java version "17.0.1" 2021-10-19 LTS
			Java(TM) SE Runtime Environment (build 17.0.1+12-LTS-39)
			Java HotSpot(TM) 64-Bit Server VM (build 17.0.1+12-LTS-39, mixed mode, sharing)
			```


3.  ### TOMCAT INSTALLATION

	3.1 `sudo groupadd tomcat` To add Tomcat group
	
	3.2 `sudo mkdir /opt/tomcat`  To create Installation Folder for TOMCAT
	
	3.3 `sudo useradd -s /bin/nologin -g tomcat -d /opt/tomcat tomcat`  To Create tomcat user, disable login and give rights
	
	3.4		```
			sudo dnf install wget
			VER="10.0.22"
			wget https://archive.apache.org/dist/tomcat/tomcat-10/v${VER}/bin/apache-tomcat-${VER}.tar.gz
			``` To download Tomcat via wget. Just copy and paste the 3 Lines of command as displayed.
		
	3.5 ```
			sudo mkdir -p /opt/tomcat
			sudo tar -xvf apache-tomcat-${VER}.tar.gz -C /opt/tomcat --strip-components=1
		``` To Extract the archived file and copy the extracted files to the Tomcat directory previously created
		
	3.6 ```
			sudo chown -R tomcat: /opt/tomcat
			sudo sh -c 'chmod +x /opt/tomcat/bin/*.sh'
		``` To Set Permissions on Tomcat directories by allowing the tomcat user to read files in the tomcat directory. Also to enable the scripts in the directory to be executable
		  
	3.7 `sudo alternatives --list | grep ^java` To get a list of all Java Installation Directories.
		 Copy the directory for *Java*; It looks like or similar to this: */usr/lib/jvm/jdk-17-oracle-x64/bin/java* 

		 ***Don't copy the one for JAVAC***
		 
	3.8 Paste the copied diretory somewhere, you'll need it in a minute
	
	3.9 `sudo vim /etc/systemd/system/tomcat.service` To create a ***tomcat.service*** file
	
	3.10 Enter the INSERT mode by pressing `i`.
	
	3.11 Paste the following content
	
		```
		[Unit]
		Description=Apache Tomcat Web Application Container
		Wants=network.target
		After=network.target

		[Service]
		Type=forking

		Environment=JAVA_HOME=/usr/lib/jvm/jre <!--You will change the directory '/usr/lib/jvm/jre' to the one you copied out earlier-->

		Environment=CATALINA_PID=/opt/tomcat/temp/tomcat.pid
		Environment=CATALINA_HOME=/opt/tomcat
		Environment='CATALINA_OPTS=-Xms512M -Xmx1G -Djava.net.preferIPv4Stack=true'
		Environment='JAVA_OPTS=-Djava.awt.headless=true'

		ExecStart=/opt/tomcat/bin/startup.sh
		ExecStop=/opt/tomcat/bin/shutdown.sh
		SuccessExitStatus=143

		User=tomcat
		Group=tomcat
		UMask=0007
		RestartSec=10
		Restart=always

		[Install]
		WantedBy=multi-user.target
		``` Exit the INSERT mode by pressing the escape key ("esc") and then type ":wq"
	
	3.12 Change the value of the directory in this line ***Environment=JAVA_HOME*** to the one you copied out earlier
	
	3.13 Now that we have a service file, we can easily start and enable Apache Tomcat to automatically start at system reboot
		```
		sudo systemctl daemon-reload
		sudo systemctl start tomcat
		sudo systemctl enable tomcat
		
		``` To Start and Enable Tomcat Service
		
	3.14 `systemctl status status tomcat` To confirm Tomcat Status that it is running.
		 
		 The response should contains a line that reads: "Active: active(running)" in a green colour. 
			
	
	3.15 Be happy for the seeing the green light Showing that Tomcat is ACTIVE. You're almost done
	


4.  ### CONFIGURE TOMCAT WEB MANAGEMENT

	4.1 `sudo vim /opt/tomcat/conf/tomcat-users.xml` To create a user and password so that Apache Tomcat can be fully managed from the web interface
	
	4.2 Enter the INSERT mode (Press i) and Add the lines within the <tomcat-users> tag to look as shown
	
		```
		<tomcat-users>
			<!--*....Some bunch of codes and 
				.....Commented Codes
			.......* -->

			<role rolename="manager-gui" />
			<user username="username-X" password="createapassword" roles="manager-gui" />

			<role rolename="admin-gui" />
			<user username="username-X" password="createapassword" roles="manager-gui,admin-gui" />
		
		</tomcat-users>
		``` 	Exit the INSERT mode by pressing the escape key ("esc") and then type ":wq"

	4.3 We also need to allow Tomcat to be accessible remotely both for manager and host manager apps. By default, tomcat is only accessible locally.

		For connection to manager: `sudo vim  /opt/tomcat/webapps/manager/META-INF/context.xml`. Enter the INSERT mode

	4.4 Comment out the *Valve* definition, as shown: 
		```
		<Context antiResourceLocking="false" privileged="true" >
		  <CookieProcessor className="org.apache.tomcat.util.http.Rfc6265CookieProcessor"
						   sameSiteCookies="strict" />
		<!--  <Valve className="org.apache.catalina.valves.RemoteAddrValve"
					   allow="127\.\d+\.\d+\.\d+|::1|0:0:0:0:0:0:0:1" /> -->
		  <Manager sessionAttributeValueClassNameFilter="java\.lang\.(?:Boolean|Integer|Long|Number|String)|org\.apache\.catalina\.filters\.CsrfPreventionFilter\$LruCache(?:\$1)?|java\.util\.(?:Linked)?HashMap"/>
		</Context>
		```. Exit the INSERT mode 

	4.5 Then repeat the last step for Host Manager: `sudo vim /opt/tomcat/webapps/host-manager/META-INF/context.xml`

	4.6 If you are running an active firewall, you need to open Tomcat port on the firewall
		
		```
		sudo firewall-cmd --add-port=8080/tcp --permanent
		sudo firewall-cmd --reload
		```

	4.7 Stop Tomcat Service: `sudo service tomcat stop`

	4.7 Start and Tomcat Service: 
		```
		sudo service tomcat start
		sudo systemctl enable tomcat
		```

	4.8 `systemctl status status tomcat` To confirm Tomcat Status that it is running.
		 
		 The response should contains a line that reads: "Active: active(running)" in a green colour. 
			
	
	4.9 **CONGRATULATIONS** if you see the GREEN Light (You can run localhost:8080 on your browser joyfully),  otherwise, sigh!!!!



5. ### CHANGE/SET DEFAULT JAVA_HOME ENVIRONMENT VARIABLE FOR TOMCAT
	
	5.1 Go to the `bin` directory of your Tomcat installation. In this case, it should be in: */opt/tomcat/bin*

	5.2 Create this file *setenv.sh* in the directory using this command: `sudo vim setenv.sh`

	5.3 Enter INSERT mode and add this line: 
		`export JAVA_HOME=<Path to your jdk installation folder>`
		This is the only line that you need in order to make Tomcat change its JDK.

		In the installation earlier, this command would be like or be similar to: *export JAVA_HOME=/usr/lib/jvm/jdk-17-oracle-x64*
		
		Exit the INSERT mode

	5.4  Stop and Restart Tomcat
	
		

	



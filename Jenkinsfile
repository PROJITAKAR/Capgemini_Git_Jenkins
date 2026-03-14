pipeline{
	
	 agent any
	 
	  tools {
        maven 'MyMaven'
        jdk 'MyJava'
    }
    
    stages{
		
		stage('Build')
		{
			steps{
				bat 'mvn clean compile'
			}
		}
		
		stage('Run TestNg Tests')
		{
			steps{
				bat 'mvn test'
			}
		}
		stage('Publish HTML Report') {
            steps {
                publishHTML([
                    reportDir: 'C:\\Users\\proji\\eclipse-workspace\\Capgemini_Jenkins\\test-output',
                    reportFiles: 'index.html',
                    reportName: 'TestNG HTML Report'
                ])
            }
        }
	}
}
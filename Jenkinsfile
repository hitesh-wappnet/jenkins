pipeline {
    agent any

    stages {
        stage('Stage 1 - Development') {
            when {
		branch "development"
              }
            }
            steps {
                echo 'I am from development'  
            }
        }
        stage('Stage 1 - Master') {
            when {
          	branch "master"
            }
            steps {
                echo 'I am from master'  
            }
        }
    
    }
}

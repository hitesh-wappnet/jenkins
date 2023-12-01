pipeline {
    agent any
    environment {
        PROJECT_PATH = env.BRANCH_NAME == 'development' ? '/home/ubuntu' : '/var/www/html'
    } 
    stages {
        stage('Stage 1') {
            steps {
                echo 'Hello world! from Github Inside Hehe ${PROJECT_PATH}'  
            }
        }
    
    }
}

pipeline {
    agent any

    stages {
        stage("branch-name"){
            echo "$env.BRANCH_NAME"
        }
        stage('Stage 1 - Development') {
            when {
              expression {
                env.BRANCH_NAME == 'development' 
              }
            }
            steps {
                echo 'I am from development'  
            }
        }
        stage('Stage 1 - Master') {
            when {
              expression {
                env.BRANCH_NAME == 'master' 
              }
            }
            steps {
                echo 'I am from master'  
            }
        }
    
    }
}

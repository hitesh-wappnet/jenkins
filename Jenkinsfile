@Library('deploymentLibrary') _
pipeline {
    agent any

    stages {
        stage("branch-name") {
            steps {
                echo "$env.BRANCH_NAME"
            }
        }
        stage('Deploy') {
            steps {
                deploy(env.BRANCH_NAME)
            }
        }
    }
}




/* 
pipeline {
    agent any

    stages {
        stage("branch-name"){
            steps{
            echo "$env.BRANCH_NAME"
            }
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
*/

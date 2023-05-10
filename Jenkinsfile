pipeline{

	agent any

	environment {
		DOCKERHUB_CREDENTIALS=credentials('hitesh25_docker_creds')
	}

	stages {

		stage('Build') {

			steps {
				sh 'docker build -t hitesh25/jenkins_argo:latest .'
			}
		}

		stage('Login') {

			steps {
				sh 'echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u $DOCKERHUB_CREDENTIALS_USR --password-stdin'
			}
		}

		stage('Push') {

			steps {
				sh 'docker push hitesh25/jenkins_argo:latest'
			}
		}
	}

	post {
		always {
			sh 'docker logout'
		}
	}

}

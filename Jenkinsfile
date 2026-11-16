
pipeline {

    agent any

    stages {

        stage('Checkout') {
            steps {
                echo 'Downloading Spring Boot source code'
                checkout scm
            }
        }

        stage('Build') {
            steps {
                echo 'Compiling Spring Boot application'

                sh 'chmod +x mvnw'
                sh './mvnw clean compile'
            }
        }

        stage('Test') {
            steps {
                echo 'Executing unit tests'

                sh './mvnw test'

                junit 'target/surefire-reports/*.xml'
            }
        }

        stage('Package') {
            steps {
                echo 'Creating executable JAR'

                sh './mvnw package -DskipTests'
                
                archiveArtifacts(
                    artifacts: 'target/*.jar',
                    fingerprint: true
                )
            }
        }

        stage('Success') {
            steps {
                echo 'Spring Boot CI pipeline completed!'
            }
        }
    }

    post {
        success {
            echo 'BUILD SUCCESSFUL'
        }

        failure {
            echo 'BUILD FAILED - Check console output'
        }

        always {
            echo 'Pipeline execution completed'
        }
    }
}

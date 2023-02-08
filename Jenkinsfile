pipeline {
    agent any

    stages {
        stage('Pull latest code'){
            agent {
                docker {
                    image 'openjdk:17'
                    args '-v "$PWD":/app'
                    reuseNode true
                }
            }
        }
        stage ('Test & Build Artifact') {
            steps {
                sh './gradlew clean build'
            }
        }
    }
}
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
             steps {
                            echo 'Pull'
                        }
        }
        stage ('Test & Build Artifact') {
            steps {
                sh './gradlew clean build'
            }
        }
    }
     post {
        success {
            githubPRStatusPublisher buildMessage: message(failureMsg: githubPRMessage('Can\'t set status; build failed.'), successMsg: githubPRMessage('Can\'t set status; build succeeded.')), errorHandler: statusOnPublisherError('UNSTABLE'), statusMsg: githubPRMessage('${GITHUB_PR_COND_REF} run ended'), unstableAs: 'SUCCESS'
        }
        failure {
            githubPRStatusPublisher buildMessage: message(failureMsg: githubPRMessage('Can\'t set status; build failed.'), successMsg: githubPRMessage('Can\'t set status; build succeeded.')), errorHandler: statusOnPublisherError('UNSTABLE'), statusMsg: githubPRMessage('${GITHUB_PR_COND_REF} run ended'), unstableAs: 'FAILURE'
        }
    }
}
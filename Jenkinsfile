pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/nandini-sannamuri06/sampleGradle.git'
                echo 'Checkout done'
            }
        }
        stage('Build'){
            steps{
               sh 'gradle clean build sonar'
               echo 'build Done'
            }
        }
        stage('Deploy'){
            steps{
                echo 'Need to write cflogin and cf push commands...Deployment Done'
            }
        }
    }
    post { 
        always { 
        echo 'SendMail'
        }
        success{
            echo 'Everything is Success'
        }
    }
}
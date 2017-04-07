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
              gradle{
                  tasks('clean','build')
              }
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
        mail to:"nsuggula@nisum.com", subject:"SUCCESS: ${currentBuild.fullDisplayName}", body: "Yay, we passed."
        echo 'SendMail'
        }
        success{
            echo 'Everything is Success'
        }
    }
}
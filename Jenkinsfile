pipeline {
    agent any
    parameters {
        string(name: 'user', defaultValue: '', description: 'User name')
    }
    stages {
        stage('Build') {
            steps {
                sh 'echo "Hello World"'
                echo 'API user: ${params.user}'
            }
        }
    }
    post {
        always {
            echo 'One way or another, I have finished'
        }
        success {
            echo 'I succeeeded!'
        }
        unstable {
            echo 'I am unstable :/'
        }
        failure {
            echo 'I failed :('
        }
    }
}

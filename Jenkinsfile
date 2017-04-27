pipeline {
    agent any
    parameters {
        string(name: 'user', defaultValue: '', description: 'User name')
        string(name: 'target_env', defaultValue: '', description: 'target_env')
        string(name: 'minified', defaultValue: true, description: 'minified')
        string(name: 'merchant_public_id', defaultValue: '', description: 'merchant_public_id')
        string(name: 'test', defaultValue: '', description: 'test')
    }
    stages {
        stage('Build') {
            steps {
                sh 'echo "Hello World"'
                echo "API user: ${params.user}"
                echo "API target_env: ${params.target_env}"
                echo "API minified: ${params.minified}"
                echo "API minified: ${params.merchant_public_id}"
                echo "API test: ${params.test}"
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


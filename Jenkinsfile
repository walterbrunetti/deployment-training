#!groovy

node {
    parameters {
        string(name: 'user', defaultValue: '', description: 'User name')
    }

    stage('Build') {
        steps {
            sh 'echo "Hello World"'
            echo "API user: ${params.user}"
        }
    }

    stage('Post Build') {
        steps {
            echo "Done with the build"
        }
    }

    

}

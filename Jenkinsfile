#!groovy

node {
    parameters {
        string(name: 'user', defaultValue: '', description: 'User name')
    }

    stage('Build') {
        sh 'echo "Hello World"'
        echo "API user: ${params.user}"
    }

    stage('Post Build') {
        echo "Done with the build"
    }

    

}

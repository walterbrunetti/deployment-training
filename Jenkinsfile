#!groovy

node {
    parameters {
        string(name: 'user', defaultValue: '', description: 'User name')
        string(name: 'target_env', defaultValue: '', description: 'target_env')
        string(name: 'minified', defaultValue: true, description: 'minified')
        string(name: 'test', defaultValue: '', description: 'test')
    }

    stage('Build') {
        sh 'echo "Hello World"'
        echo "API user: ${params.user}"
        echo "API target_env: ${params.target_env}"
        echo "API minified: ${params.minified}"
        echo "API test: ${params.test}"
    }

    stage('Post Build') {
        echo "Done with the build"
    }
}

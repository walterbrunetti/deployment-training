#!groovy

node {
    parameters {
        string(name: 'user', defaultValue: '', description: 'User name')
        string(name: 'target_env', defaultValue: '', description: 'target_env')
        string(name: 'minified', defaultValue: '', description: 'minified')
        string(name: 'merchant_public_id', defaultValue: '', description: 'merchant_public_id')
    }

    stage('Build') {
        sh 'echo "Hello World"'
        echo "API user: ${params.user}"
        echo "API user: ${params.user}"
        echo "API target_env: ${params.target_env}"
        echo "API minified: ${params.minified}"
        echo "API merchant_public_id: ${params.merchant_public_id}"
    }

    stage('Post Build') {
        echo "Done with the build"
    }
}

#!groovy

node {
    parameters {
        string(name: 'user', defaultValue: '', description: 'User name')
        string(name: 'target_env', defaultValue: '', description: 'target_env')
        string(name: 'minified', defaultValue: true, description: 'minified')
        string(name: 'merchant_public_id', defaultValue: true, description: 'merchant_public_id')
        string(name: 'test', defaultValue: '', description: 'test')
    }

    paramAValue = "paramAValue"
    paramBValue = "paramBValue"
    build job: 'downstream-freestyle', parameters: [[$class: 'StringParameterValue', name: 'ParamA', value: paramAValue], [$class: 'StringParameterValue', name: 'ParamB', value: paramBValue]]
    
    stage('Build') {
        sh 'echo "Hello World"'
        echo "API user: ${params.user}"
        echo "API target_env: ${params.target_env}"
        echo "API minified: ${params.minified}"
        echo "API minified: ${params.merchant_public_id}"
        echo "API test: ${params.test}"
    }

    stage('Post Build') {
        echo "Done with the build"
    }
}

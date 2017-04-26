#!groovy

node {

    
    properties([
     parameters([
       booleanParam(
         defaultValue: false,
         description: 'isFoo should be false',
         name: 'isFoo'
       ),
       booleanParam(
         defaultValue: true,
         description: 'isBar should be true',
         name: 'isBar'
       ),
     ])
   ])

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

pipeline {
    agent any
    properties([
      parameters([
        string(name: 'description', defaultValue: ''),
      ])
    ])


    stages {
        stage('Build') {
            steps {
                sh 'echo "Hello World"'
                sh '''
                    echo "Multiline shell steps works too"
                    ls -lah
                '''
            }
        }
    }
}

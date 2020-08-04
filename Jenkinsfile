peline {
    agent { docker { image 'python:3.5.1' } }
    stages {
        stage('build') {
            steps {
				sh 'echo "hello world from Jenkins"'
                sh 'python --version'
            }
        }
    }
} 

pipeline {
  agent {
    docker {
      image 'maven:3-alpine'
      args '-v $HOME/.m2:/root/.m2'
    }
    
  }
  stages {
    stage('Test') {
      steps {
        sh 'mvn --version'
      }
    }
  }
  environment {
    PATH = '$PATH;C:\\cygwin64\\bin'
  }
}
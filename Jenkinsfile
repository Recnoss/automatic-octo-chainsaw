pipeline {
  agent any
  stages {
    stage('Initialize') {
      steps {
        sh 'mvn --version'
      }
    }
    stage('Build') {
      steps {
        sh 'java --version'
        sleep 3
      }
    }
    stage('Store Artifacts') {
      steps {
        sh 'docker version'
      }
    }
  }
}
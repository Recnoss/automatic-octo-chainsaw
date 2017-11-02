pipeline {
  agent any
  stages {
    stage('Test') {
      steps {
        sh '''pwd
whoami
uname
date'''
      }
    }
    stage('build') {
      steps {
        sh 'mvn clean'
      }
    }
  }
}
pipeline {
  agent any
  stages {
    stage('Initialize') {
      steps {
        sh 'mvn clean'
      }
    }
    stage('Build') {
      steps {
        sh 'mvn install dockerfile:build'
      }
    }
    stage('Store Artifacts') {
      steps {
        sh 'docker version'
      }
    }
  }
}
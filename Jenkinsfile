pipeline {
  agent {
    docker {
      image 'maven:3.39-jdk-8'
      args '-v /var/jenkins_home/.m2:/root/.m2'
    }
    
  }
  stages {
    stage('Initialize') {
      steps {
        sh '''echo PATH = ${PATH}
echo M2_HOME = ${M2_HOME}
mvn clean'''
      }
    }
    stage('Build') {
      steps {
        sh 'mvn -Dmavnen.test.failure.ignore=true install'
      }
    }
  }
}
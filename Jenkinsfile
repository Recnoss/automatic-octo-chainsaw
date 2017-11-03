pipeline {
  agent any
  stages {
    stage('Initialize') {
      steps {
        sh 'echo "Compiling....."'
        sleep(unit: 'MILLISECONDS', time: 500)
      }
    }
    stage('Build') {
      steps {
        sh 'echo "Building...."'
      }
    }
    stage('Unittest') {
      steps {
        sh 'echo "Testing"'
        sleep 5
      }
    }
    stage('Store Artifacts') {
      steps {
        sh 'echo "copying files to nexus.ssb.no"'
      }
    }
    stage('Deploy to Test') {
      parallel {
        stage('Deploy to Test') {
          steps {
            sleep 5
          }
        }
        stage('Deploy to QA') {
          steps {
            sleep 15
          }
        }
      }
    }
    stage('Verify') {
      steps {
        input(message: 'Deploy to production', id: '100', ok: 'Yes')
      }
    }
    stage('Deploy to Production') {
      steps {
        sh 'echo "Deploying"'
      }
    }
  }
}
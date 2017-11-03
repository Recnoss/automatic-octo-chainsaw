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
    stage('Run Tests') {
      parallel {
        stage('Unit test') {
          steps {
            sh 'echo "Testing"'
            sleep 5
            echo 'Tests OK'
          }
        }
        stage('Integration tests') {
          steps {
            echo 'Tests passed OK'
          }
        }
        stage('Component Tests') {
          steps {
            echo 'Tested all components OK'
          }
        }
      }
    }
    stage('Store Artifacts') {
      steps {
        sh 'echo "copying files to nexus.ssb.no"'
      }
    }
    stage('Deploy to Test/QA') {
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
        stage('Acceptance tests') {
          steps {
            echo 'OK'
          }
        }
      }
    }
    stage('System Tests') {
      parallel {
        stage('Security Tests') {
          steps {
            echo 'Security OK'
            sleep 2
          }
        }
        stage('Acceptance test') {
          steps {
            echo 'OK'
          }
        }
        stage('Performance tests') {
          steps {
            sleep 10
            echo 'Ok'
          }
        }
      }
    }
    stage('Verify') {
      steps {
        sh 'echo "Deploying"'
        input(message: 'Deploy tp Production', id: '002', ok: 'Yes')
      }
    }
    stage('Deploying to Production servers') {
      parallel {
        stage('Prod Server 1') {
          steps {
            echo 'OK'
          }
        }
        stage('Prod Server 2') {
          steps {
            echo 'OK'
          }
        }
        stage('Prod Server 3') {
          steps {
            echo 'OK'
          }
        }
      }
    }
  }
}
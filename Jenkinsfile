pipeline {
  agent any
  stages {
    stage('Compile') {
      steps {
        sh '''echo "I Am compiling... bahumbug"
'''
      }
    }
    stage('Tests') {
      parallel {
        stage('Tests') {
          steps {
            echo 'Unittests are OK'
          }
        }
        stage('Integration Tests') {
          steps {
            echo 'Integreated OK'
          }
        }
        stage('lalala') {
          steps {
            mail(subject: 'test', body: 'lalalal', bcc: 'erv@ssb.no', charset: 'utf-8', from: 'erv@ssb.no', to: 'erv@ssb.no')
          }
        }
      }
    }
    stage('Deploy to Test') {
      steps {
        sh 'echo "Deploying"'
        sleep 5
      }
    }
    stage('Deploy to QA') {
      steps {
        echo 'Deploying.....'
        sleep 5
      }
    }
    stage('Release?  ') {
      steps {
        input(message: 'Do you want to go to production?', id: '|', ok: 'yes', submitter: 'Dev')
      }
    }
    stage('Deploy to Prod') {
      steps {
        echo 'Deploying'
        sleep 5
      }
    }
  }
}
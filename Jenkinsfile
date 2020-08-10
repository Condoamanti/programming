node(jenkins-slave-jnlp) {
  stage('stage_test')
    git 'https://github.com/jenkinsci/kubernetes-plugin.git'
    container('jnlp') {
        stage('Build a Maven project') {
            sh 'echo "test"'
        }
    }
}
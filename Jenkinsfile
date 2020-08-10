podTemplate {
    node("jenkins-slave-jnlp") {
      container("jnlp") {
          stage('Run shell') {
              sh "echo 'Hello, World!'"
              sh "hostname"
          }
        }
    }
}
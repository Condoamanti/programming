podTemplate {
    node("jenkins-slave-jnlp") {
      container("jnlpz") {
          stage('Run shell') {
              sh "echo 'Hello, World!'"
              sh "hostname"
          }
        }
    }
}
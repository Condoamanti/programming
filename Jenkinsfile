podTemplate(
  cloud: 'kubernetes',
  namespace: 'jenkins',
  podRetention: never(),
  activeDeadlineSeconds: '100',
  showRawYaml: 'false',
  containers: [
  containerTemplate(
    name: 'maven',
    image: 'maven:3.3.9-jdk-8-alpine',
    ttyEnabled: true,
  ),
  containerTemplate(
    name: 'golang',
    image: 'golang:1.8.0',
    ttyEnabled: true,
  )
]) {

  node(POD_LABEL) {

    stage("Get a Golang project") {
      git url: 'https://github.com/hashicorp/terraform.git'
      container('golang') {
        stage('Build a Go project') {
          sh """
          mkdir -p /go/src/github.com/hashicorp
          ln -s `pwd` /go/src/github.com/hashicorp/terraform
          cd /go/src/github.com/hashicorp/terraform && make core-dev
          """
        }
      }
    }

  }
}

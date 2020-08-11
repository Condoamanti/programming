podTemplate(
  cloud: 'kubernetes',
  namespace: 'jenkins',
  activeDeadlineSeconds: '100',
  showRawYaml: 'false',
  containers: [
  containerTemplate(
    name: 'maven',
    image: 'maven:3.3.9-jdk-8-alpine',
    ttyEnabled: true,
    command: 'cat'
  ),
  containerTemplate(
    name: 'golang',
    image: 'golang:1.8.0',
    ttyEnabled: true,
    command: 'cat'
  ),
  containerTemplate(
    name: 'alpine'
    image: 'alpine:latest'
    ttyEnabled: true,
    command: 'cat'
  )
]) {

  node(POD_LABEL) {

    stage("Get Golang Project") {
      //git url: 'https://github.com/hashicorp/terraform.git'
      println("here1")
      container('golang') {
        stage('Build DotNet Project') {
          /*
          sh """
          mkdir -p /go/src/github.com/hashicorp
          ln -s `pwd` /go/src/github.com/hashicorp/terraform
          cd /go/src/github.com/hashicorp/terraform && make core-dev
          """
          */
        }
      }
    }

  }
}

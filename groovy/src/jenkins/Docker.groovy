package src.jenkins
class Docker {
    def script
    Docker(script) {
        this.script = script
    }

    def logout(url) {
        script.sh "docker logout ${url}"
    }

    def login(username, password, url) {
        script.sh "docker login -u ${username} -p ${password} ${url}"
    }

    def build(imageName, imageVersion, imagePath = ".") {
        script.sh "docker built -t ${imageName}:${imageVersion} ${imagePath}"
    }

    def hello(message = "Hello, World!") {
        println("${message}")
    }
}
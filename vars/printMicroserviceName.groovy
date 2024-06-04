def call(String microserviceName) {
    pipeline {
        agent any

        stages {
            stage('Print Microservice Name') {
                steps {
                    echo "Triggered by microservice: ${microserviceName}"
                }
            }
        }
    }
}

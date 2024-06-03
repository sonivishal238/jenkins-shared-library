def call(String repoUrl, String branchName) {
    pipeline {
        agent any

        stages {
            stage('Checkout Code') {
                steps {
                    script {
                        echo "Cloning repository: ${repoUrl}"
                        echo "Branch: ${branchName}"

                        // Clone the repository
                        git branch: branchName, url: repoUrl
                    }
                }
            }

            stage('Build') {
                steps {
                    echo 'Building...'
                    // Add your build steps here
                }
            }

            stage('Test') {
                steps {
                    echo 'Testing...'
                    // Add your test steps here
                }
            }

            stage('Deploy') {
                steps {
                    echo 'Deploying...'
                    // Add your deploy steps here
                }
            }
        }

        post {
            always {
                echo 'Pipeline finished.'
            }
        }
    }
}

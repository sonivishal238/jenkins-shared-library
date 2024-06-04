def printRepoName(String repoName) {
  // Use Jenkins pipeline syntax to print the name within a stage
  pipeline {
    agent none // Define no agent as we're not building anything
    stages {
      stage('Print Repo Name') {
        steps {
          echo "Building microservice: ${repoName} from shared pipeline globals"
        }
      }
    }
  }
}

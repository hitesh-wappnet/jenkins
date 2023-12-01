// File: vars/deploy.groovy
def call(String branchName) {
    echo "Deploying for branch: ${branchName}"
    if (branchName == 'development') {
        // Deployment steps for development
        echo 'Deploying to development environment...'
    } else if (branchName == 'master') {
        // Deployment steps for master
        echo 'Deploying to master environment...'
    } else {
        echo "No deployment steps defined for branch: ${branchName}"
    }
}

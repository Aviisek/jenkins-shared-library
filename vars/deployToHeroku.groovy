def call(String herokuGitMaster) {
    checkout scm
    dir("${env.WORKSPACE}") {
        sh "git push https://git.heroku.com/${herokuGitMaster}.git"
    }
}
def call(String herokuGitMaster) {
    checkout scm
    sh "git push https://git.heroku.com/${herokuGitMaster}.git master"
}
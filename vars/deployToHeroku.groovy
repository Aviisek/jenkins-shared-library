def call(String herokuGitMaster) {
    checkout scm
    sh "cd ${WORKSPACE} && git push https://git.heroku.com/${herokuGitMaster}.git"
}
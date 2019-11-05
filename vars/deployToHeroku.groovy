def call(String herokuGitMaster) {
    checkout scm
    sh "cd ${env.WORKSPACE} && git push https://git.heroku.com/${herokuGitMaster}.git"
}
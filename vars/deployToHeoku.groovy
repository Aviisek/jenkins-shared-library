def call(String herokuGitMaster) {

    sh "git push https://git.heroku.com/${herokuGitMaster}.git"
}
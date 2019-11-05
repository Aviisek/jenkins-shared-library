def call(String herokuGitMaster) {

    sh "git push ${herokuGitMaster}"
}
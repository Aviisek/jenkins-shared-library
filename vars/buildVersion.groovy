import java.text.SimpleDateFormat

def call() {
    Date now = new Date()
    SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd-HHmmss");
    def timestamp = sdf.format(now)
    def sha = sh(returnStdout: true, script: 'git rev-parse --short=10 HEAD')
    return "${timestamp}-${sha.trim()}"
}
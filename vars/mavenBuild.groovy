def call(String mvnHome) {

    sh "'${mvnHome}/bin/mvn' clean package"
}
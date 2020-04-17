#!/usr/bin/env groovy

def call() {
    def header = "Build Complete <${env.BUILD_URL}|${currentBuild.currentResult}>"
    def jobInfo = "${env.JOB_NAME} (${env.BUILD_NUMBER})"
    def gitInfo = "${GIT_LOG}"

    slackSend(message: "${header}\n${jobInfo}\n${gitInfo}\nFrom shared library")
}
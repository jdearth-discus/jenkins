#!/usr/bin/env groovy

def call(String repoName) {
    def jobName = "../${repoName}/${env.BRANCH_NAME}"
    build job: jobName, propagate: false, wait: false
}
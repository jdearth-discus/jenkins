#!/usr/bin/env groovy

def call(String repoName) {
    if (env.BRANCH_NAME == "master" || env.BRANCH_NAME.endsWith("jenkinsfile")) {
        def jobName = "../${repoName}/${env.BRANCH_NAME}"
        build job: jobName, propagate: false, wait: false
    }
}
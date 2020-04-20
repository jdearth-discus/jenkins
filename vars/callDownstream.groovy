#!/usr/bin/env groovy

def call(String[] repoNames) {
    if (env.BRANCH_NAME == "master" || env.BRANCH_NAME.contains("SNAPSHOT")) {
        for (repoName in repoNames) {
            def jobName = "../${repoName}/${env.BRANCH_NAME}"
            build job: jobName, propagate: false, wait: false
        }
    }
}
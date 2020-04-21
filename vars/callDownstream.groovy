#!/usr/bin/env groovy

def call(String repoName) {
    echo repoName
    if (env.BRANCH_NAME == "master" || env.BRANCH_NAME.endsWith("SNAPSHOT")) {
        def jobName = "../${repoName}/${env.BRANCH_NAME}"
        build job: jobName, propagate: false, wait: false
    } else {
        echo "This is a feature branch and will not build downstream"
    }
}
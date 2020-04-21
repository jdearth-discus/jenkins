#!/usr/bin/env groovy

def call(String repoNames) {
    echo repoName
    if (env.BRANCH_NAME == "master" || env.BRANCH_NAME.endsWith("SNAPSHOT")) {
        String[] str = repoNames.split(',')
        for (String x : str) {
            def jobName = "../" + x + "/${env.BRANCH_NAME}"
            build job: jobName, propagate: false, wait: false
        }
    } else {
        echo "This is a feature branch and will not build downstream"
    }
}
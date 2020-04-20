#!/usr/bin/env groovy

def call() {
    env.GIT_LOG = powershell(script: 'git log --oneline -1 ${GIT_COMMIT}', returnStdout: true)
}
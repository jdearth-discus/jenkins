#!/usr/bin/env groovy

def call(boolean includeTestReports = true) {
    if (includeTestReports) {
        junit '**/target/surefire-reports/**/*.xml'
    }
    archiveArtifacts(artifacts: '**/target/*.?ar', fingerprint: true)
}
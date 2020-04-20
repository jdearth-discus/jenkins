#!/usr/bin/env groovy

def call(boolean includeTestReports) {
    if (includeTestReports) {
        junit '**/target/surefire-reports/**/*.xml'
    }
    archiveArtifacts(artifacts: '**/target/*.?ar', fingerprint: true)
}
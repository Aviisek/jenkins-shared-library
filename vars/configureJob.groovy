def call() {
    properties([
            [$class: 'BuildDiscardProperty', strategy:
                    [
                            $class               : 'LogRotator',
                            artifactDaysToKeepStr: '',
                            artifactNumToKeepStr : '',
                            daysToKeepStr        : '10',
                            numToKeepStr         : '4'
                    ]
            ],
            disableConcurrentBuilds(),
            [
                    $class: 'RebuildSetting',
                    autoRebuild: false,
                    rebuildDisabled: false
            ],
            pipelineTriggers([])
    ])
}
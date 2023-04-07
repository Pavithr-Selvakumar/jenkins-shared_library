def call (def testPathLocation)
{
  script{    
            script{
                try{
                bat env.EndTask
                bat env.TempClear
                deleteDir()
            }
            catch(err){
                echo 'There was some expected error during cleanup activity but it is handled.'
            }
            
           catchError(buildResult:'UNSTABLE',catchInterruptions: true,message:'RSO Standard Catch Error', stageResult: 'UNSTABLE'){
               
                runFromAlmBuilder almApiKey: '', almClientID: 'apikey-rpbedbkrhmrbnjsmkime', almCredentialsScope: 'SYSTEM', almDomain: 'JDE_TRAINING', almPassword: '', almProject: 'Kauri_Training', almRunHost: '', almRunMode: 'RUN_LOCAL', almServerName: 'JDEALM', 
                  almTestSets: '''{}''', almUserName: '', areParametersEnabled: false, filterTestsModel: [blockedCheckbox: false, failedCheckbox: true, noRunCheckbox: false, notCompletedCheckbox: false, passedCheckbox: false, testName: ''], isSSOEnabled: true, specifyParametersModel: [parameterJson: '']
				publishMicroFocusTestResults 'ALWAYS_ARCHIVE_TEST_REPORT'
                echo currentBuild.result
				
              
              
              
              
            }
            }
        }
}

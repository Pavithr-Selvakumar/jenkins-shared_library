def call (def testPathLocation)
{ 
            script{
                try{
                bat env.EndTask
                bat env.TempClear
                deleteDir()
            }
            catch(err){
                echo 'There was some expected error during cleanup activity but it is handled.'
            }
		    
		    echo testPathLocation
		    
		    runFromAlmBuilder almApiKey: '{AQAAABAAAAAggbQGiwiY1PPZpjHyCiPAuwEOyzLBNUB5lxBvbEqaML1FxjMlmVeuSnmBJ+zJJzCx}', almClientID: 'apikey-rpbedbkrhmrbnjsmkime', almCredentialsScope: 'JOB', almDomain: 'JDE_TRAINING', almPassword: '{AQAAABAAAAAQSr7Ql75DCLbDFcPYfYlp84TgGcrmQP/Kp9KN+ymvRrs=}', almProject: 'Kauri_Training', almRunHost: '', almRunMode: 'RUN_LOCAL', almServerName: 'JDEALM', almTestSets: '''${testPathLocation}
''', almTimeout: '', almUserName: 'apikey-rpbedbkrhmrbnjsmkime', areParametersEnabled: false, filterTestsModel: [blockedCheckbox: false, failedCheckbox: false, noRunCheckbox: false, notCompletedCheckbox: false, passedCheckbox: false, testName: ''], isSSOEnabled: true, specifyParametersModel: [parameterJson: '']
            
	 
         
               
             
              
              
              
              
            
            
        }
}

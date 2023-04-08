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
            
	 
         
               
                runFromAlmBuilder almApiKey: '{AQAAABAAAAAgSreDziZexdVa5cVsr9NKyTLTpQEEiykPx57PMpBr/wcGAylXyZgAr3rC4zndURcY}', almClientID: ' apikey-rpbedbkrhmrbnjsmkime', almCredentialsScope: 'JOB', almDomain: 'JDE_TRAINING', almPassword: '{AQAAABAAAAAgadU6bQHk0s6997/ruOx2tFxaFd87MFJoFI2ZQh/Kbtb18xkoNqNUusbrKNpG3xlS}', almProject: 'Kauri_Training', almRunHost: '', almRunMode: 'RUN_LOCAL', almServerName: 'JDEALM', almTestSets: '''Team_Alpha\\\\Digital Prospect Order\\\\A52. 1_DigitalWebShopOrder
''', almTimeout: '', almUserName: 'apikey-rpbedbkrhmrbnjsmkime', areParametersEnabled: false, filterTestsModel: [blockedCheckbox: false, failedCheckbox: false, noRunCheckbox: false, notCompletedCheckbox: false, passedCheckbox: false, testName: ''], isSSOEnabled: true, specifyParametersModel: [parameterJson: '']
              
              
              
              
            
            
        }
}

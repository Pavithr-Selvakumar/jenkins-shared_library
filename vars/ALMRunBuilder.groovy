def call (def testPathLocation)
{ 
    script{
	    
	    //cleanup activity
        try{
            bat env.EndTask
            bat env.TempClear
            deleteDir()
        }
        catch(err){
	    echo 'There was some expected error during cleanup activity but it is handled.'
        }
		    
		    
		runFromAlmBuilder almApiKey: '{AQAAABAAAAAggbQGiwiY1PPZpjHyCiPAuwEOyzLBNUB5lxBvbEqaML1FxjMlmVeuSnmBJ+zJJzCx}', almClientID: 'apikey-rpbedbkrhmrbnjsmkime', almCredentialsScope: 'JOB', almDomain: 'JDE_TRAINING', almPassword: '{AQAAABAAAAAQSr7Ql75DCLbDFcPYfYlp84TgGcrmQP/Kp9KN+ymvRrs=}', almProject: 'Kauri_Training', almRunHost: '', almRunMode: 'RUN_LOCAL', almServerName: 'JDEALM', almTestSets: testPathLocation, almTimeout: '', almUserName: 'apikey-rpbedbkrhmrbnjsmkime', areParametersEnabled: false, filterTestsModel: [blockedCheckbox: false, failedCheckbox: false, noRunCheckbox: false, notCompletedCheckbox: false, passedCheckbox: false, testName: ''], isSSOEnabled: true, specifyParametersModel: [parameterJson: '']    
	    
		   // get the status of test result from xml file 
		resultFile = findFiles excludes: '', glob: 'Results*.xml'
		def xml = readFile resultFile[0].name
		def xmlContents = new XmlParser().parseText(xml)
	    print(xmlContents)
		status =((xmlContents.children())[0].children())[0].attributes().status    
	    echo 'first run ${status}'
	    // rerun the same test if it fails 
		if (status =="fail"){
			    
	    try{
                bat env.EndTask
                bat env.TempClear
                deleteDir()
            }
            catch(err){
                echo 'There was some expected error during cleanup activity but it is handled.'
            }
		 runFromAlmBuilder almApiKey: '{AQAAABAAAAAggbQGiwiY1PPZpjHyCiPAuwEOyzLBNUB5lxBvbEqaML1FxjMlmVeuSnmBJ+zJJzCx}', almClientID: 'apikey-rpbedbkrhmrbnjsmkime', almCredentialsScope: 'JOB', almDomain: 'JDE_TRAINING', almPassword: '{AQAAABAAAAAQSr7Ql75DCLbDFcPYfYlp84TgGcrmQP/Kp9KN+ymvRrs=}', almProject: 'Kauri_Training', almRunHost: '', almRunMode: 'RUN_LOCAL', almServerName: 'JDEALM', almTestSets: testPathLocation, almTimeout: '', almUserName: 'apikey-rpbedbkrhmrbnjsmkime', areParametersEnabled: false, filterTestsModel: [blockedCheckbox: false, failedCheckbox: false, noRunCheckbox: false, notCompletedCheckbox: false, passedCheckbox: false, testName: ''], isSSOEnabled: true, specifyParametersModel: [parameterJson: '']
			  resultFile = findFiles excludes: '', glob: 'Results*.xml'
		 xml = readFile resultFile[0].name
		 xmlContents = new XmlParser().parseText(xml)
		status =((xmlContents.children())[0].children())[0].attributes().status 
	     echo 'Second run ${status}' 
			
		    }
		
	      
		    
	    return [status]
   
    }
}

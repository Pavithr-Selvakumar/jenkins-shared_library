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
            
	 
         
               
             
              
              
              
              
            
            
        }
}

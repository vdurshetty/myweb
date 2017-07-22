node {
    stage('Checkout') {
        checkout scm
    }
    
	println "Check Out Completed......."
	    
    stage ('build'){
		bat(/ gradle.bat build/)
    }
}


 
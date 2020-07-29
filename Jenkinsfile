pipeline {
    agent any
    stages {
        stage( 'SCM Checkout' ) {
	    steps {
	        sh 'echo Checking out source code from git...'
	    }
	}
        stage( 'Build and Package' ) {
	    steps {
	        sh 'echo Running gradle build...'
	        sh 'echo Running static analysis...'
	        sh 'echo Running unit tests...'
	    }
	}
        stage( 'Publish Container' ) {
	    steps {
	        sh 'echo Creating docker image...'
	    }
	}
    }
}

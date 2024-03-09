pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "Maven"
    }

    stages {
        stage('Checkout') {
            steps {
                // Get some code from a GitHub repository
                //How to run on main branch
           git branch: 'main', url: 'https://github.com/jaradamessa/CucumberJunitProject.git'
            
            }
        }
        stage ('Test'){
            steps{
             bat "mvn clean test -Dcucumber.filter.tags=@Sanity"

            }
                
        
        post{
                always {
                    cucumber '**/cucumber.json'
                }
            }
        }
           
        }
    }

     


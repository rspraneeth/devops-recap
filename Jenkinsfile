pipeline{
    agent any
    tools{
        maven 'Maven'
    }
    stages{
        stage('Build maven'){
            steps{
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/rspraneeth/devops-recap']])
                sh 'mvn clean package'
            }
        }

        stage('Build docker image'){
            steps{
                script{
                    sh 'docker build -t rspraneeth/devops-integration .'
                }
            }
        }

        stage('Push image to Hub'){
            steps{
                script{
                    withCredentials([string(credentialsId: 'dockerhubpwd', variable: 'dockerhubpwd')]){
                        sh 'docker login -u rspraneeth -p ${dockerhubpwd}'
                    }
                    sh 'docker push rspraneeth/devops-integration'
                }
            }
        }
    }
}
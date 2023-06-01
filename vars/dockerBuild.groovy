def call(String aws_account_id, String region, String ecr_repoName){
    
    sh """
     sudo docker build -t ${ecr_repoName} .
     sudo docker tag ${ecr_repoName}:latest ${aws_account_id}.dkr.ecr.${region}.amazonaws.com/${ecr_repoName}:latest
    """
}

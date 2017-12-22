
node {
    api  = load("${env.WORKSPACE}@script/jenkins/APICommon.groovy");
}

parameters {
    string(name: 'name', defaultValue: '', description: 'merchant name')
    string(name: 'program_name', defaultValue: '', description: 'program_name')
}

stage ("Prepare job") {
    node {
        dev_token = api.get_token("dev")
        merchants_endpoint = "/merchants/"
    }
}

stage ("LOCAL creation") {
    def url = api.get_env_url("dev") + merchants_endpoint
    def payload = """{"name": "local test 1", "program_name": "lcoas asdas", "values": []}"""
    def response = api.post(url, payload, dev_token)
    echo "Merchant created in LOCAL: $response.content"
    
    def content = api.parse_json(response.content)
    public_id = content["public_id"]
    production_id = content["id"]
    
    echo "$public_id  -  $production_id"
}


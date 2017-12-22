import groovy.json.JsonSlurperClassic


def get_env_url(def env){
    urls_map = [
        dev: "http://127.0.0.1:8080",
        staging: "",  // avoiding Load Balancer
        production: "",  // avoiding Load Balancer
    ]
    return urls_map[env]
}

def parse_json(def json_in_string) {
    new JsonSlurperClassic().parseText(json_in_string)
}

def get_token(def env) {
    
    def user = "walterbrunetti"
    def psw = "Staging1234"
    
    payload = """{"username": "$user", "password": "$psw"}"""
    
    def url = get_env_url(env) + "/auth/"
    def response = httpRequest acceptType: 'APPLICATION_JSON', contentType: 'APPLICATION_JSON', httpMode: 'POST', requestBody: auth_payload, url: url, ignoreSslErrors: true
    def content = parse_json(response.content)
    return content["token"]
}

def get(def url, def token) {
    def response = httpRequest url: url, ignoreSslErrors: true, customHeaders: [[name: 'Authorization', value: 'Token ' + token]]
    return response
}

def post(def url, def payload, def token) {
    def response = httpRequest acceptType: 'APPLICATION_JSON', contentType: 'APPLICATION_JSON', httpMode: 'POST', requestBody: payload, url: url, ignoreSslErrors: true, customHeaders: [[name: 'Authorization', value: 'Token ' + token]]
    return response
}

return this;


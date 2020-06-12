import json
import requests

request = requests.get('https://api.github.com/repos/ggoraa/GLaDOS/releases/latest')
#print(request.json())
response = request.json()
#print(response)
json = json.dumps(response)
print(json['assets_url'])
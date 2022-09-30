#!/usr/bin/python3
import random
import string
import subprocess
from flask import Flask, request
os.system('sleep 5')
app = Flask(__name__)

def randName():
    return ''.join([random.choice(string.hexdigits) for i in range(16)])

@app.route('/')
def index():
    dbpath = f'/tmp/{randName()}.db'

    query = request.args.get("query")

    if query:
        ban = ['.', 'lo', ';', 'read', 'im']

        for x in ban:
            if x in query:
                return "Filtered.."
        for x in range(1,11):
            print(x)

        proc = subprocess.Popen(["sqlite3", dbpath, query], stdout=subprocess.PIPE)
        (out, err) = proc.communicate()

        return out
    else:
        return 'no query'

app.run(host='0.0.0.0', port=9000)

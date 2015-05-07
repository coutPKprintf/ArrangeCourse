from flask import *
from flask_bootstrap import Bootstrap
import urllib

app = Flask(__name__)
Bootstrap(app)

@app.route('/')
@app.route("/login",methods=['POST','GET'])
def login():
    error = None
    if request.method == 'POST':
        if request.form['username'] != 'admin' or request.form['password'] != '1': 
            error= "sorry"
        else:
            return redirect(url_for('index'))
    return render_template('login.html',error=error)
@app.route("/test",methods = ['GET'])
def test():
    f=urllib.urlopen("http://127.0.0.1:8080/health")
    return render_template("test.html",name=f.read())
@app.route("/index")
def index():
    return render_template('index.html')

if __name__ == "__main__":
    app.run(
        host="0.0.0.0", 
        port=5000, 
        debug=True)

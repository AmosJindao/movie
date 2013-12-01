from django.shortcuts import render_to_response,render
from django.http import HttpResponse
from django.template import Context,loader

# Create your views here.

def index(req,id):
    return HttpResponse('<h1>Hello World '+id+'</h1>')

def login(req):
    t = loader.get_template('login.html')
    c = Context({})
    return HttpResponse(t.render(c))

def login2(req):
    return render_to_response('login.html',{})

def login3(req):
    return render(req,'login.html',{})
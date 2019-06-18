from django.shortcuts import render, redirect
from .models import Note
from django.views.generic import TemplateView


# Create your views here.

def home(request):
    return render(request, 'notenerfassung/home.html')


def schueler(request):
    return render(request, 'notenerfassung/schueler.html', )

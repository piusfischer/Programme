from django.shortcuts import render, redirect
from django.contrib.auth.forms import AuthenticationForm
from django.contrib.auth import login, authenticate
from django.contrib import messages
from .models import Schueler, Lehrer


# Create your views here.

def home(request):
    return render(request, 'notenerfassung/home.html')


def schueler(request):
    return render(request, 'notenerfassung/schueler.html', )


def login_request(request):
    if request.method == "POST":
        form = AuthenticationForm(request, data=request.POST)
        if form.is_valid():
            username = form.cleaned_data.get('username')
            password = form.cleaned_data.get('password')
            user = authenticate(username=username, password=password)
            schueler = Schueler.objects.filter(user=user)
            lehrer = Lehrer.objects.filter(user=user)
            print(schueler)
            print(lehrer)
            if user is not None:
                login(request, user)
                messages.info(request, "You are now logged in as {username}")
                if schueler .exists():
                    return redirect("schueler/")
                if lehrer .exists():
                    return redirect("lehrer/")

            else:
                messages.error(request, "Invalid username or password")

        else:
            messages.error(request, "Invalid username or password")

    form = AuthenticationForm()
    return render(request,
                  "notenerfassung/login.html",
                  {"form": form})

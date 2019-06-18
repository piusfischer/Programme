from django.urls import path
from . import views



urlpatterns = [
    path('home/', views.home),
    path('schueler/', views.schueler),
    path('', views.login_request, name="login"),

]

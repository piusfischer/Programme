import datetime
from django.db import models
from django.utils import timezone


# Create your models here.



class Klasse(models.Model):
    name = models.CharField(max_length=10)

    def __str__(self):
        return self.name


class Lehrer(models.Model):
    first_name = models.CharField(max_length=20)
    last_name = models.CharField(max_length=20)
    password = models.CharField(max_length=50)
    isAdmin = models.BooleanField()

    def __str__(self):
        return self.first_name + " " + self.last_name


class Fach(models.Model):
    name = models.CharField(max_length=10)

    def __str__(self):
        return self.name


class Schueler(models.Model):
    first_name = models.CharField(max_length=20)
    last_name = models.CharField(max_length=20)
    password = models.CharField(max_length=10)
    klasse = models.ForeignKey(Klasse, on_delete=models.CASCADE)

    def __str__(self):
        return self.first_name + " " + self.last_name


class Unterrichtet(models.Model):
    lehrer = models.ForeignKey(Lehrer, on_delete=models.CASCADE)
    klasse = models.ForeignKey(Klasse, on_delete=models.CASCADE)
    fach = models.ForeignKey(Fach, on_delete=models.CASCADE)

    def __str__(self):
        return self.lehrer


class Note(models.Model):
    schueler = models.ForeignKey(Schueler, on_delete=models.CASCADE)
    fach = models.ForeignKey(Unterrichtet, on_delete=models.CASCADE)
    note = models.IntegerField()
    lehrer = models.ForeignKey(Lehrer, on_delete=models.CASCADE)

    def __str__(self):
        return self.schueler


Lehrer.klasse = models.ForeignKey(Unterrichtet, on_delete=models.CASCADE)



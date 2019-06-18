from django.contrib import admin

# Register your models here.

from .models import Klasse, Lehrer, Schueler, Fach, Note, Unterrichtet

admin.site.register(Klasse)
admin.site.register(Lehrer)
admin.site.register(Schueler)
admin.site.register(Fach)
admin.site.register(Note)
admin.site.register(Unterrichtet)

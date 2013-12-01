from django.conf.urls import patterns, include, url

from django.contrib import admin
admin.autodiscover()

urlpatterns = patterns('web.views',
    # Examples:
    # url(r'^$', 'python_movie_web.views.home', name='home'),
    # url(r'^blog/', include('blog.urls')),

#     url(r'^admin/', include(admin.site.urls)),
#     url(r'^index/(?P<id>\d{2})/$','index'),
    url(r'^index/(\d{2})/$','index'),
    url(r'^login/$','login'),
    url(r'^login2/$','login2'),
    url(r'^login3/$','login3'),
)

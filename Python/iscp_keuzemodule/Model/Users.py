__author__ = 'SEVAK MARDIROSIAN'

from PyQt4.QtCore import *
from PyQt4.QtGui import *
from PyQt4.uic import *

class Users(QAbstractListModel):
    def __int__(self, username=None,voornaam=None,achternaam=None,email=None,telefoonnummer=None,adres=None,
                wachtwoord=None, parant =None):
        QAbstractListModel. __init__(self,parant)
        self.username=username
        self.voornaam = voornaam
        self.achternaam = achternaam
        self.email=email
        self.telefoonnummer= telefoonnummer
        self.adres=adres
        self.wachtwoord=wachtwoord




    @property
    def getUsername(self):
        return self._username
    @getUsername.setter
    def setUsername(self,value):
        self._usernaem = value
    @getUsername.deleter
    def deleteUsername(self):
        del self.getUsername






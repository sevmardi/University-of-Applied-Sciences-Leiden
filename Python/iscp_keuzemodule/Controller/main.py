__author__ = 'SEVAK MARDIROSIAN'

import os
import sys
import sqlite3
from PyQt4.QtGui import *
from PyQt4.QCore import *
import re
import logging




class Main(QMainWindow ):

    dbPath =  "data.db"
    dbConn = sqlite3.connect(dbPath)

    def __init__(self, parant=None):
        super(Main, self).__init__(parant)
        self.setupUi(self)

        self.dbCursor = self.dbConn.cursor()
        self.dbCursor.execute("""CREATE TABLE IF NOT EXISTS Main(id INTEGER PRIMARY KEY, gebruikersnaam TEXT,
         voornaam TEXT, achternaam TEXT, telefoonnummer INTEGER, adres TEXT, status TEXT)""")

        #commit changes into database
        self.dbConn.commit()
        #self.settings.QSettings(QSettings.IniFormat, QSettings.UserScope,"Data")
        self.addData.clicked.connect(self.addUser_function())
        self.removeRow.clicked.connect(self.removeUser_function())



    def addUser_function(self):
        newAct = self.QAction(QIcon(":/images/new"), ('&New'), self)

        username = self.username.text()
        voornaam = self.voornaam.text()
        achternaam =self.achternaam.text()
        tel = self.tel.int()
        adres = self.adres.text()

        if not self.validate_field_fucntion():
            return False

        # overzicht van users
        currentRowCount = self.mainTable.rowCount()

        self.mainTable.insertRow(currentRowCount)

        self.mainTable.setItem(currentRowCount,0, QTableWidgetItem(username))

        para = (None, username,voornaam,achternaam,tel,adres)
        self.dbCursor.execute('''INSERT INTO Main VALUES (?,?,?,?)''')
        #commit to db
        self.dbConn.commit()

    def removeUser_function(self):
        #removes users
        currentRow = self.mainTable.currentRow()

        if currentRow > -1:
            currentUsername = (self.mainTable.item(currentRow,0).text(),)
            self.dbCursor.execute("""DELETE FROM Main WHERE username=?""",currentUsername)
            self.dbConn.commit()
            self.mainTable.removeRow(currentRow)

    def validate_field_fucntion(self):
        """validates"""
        self.dbCursor.execute("""SELECT username FROM Main""" )
        username = self.dbCursor.fetchall()
        for username in username:
            if self.username.text() in username[0]:
                QMessageBox.warning(self,"Warning!","Such username already exists!")
                return False
        #telefoon check -> TO BE FIXED
        if not re.match('^[0-9]\d{10}-\d{12}',self.tel.int()):
            QMessageBox.warning(self, "Warning!","Phone number seems incorrect")
            return False
        return True
    def export_function(self):
        pass

    def import_function(self):
        pass

    def preferences_function(self):
        pass

    def about_function(self):
        pass

    def exit_function(self):
        pass


def main():
    app = QApplication(sys.argv)
    form = Main()
    form.show()
    app.exec_()

if __name__=="__main__":
    main()

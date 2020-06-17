import sqlite3

settingsDatabaseConnection = sqlite3.connect("settings.sqlite")
settingsDatabase = settingsDatabaseConnection.cursor()
mainDatabaseConnection = sqlite3.connect("main.sqlite")
mainDatabase = mainDatabaseConnection.cursor()


def getDeviceState(deviceID):
    
    pass


def setDeviceState(deviceID, state):
    pass

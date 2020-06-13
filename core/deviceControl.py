import sqlite3

databaseConnection = sqlite3.connect("core/databases/settings.sqlite")
database = databaseConnection.cursor()


def OnOffState(device, state):
    database.execute(f"UPDATE devices SET state = '{state}' WHERE ID = '{device}'")
    databaseConnection.commit()



def moveServoDevice(device, mode, number):
    if mode == "1":
        print("Moved device", device, "by", number)
    elif mode == "2":
        print("Moved device", device, "on position", number)
    else:
        print("Wrong mode was selected. Expected value is 1 or 2")


def moveMotorDevice(device, number, time):
    print("Moved motor", device, "for", time, "milliseconds and", number, "power")

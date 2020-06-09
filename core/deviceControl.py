from core import *


def OnOffState(device, state):
    state = functions.convertStringToBool(state)
    if state:
        print("Device", device, "is now on")
    elif not state:
        print("Device", device, "is now off")
    else:
        print("Wrong device state was selected. Expected value is true, on, 1, True or false, off, 0, False")


def moveServoDevice(device, mode, number):
    if mode == "1":
        print("Moved device", device, "by", number)
    elif mode == "0":
        print("Moved device", device, "on position", number)


def moveMotorDevice(device, number, time):
    pass

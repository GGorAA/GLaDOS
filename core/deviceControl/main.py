from core import *


def OnOffState(device, state):
    if state == "on":
        if device == 1:
            settings.baseTurnState = True
            print("Device", device, "is now on")
        elif device == 2:
            settings.baseTiltForwardState = True
            print("Device", device, "is now on")
        elif device == 3:
            settings.baseTiltSideState = True
            print("Device", device, "is now on")
        elif device == 4:
            settings.armBendState = True
            print("Device", device, "is now on")
        elif device == 5:
            settings.armBendSideState = True
            print("Device", device, "is now on")
        elif device == 6:
            settings.headTurnState = True
            print("Device", device, "is now on")
        elif device == 7:
            settings.headTiltState = True
            print("Device", device, "is now on")
        elif device == 8:
            settings.eyeLEDState = True
            print("Device", device, "is now on")
        elif device == 9:
            settings.baseLEDsState = True
            print("Device", device, "is now on")
        else:
            print("Wrong device was selected.")
    elif state == "off":
        if device == 1:
            settings.baseTurnState = False
            print("Device", device, "is now off")
        elif device == 2:
            settings.baseTiltForwardState = False
            print("Device", device, "is now off")
        elif device == 3:
            settings.baseTiltSideState = False
            print("Device", device, "is now off")
        elif device == 4:
            settings.armBendState = False
            print("Device", device, "is now off")
        elif device == 5:
            settings.armBendSideState = False
            print("Device", device, "is now off")
        elif device == 6:
            settings.headTurnState = False
            print("Device", device, "is now off")
        elif device == 7:
            settings.headTiltState = False
            print("Device", device, "is now off")
        elif device == 8:
            settings.eyeLEDState = False
            print("Device", device, "is now off")
        elif device == 9:
            settings.baseLEDsState = False
            print("Device", device, "is now off")
        else:
            print("Wrong device was selected.")
    elif state == "default":
        if device == 1:
            settings.baseTurnState = settings.baseTurnState_Default
            print("Device", device, "state is now", state)
        elif device == 2:
            settings.baseTiltForwardState = settings.baseTiltForwardState_Default
            print("Device", device, "state is now", state)
        elif device == 3:
            settings.baseTiltSideState = settings.baseTiltSideState_Default
            print("Device", device, "state is now", state)
        elif device == 4:
            settings.armBendState = settings.armBendState_Default
            print("Device", device, "state is now", state)
        elif device == 5:
            settings.armBendSideState = settings.armBendSideState_Default
            print("Device", device, "state is now", state)
        elif device == 6:
            settings.headTurnState = settings.headTurnState_Default
            print("Device", device, "state is now", state)
        elif device == 7:
            settings.headTiltState = settings.headTiltState_Default
            print("Device", device, "state is now", state)
        elif device == 8:
            settings.eyeLEDState = settings.eyeLEDState_Default
            print("Device", device, "state is now", state)
        elif device == 9:
            settings.baseLEDsState = settings.baseLEDsState_Default
            print("Device", device, "state is now", state)
        else:
            print("Wrong device was selected.")
    else:
        print("Wrong device state was selected. Expected value is true, on, 1, True or false, off, 0, False")


def moveServoDevice(device, mode, number):
    if mode == "1":
        print("Moved device", device, "by", number)
    elif mode == "2":
        print("Moved device", device, "on position", number)
    else:
        print("Wrong mode was selected. Expected value is 1 or 2")


def moveMotorDevice(device, number, time):
    print("Moved motor", device, "for", time, "milliseconds and", number, "power")

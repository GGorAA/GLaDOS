import core


def OnOffState(device, state):
    if state == "on":
        if device == "1":
            core.settings.baseTurnState = True
            print("Device", device, "is now on")
        elif device == "2":
            core.settings.baseTiltForwardState = True
            print("Device", device, "is now on")
        elif device == 3:
            core.settings.baseTiltSideState = True
            print("Device", device, "is now on")
        elif device == 4:
            core.settings.armBendState = True
            print("Device", device, "is now on")
        elif device == 5:
            core.settings.armBendSideState = True
            print("Device", device, "is now on")
        elif device == 6:
            core.settings.headTurnState = True
            print("Device", device, "is now on")
        elif device == 7:
            core.settings.headTiltState = True
            print("Device", device, "is now on")
        elif device == 8:
            core.settings.eyeLEDState = True
            print("Device", device, "is now on")
        elif device == 9:
            core.settings.baseLEDsState = True
            print("Device", device, "is now on")
        else:
            print("Wrong device was selected.")
    elif state == "off":
        if device == "1":
            core.settings.baseTurnState = False
            print("Device", device, "is now off")
        elif device == "2":
            core.settings.baseTiltForwardState = False
            print("Device", device, "is now off")
        elif device == "3":
            core.settings.baseTiltSideState = False
            print("Device", device, "is now off")
        elif device == "4":
            core.settings.armBendState = False
            print("Device", device, "is now off")
        elif device == "5":
            core.settings.armBendSideState = False
            print("Device", device, "is now off")
        elif device == "6":
            core.settings.headTurnState = False
            print("Device", device, "is now off")
        elif device == "7":
            core.settings.headTiltState = False
            print("Device", device, "is now off")
        elif device == "8":
            core.settings.eyeLEDState = False
            print("Device", device, "is now off")
        elif device == "9":
            core.settings.baseLEDsState = False
            print("Device", device, "is now off")
        else:
            print("Wrong device was selected.")
    elif state == "default":
        if device == 1:
            core.settings.baseTurnState = core.settings.baseTurnState_Default
            print("Device", device, "state is now", state)
        elif device == 2:
            core.settings.baseTiltForwardState = core.settings.baseTiltForwardState_Default
            print("Device", device, "state is now", state)
        elif device == 3:
            core.settings.baseTiltSideState = core.settings.baseTiltSideState_Default
            print("Device", device, "state is now", state)
        elif device == 4:
            core.settings.armBendState = core.settings.armBendState_Default
            print("Device", device, "state is now", state)
        elif device == 5:
            core.settings.armBendSideState = core.settings.armBendSideState_Default
            print("Device", device, "state is now", state)
        elif device == 6:
            core.settings.headTurnState = core.settings.headTurnState_Default
            print("Device", device, "state is now", state)
        elif device == 7:
            core.settings.headTiltState = core.settings.headTiltState_Default
            print("Device", device, "state is now", state)
        elif device == 8:
            core.settings.eyeLEDState = core.settings.eyeLEDState_Default
            print("Device", device, "state is now", state)
        elif device == 9:
            core.settings.baseLEDsState = core.settings.baseLEDsState_Default
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

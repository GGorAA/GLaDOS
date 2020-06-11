import core


def getDeviceIDToState(deviceid):
    if deviceid == "1":
        output = core.settings.baseTurnState
    elif deviceid == "2":
        output = core.settings.baseTiltForwardState
    else:
        output = "Error"
    return output




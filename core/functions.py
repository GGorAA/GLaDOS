def convertStringToBool(value):
    result = None
    if value == "on" or value == "true" or value == "True" or value == "1" or value == "y" or value == "yes":
        result = True

    if value == "off" or value == "false" or value == "False" or value == "0" or value == "n" or value == "no":
        result = False

    return result


def controlDeviceOnOffState(device, state):
    state = convertStringToBool(state)
    if state:
        print("Device", device, "is now off")
    elif not state:
        print("Device", device, "is now off")
    else:
        print("Wrong device state was selected. Expected value is true, on, 1, True or false, off, 0, False")

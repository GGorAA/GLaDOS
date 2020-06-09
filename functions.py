def convertStringToBool(value):
    result = None
    if value == "on" or value == "true" or value == "True" or value == "1" or value == "y" or value == "yes":
        result = True

    if value == "off" or value == "false" or value == "False" or value == "0" or value == "n" or value == "no":
        result = False

    return result

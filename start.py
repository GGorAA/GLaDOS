import os
import RPi.GPIO as GPIO
import time

print("#     _____ _           _____   ____   _____                 _                 \n")
print("#    / ____| |         |  __ \ / __ \ / ____|               | |                \n")
print("#   | |  __| |     __ _| |  | | |  | | (___    ___ _   _ ___| |_ ___ _ __ ___  \n")
print("#   | | |_ | |    / _` | |  | | |  | |\___ \  / __| | | / __| __/ _ \ '_ ` _ \ \n")
print("#   | |__| | |___| (_| | |__| | |__| |____) | \__ \ |_| \__ \ ||  __/ | | | | |\n")
print("#    \_____|______\__,_|_____/ \____/|_____/  |___/\__, |___/\__\___|_| |_| |_|\n")
print("#                                                   __/ |                      \n")
print("#                                                  |___/                       \n")
print("Version 1.0beta\n")
print("Starting setup...")
print("Setting up GPIO ports...\n")

try:
    print("Assigning variables...\n")
    statusLED = 7
    baseMotor = 11
    bodyServo = 12
    headTurnServo = 13
    headServo = 15
    headLED = 16
    print("Setting up pins...")
    GPIO.setMode(GPIO.BOARD)
    GPIO.setup(statusLED, GPIO.OUT)
    GPIO.setup(baseMotor, GPIO.OUT)
    GPIO.setup(bodyServo, GPIO.OUT)
    GPIO.setup(headTurnServo, GPIO.OUT)
    GPIO.setup(headServo, GPIO.OUT)
    GPIO.setup(headLED, GPIO.OUT)
    print("GPIO ports setup ended with success.\n")
except:
    GPIO.cleanup()
    print("Error while setting up GPIO ports. Rebooting...")
    time.sleep(1000)
    os.system('/sbin/reboot')

print("Starting modules...")

print("Starting camera stream...")

print("Starting web server...")
try:
    os.system('sudo /etc/init.d/nginx start')
except:
    print("Error while starting the web server. Exiting...")
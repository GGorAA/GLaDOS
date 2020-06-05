"""
    Setup script for GLaDOS. Checks for updates of the system and enables all needed features and modules.
    Creator: GGorAA
    Organisation: Dynamium
    Version: 1.0beta
"""
import os
import RPi.GPIO as GPIO
import time

print("#     _____ _           _____   ____   _____                 _                            _               \n")
print("#    / ____| |         |  __ \ / __ \ / ____|               | |                          | |              \n")
print("#   | |  __| |     __ _| |  | | |  | | (___    ___ _   _ ___| |_ ___ _ __ ___    ___  ___| |_ _   _ _ __  \n")
print("#   | | |_ | |    / _` | |  | | |  | |\___ \  / __| | | / __| __/ _ \ '_ ` _ \  / __|/ _ \ __| | | | '_ \ \n")
print("#   | |__| | |___| (_| | |__| | |__| |____) | \__ \ |_| \__ \ ||  __/ | | | | | \__ \  __/ |_| |_| | |_) |\n")
print("#    \_____|______\__,_|_____/ \____/|_____/  |___/\__, |___/\__\___|_| |_| |_| |___/\___|\__|\__,_| .__/ \n")
print("#                                                   __/ |                                          | |    \n")
print("#                                                  |___/                                           |_|    \n")
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

print("Checking for updates...\n")
try:
    os.system('sudo apt update')
    os.system("sudo apt upgrade")
except:
    print("Error while checking for updates. Skipping...")

print("Checking and installing missing packages ...")
try:
    os.system('sudo apt install libjpeg62-turbo-dev')
    os.system('sudo apt install cmake')
except:
    print("Error while checking for missing packages. Skipping...")

print("Setting up camera streamer...")
try:
    os.system('git clone https://github.com/jacksonliam/mjpg-streamer.git ~/mjpg-streamer')
    os.system('cd ~/mjpg-streamer/mjpg-streamer-experimental')
    os.system('make clean all')
    os.system('sudo rm -rf /opt/mjpg-streamer')
    os.system('sudo mv ~/mjpg-streamer/mjpg-streamer-experimental /opt/mjpg-streamer ')
    os.system('sudo rm -rf ~/mjpg-streamer')
except:
    print('Error while setting up camera streamer. Exiting...')

print("Setup completed. You can now launch GLaDOS system.")
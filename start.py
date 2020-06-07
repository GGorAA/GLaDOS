import os
#import RPi.GPIO as GPIO
import time

"""
    Starting script for GLaDOS. Runs on startup. Starts NGINX server, camera streaming, GPIO pins, and starts self-test.
    Name: start.py
    Creator: GGorAA
    Version: 1.0beta
"""

print("     _____ _           _____   ____   _____                 _                 ")
print("    / ____| |         |  __ \ / __ \ / ____|               | |                ")
print("   | |  __| |     __ _| |  | | |  | | (___    ___ _   _ ___| |_ ___ _ __ ___  ")
print("   | | |_ | |    / _` | |  | | |  | |\___ \  / __| | | / __| __/ _ \ '_ ` _ \ ")
print("   | |__| | |___| (_| | |__| | |__| |____) | \__ \ |_| \__ \ ||  __/ | | | | |")
print("    \_____|______\__,_|_____/ \____/|_____/  |___/\__, |___/\__\___|_| |_| |_|")
print("                                                   __/ |                      ")
print("                                                  |___/                       ")
print("Version 1.0beta")
print("Starting setup...")
print("Setting up GPIO ports...")

try:
    print("Assigning variables...")
    statusLED = 7
    baseMotor = 11
    bodyServo = 12
    headTurnServo = 13
    headServo = 15
    headLED = 16
    baseLEDs = 18
    print("Setting up pins...")
    """GPIO.setMode(GPIO.BOARD)
    GPIO.setup(statusLED, GPIO.OUT)
    GPIO.setup(baseMotor, GPIO.OUT)
    GPIO.setup(bodyServo, GPIO.OUT)
    GPIO.setup(headTurnServo, GPIO.OUT)
    GPIO.setup(headServo, GPIO.OUT)
    GPIO.setup(headLED, GPIO.OUT)
    """
except:
    """
    GPIO.cleanup()
    """
    print("Error while setting up GPIO ports. Rebooting...")
    time.sleep(1000)
    #os.system('/sbin/reboot')

print("Starting modules...")

print("Starting camera stream...")
"""
try:
    os.system(
        'LD_LIBRARY_PATH=/opt/mjpg-streamer/ /opt/mjpg-streamer/mjpg_streamer -i "input_raspicam.so -fps 30 -q 50 -x '
        '640 -y 480" -o "output_http.so -p 9000 -w /opt/mjpg-streamer/www" &')
except:
    print("Failed to start camera stream.")
"""
print("Starting web server...")
"""
try:
    os.system('sudo /etc/init.d/nginx start')
except:
    print("Error while starting the web server.")
"""

print("GLaDOS started successfully!")

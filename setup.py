"""
    Setup script for GLaDOS. Checks for updates of the system and enables all needed features and modules.
    Name: setup.py
    Creator: GGorAA
    Version: 1.0beta
"""
import os
import RPi.GPIO as GPIO
import time

print("#     _____ _           _____   ____   _____                 _                            _               ")
print("#    / ____| |         |  __ \ / __ \ / ____|               | |                          | |              ")
print("#   | |  __| |     __ _| |  | | |  | | (___    ___ _   _ ___| |_ ___ _ __ ___    ___  ___| |_ _   _ _ __  ")
print("#   | | |_ | |    / _` | |  | | |  | |\___ \  / __| | | / __| __/ _ \ '_ ` _ \  / __|/ _ \ __| | | | '_ \ ")
print("#   | |__| | |___| (_| | |__| | |__| |____) | \__ \ |_| \__ \ ||  __/ | | | | | \__ \  __/ |_| |_| | |_) |")
print("#    \_____|______\__,_|_____/ \____/|_____/  |___/\__, |___/\__\___|_| |_| |_| |___/\___|\__|\__,_| .__/ ")
print("#                                                   __/ |                                          | |    ")
print("#                                                  |___/                                           |_|    ")
print("Version 1.0beta")
print("Starting setup...")

print("Checking for updates...")
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
    print('Error while setting up camera streamer.')

print("Installing NGINX server...")
try:
    os.system("sudo apt install nginx")
except:
    print("Failed when installing NGINX server.")

print("Setup completed. You can now launch GLaDOS system.")
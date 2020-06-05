"""
    Main script for GLaDOS. Does all main stuff.
    Creator: GGorAA
    Organisation: Dynamium
    Version: 1.0beta
"""
import os

os.system(
    'LD_LIBRARY_PATH=/opt/mjpg-streamer/ /opt/mjpg-streamer/mjpg_streamer -i "input_raspicam.so -fps 30 -q 50 -x 640 -y 480" -o "output_http.so -p 9000 -w /opt/mjpg-streamer/www" &')

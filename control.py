"""
    Main script for GLaDOS. Does all main stuff.
    Name: control.py
    Creator: GGorAA
    Version: 1.0beta
"""
import argparse
import core

# Adding arguments

# Defining parser variable
parser = argparse.ArgumentParser()
# Adding arguments
parser.add_argument("--device")
parser.add_argument("--mode")
parser.add_argument("--number")
parser.add_argument("--time")
parser.add_argument("--state")
# Assigning parsed args to a "args" variable
args = parser.parse_args()

if args.device and args.number and args.time:
    core.deviceControl.moveMotorDevice(args.device, args.number, args.time)

if args.device and args.mode and args.number:
    core.deviceControl.moveServoDevice(args.device, args.mode, args.number)

if args.device and args.state:
    core.deviceControl.OnOffState(args.device, args.state)

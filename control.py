"""
    Main script for GLaDOS. Does all main stuff.
    Name: control.py
    Creator: GGorAA
    Version: 1.0beta
"""
#import start
import argparse

"""
    Documentation
    
    Device number to actual device
    Base turn: 1
    Base side tilt: 2
    Base front tilt: 3
    Arm: 4
    Head turn: 5
    Head tilt: 6
    Head LED: 7
    Base LEDs: 8
    
    Modes
    Add/substract: 1
    Exact number: 2
    
    Number
    If specified mode 1, you need to specify number, which will be used as a angle. e.g. turn one side by 3: control.py --device 4 --mode 1 --number 3. Turn to the opposite side: --number -3.
    If specified mode 2, you need to specify exact number on which you need to turn. e.g. --number 90.
    
    State
    This argument is for enabling\disabling devices. Example: control.py --device 7 --state false. 
    This command tells to a head LED to to turn off. 
    The same command to turn it back on: control.py --device 7 --state true.
"""

# Adding arguments

# Defining parser variable
parser = argparse.ArgumentParser()
# Adding arguments
parser.add_argument("--device")
parser.add_argument("--mode")
parser.add_argument("--number")
parser.add_argument("--state")
# Assigning parsed args to a "args" variable
args = parser.parse_args()

if args.device and args.mode and args.number:
    device = args.device
    mode = args.mode
    number = args.number

if args.device and args.state:
    device = args.device
    state = args.state

    if device == 7:
        print("Selected device number 7. GPIO pin: 16.")
    elif device == 8:
        print("Selected device number 8. GPIO pin: 18.")


"""
    Main script for GLaDOS. Does all main stuff.
    Creator: GGorAA
    Organisation: Dynamium
    Version: 1.0beta
"""
#import start
import argparse

# Adding arguments

# Defining parser variable
parser = argparse.ArgumentParser()
# Adding arguments
parser.add_argument("--device")
parser.add_argument("--mode")
parser.add_argument("--number")
# Assigning parsed args to a "args" variable
args = parser.parse_args()

if args.device and args.mode and args.number:
    device = args.device
    mode = args.mode
    number = args.number

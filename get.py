import core
import argparse
import sqlite3


# Adding arguments

# Defining parser variable
parser = argparse.ArgumentParser()
parser.add_argument("--setting")
parser.add_argument("--device")
parser.add_argument("--state")

args = parser.parse_args()

if args.device:
    output = core.settings.getDeviceIDToState(args.device)
    print(output)

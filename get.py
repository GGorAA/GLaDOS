import argparse
import sqlite3

# Database setup

# Connect database
databaseConnection = sqlite3.connect('core/databases/settings.sqlite')
# Adding cursor(i am not sure what it is, but it was in tutorial lol)
database = databaseConnection.cursor()


# Adding arguments

# Defining parser variable
parser = argparse.ArgumentParser()
parser.add_argument("--setting")
parser.add_argument("--deviceName")
parser.add_argument("--deviceState")
parser.add_argument("--deviceGPIO")

args = parser.parse_args()

if args.deviceName:
    # Get data from database, searching with ID inserted while executing
    for output in database.execute(f"SELECT deviceName FROM devices WHERE ID = '{args.devicename}'"):
        # Convert list to name
        output = output[0]
        # Print search result
        print(output)
if args.deviceState:
    for output in database.execute(f"SELECT state FROM devices WHERE ID = '{args.deviceState}'"):
        # Convert list to name
        output = output[0]
        # Print search result
        print(output)

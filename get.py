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
parser.add_argument("--devicename")
parser.add_argument("--state")

args = parser.parse_args()

if args.devicename:
    # Get data from database, searching with ID inserted while executing
    for output in database.execute(f"SELECT deviceName FROM device_settings WHERE ID = '{args.devicename}' ):
        # Convert name to list
        output = output[0]
        # Print search result
        print(output)

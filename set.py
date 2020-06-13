import core
import argparse

parser = argparse.ArgumentParser()
parser.add_argument("--device")
parser.add_argument("--state")
args = parser.parse_args()

if args.device and args.state:
    core.deviceControl.OnOffState(args.device, args.state)
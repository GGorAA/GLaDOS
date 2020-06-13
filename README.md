# GLaDOS System

This Python project is powering GLaDOS, which is powered by Raspberry Pi.

![](https://img.shields.io/badge/Version-1.0--alpha3-blue)
![](https://img.shields.io/badge/Code%20quality-middling-yellow)
![](https://img.shields.io/badge/Complete-no-red)
![](https://img.shields.io/badge/Python-3.8-yellow)

# README.md is not complete!

## Copyright credits to:

- [Google Fonts](https://fonts.google.com)
- [JoyStick](https://github.com/bobboteck/JoyStick)
- [NGINX](https://nginx.com)
- [Python](https://python.org)

## Documentation

### control.py

This script is only for controlling device state and position.

#### Usage:
`python3 control.py --device --mode --number` or `python3 control.py --device --state`.

##### Device number to actual device
 - Base turn: 1
 - Base side tilt: 2
 - Base front tilt: 3
 - Arm bend: 4
 - Arm bend side: 5
 - Head turn: 6
 - Head tilt: 7
 - Eye LED: 8
 - Base LEDs: 9
    
##### Modes
 - Add/subtract: 1
 - Exact number: 2
 
When not specified default is 1.
    
##### Number
 - If specified mode 1, you need to specify number, which will be used as a angle. e.g. turn one side by 3: control.py --device 4 --mode 1 --number 3. Turn to the opposite side: --number -3.
 - If specified mode 2, you need to specify exact number on which you need to turn. e.g. --number 90.
    
##### State

This argument is for enabling\disabling devices. Example: control.py --device 7 --state false. 
This command tells to a head LED to to turn off. 
The same command to turn it back on: control.py --device 7 --state true.

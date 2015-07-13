# PMCADemo #

An Android demo app for Sony cameras to test some features.

## Installation ##
Install it here: [sony-pmca.appspot.com/apps](https://sony-pmca.appspot.com/apps)

## Usage ##
* The trash button is mapped to the back key
* The app writes a log to the SD card (*PMCADEMO/LOG.TXT*)

The following options are available:

### Camera ##
Displays the live view image and allows you to take a picture. The last settings are used. Mode dial changes are ignored.

* Half-press the shutter button to focus
* Fully press the shutter button to take a picture (it is saved on your SD card just as if you had taken it outside of Android) 
* Press the trash button to exit

### Key events ###
Displays key events.

* Press any key or disconnect the lens to log it on the screen
* Press the trash button to exit

### Properties ###
Displays some camera properties (Model, serial number, etc.)

* Press the trash button to exit

### Time ###
Displays the current time. The camera time zone is used.

* Press the trash button to exit

### Internet ###
Connects to one of the configured wifi networks and displays a web browser. A simple web server is started, too. Open the displayed URL on any client in the same network.

* Use the up / down / left / right and enter keys to use the browser
* Press the trash button to exit

### Wifi settings ###
Opens the standard wifi settings.

* Press the menu button to exit

### Wifi direct ###
Enables the camera's wifi direct network and starts a simple web server. Connect a client to the wifi and open the displayed URL. WPS is currently not supported. 

* Press the trash button to exit

### Display ###
Logs changes of the active display.

* Press the enter button or use the eyepiece sensor to change displays
* Press the trash button to exit

### LEDs ###
Test some camera LEDs. The charging LED doesn't seem to be supported.

* Half-press the shutter button to turn on the AF light
* Press the enter button to flash the card LED in different speeds
* Press the trash button to exit

### Playback ###
Displays the images on your SD card.

* Use the up / down keys to select an image
* Press the enter button to display it
* Press the trash button to exit

### Install ###
Install new apps from your SD card. All *.spk* files under *[SD card]/PMCADEMO* are listed. You can download apps in spk format [here](https://sony-pmca.appspot.com/apps).

* Use the up / down keys to select a package
* Press the enter button to install it
* Press the trash button to exit

## The Framework ##
This app uses several Sony custom APIs. They can be found in *android_ext2.fsimg* under the *framework* folder. To enable simple compilation of this app, java stubs were generated. They can be found in the *framework* folder of this repository and are included as a `provided` project dependency.

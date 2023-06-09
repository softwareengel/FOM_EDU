#import RPi.GPIO as GPIO #Use for Raspberry Pi GPIO
import TestRPiGPIO as GPIO

# TODO Implementiere die Logik fuer das gelbe und rote Licht. 
# Tipp: Orientiere dich an der Implementierung des gruenen Lichtes.
class Lights(object):


    def __init__(self, green_pin, yellow_pin, red_pin):
        self.green_pin = green_pin # Setzt die Instanzvariable self.green_pin auf die uebergebene Variable green_pin
        self.yellow_pin = yellow_pin
        self.red_pin = red_pin

        GPIO.setmode(GPIO.BCM)
        GPIO.setup(self.green_pin, GPIO.OUT) # Sagt dem GPIO Board, dass self.green_pin ein output Pin ist. Er also genutzt wird, um Spannungen zu erzeugen, nicht auszulesen.

    def turn_green_light_on(self):
        GPIO.output(self.green_pin, GPIO.HIGH) # Sagt dem GPIO Board, dass der Pin self.green_pin auf High (3,3V) zu setzen ist

    def turn_green_light_off(self):
        GPIO.output(self.green_pin, GPIO.LOW) # Sagt dem GPIO Board, dass der Pin self.green_pin auf Low (0V) zu setzen ist

    def turn_yellow_light_on(self):
        # Sagt dem GPIO Board, dass der Pin self.yellow_pin auf High (3,3V) zu setzen ist
        GPIO.output(self.yellow_pin, GPIO.HIGH)

    def turn_yellow_light_off(self):
        # Sagt dem GPIO Board, dass der Pin self.yellow_pin auf Low (0V) zu setzen ist
        GPIO.output(self.yellow_pin, GPIO.LOW)

    def turn_red_light_on(self):
        # Sagt dem GPIO Board, dass der Pin self.red_pin auf High (3,3V) zu setzen ist
        GPIO.output(self.red_pin, GPIO.HIGH)

    def turn_red_light_off(self):
        # Sagt dem GPIO Board, dass der Pin self.red_pin auf Low (0V) zu setzen ist
        GPIO.output(self.red_pin, GPIO.LOW)


    def turn_lights_off(self):
        GPIO.output(self.green_pin, GPIO.LOW)
        GPIO.output(self.yellow_pin, GPIO.LOW)
        GPIO.output(self.red_pin, GPIO.LOW)

if __name__=='__main__':
    l = Lights( 3,27,15)
    l.turn_green_light_on()
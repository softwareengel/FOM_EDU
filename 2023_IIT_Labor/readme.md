# IIT Labortag

# Dateien zum Download 

- [ssh](files/ssh): Leere Datei mit Dateinamen "ssh", ermöglicht SSH-Zugang 
- [userconf.txt](files/userconf.txt): Datei mit einem User "pi" und dem Passwort "raspberry"  
- [wpa_supplicant.conf](files/wpa_supplicant.conf): Datei mit WLan config für SSID "softwareengel3370" zum Verbinden mit dem WLan-Netzwerk 


# Code - Vorlagen 
- [TestRPiGPIO.py](src/Vorlagen/LED/TestRPiGPIO.py): Datei zum Simulieren der Pins am PC ohne Raspi 
- [led.py](src/Vorlagen/LED/led.py): Vorlage für Led - Steuerungs-Klasse
- [helloworld.py](src/helloworld.py): Minimales Python-Programm 
# Verbindung 
- per SSH (ssh, winscp) mit Login pi und Passwort raspberry

# Test  
- Start des Pyhon - Interpreters 
  
```bash
pi@raspberrypi:~ $ python -V
Python 3.9.2
pi@raspberrypi:~ $ python helloworld.py 
Hello Raspi-World!
```



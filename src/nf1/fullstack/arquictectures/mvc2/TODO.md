
## Exercici:   
### Aplicació de Reserva de Llibres de Biblioteca (Patró MVC)  

Crea una aplicació de consola en Java que permeti a un usuari reservar un llibre d’una biblioteca. L’aplicació ha de seguir l’arquitectura MVC (Model-Vista-Controlador).
Requisits:  
 - L’usuari introdueix el seu nom i el títol del llibre que vol reservar per consola.  
 - L’aplicació mostra un missatge de confirmació amb el nom de l’usuari i el títol del llibre reservat.  
 - Organitza el teu codi en tres paquets: model, view i controller.  
 - El paquet model ha de contenir les següents classes:
   - User (emmagatzema les dades de l’usuari).
   - Book (emmagatzema les dades del llibre).
   - Reservation per encapsular la reserva.  
 - El paquet view s’encarrega de la interacció amb l’usuari (entrada i sortida).  
 - El paquet controller coordina el flux entre la vista i el model.  
 - Permet que l’usuari pugui reservar més d’un llibre.
 - Crea un classe ReservationService amb un mètode que faci la reserva del llibre.
 - En hexagonal implementa un adapter per desar les reserves en un List i un altre en un fitxer.
# pao_25
Programare Avansata pe Obiecte - grupa 231  


## Modalitate de evaluare:  
- curs, pondere 50% din nota finala materie PAO;  
    Modalitate evaluare: verificare (examen scris) in ultima saptamana din semestru   
- laborator, pondere 50% din nota finala materie PAO;     
    Modalitate evaluare laborator (varianta discutata):
    - prezenta: 20% (2 puncte din 10). 10-12 prezente pentru a obtine 2 pct., 7-9 prezente pentru 1 pct.   
    - teme suplimentare: 30%  (3 puncte din 10)
    - proiect: 50 % (5 puncte din 10)     

Nota finala din laborator trebuie sa fie de la 1 la 10, minim 5 pentru promovare si intrare in examenul scris.     
Punctajul obtinut in activitatea de laborator nu se rotunjeste. Se va face o singura rotunjire la final, dupa ce se aduna cu nota din examen.    


## Cerinte proiect:  

Fiecare student va lucra la un proiect individual. Proiectul este structurat în mai multe etape.  
Conditia de punctare a proiectelor:  
• sa nu prezinte erori de compilare;  
• sa se implementeze cerintele date.  

## Termene de predare:  
• Etapa I: saptamâna 14 – 18 aprilie  
• Etapa II: saptamâna 2 – 6 iunie  

### Etapa I  
1) Definirea sistemului  
   Sa se creeze o lista pe baza temei alese cu cel putin 10 actiuni/interogari care se pot face în cadrul sistemului si o lista cu cel putin 8 tipuri de obiecte.  
2) Implementare  
   Sa se implementeze în limbajul Java (versiunea 21) o aplicatie pe baza celor definite la primul punct.  
   Aplicatia va contine:  
   • clase simple cu atribute private / protected si metode de acces;  
   • cel putin 2 colectii diferite capabile sa gestioneze obiectele definite anterior (eg: List, Set, Map, etc.) dintre care cel putin una sa fie sortata.  
Se vor folosi array-uri uni/bidimensionale în cazul în care nu se parcurg colectiile pana la data checkpoint-ului;  
   • utilizare mostenire pentru crearea de clase aditionale si utilizarea lor în cadrul colectiilor;  
   • cel putin o clasa serviciu care sa expuna operatiile sistemului;  
   • o clasa Main din care sunt facute apeluri catre servicii.  

### Etapa II  
1) Extindeti proiectul din prima etapa prin realizarea persistentei utilizând o baza de date relationala si JDBC.  
   Sa se realizeze servicii care sa expuna operatii de tip create, read, update si delete pentru cel putin 4 dintre clasele definite.   
   Se vor realiza servicii singleton generice pentru scrierea si citirea din baza de date.  

2) Realizarea unui serviciu de audit  
   Se va realiza un serviciu care sa scrie într-un fisier de tip CSV de fiecare data când este executata una dintre actiunile descrise în prima etapa.   
   Structura fisierului: nume_actiune, timestamp  
 

  ## Teme sugerate:  
1) catalog (student, materie, profesor)  
2) biblioteca (sectiuni, carti, autori, cititori)  
3) programare cabinet medical (client, medic, programare)  
4) gestiune stocuri magazin (categorii, produse, distribuitori)  
5) aplicatie bancara (conturi,extras de cont, tranzactii, carduri, servicii)  
6) platfora e-learning(cursuri, utilizatori, cursanti, quizuri)  
7) sistem licitatii (licitatii, bids, produse, utilizatori)  
8) platforma food delivery(localuri, comenzi, soferi, useri)  
9) platforma imprumuturi carti - tip bookster (companii afiliate, utilizatori, carti)  
10) platforma e-ticketing (evenimente, locatii, clienti)  

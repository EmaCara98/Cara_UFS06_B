# TRACCIA B - indirizzo IP: 172.16.151.18
## Versione TCP - Run main: TCP_Server.java
Da Windows Powershell tramite nc/telnet
- Digitare il comando: red
- Digitare il comando: white
- Digitare il comando: sorted_by_name
- Digitare il comando: sorted_by_price
- Digitare caratteri casuali, deve mostrare "Comando inesistente"
- Run TCP_Client.java e testare il Client Grafico

## Versione HTTP - Run main: HTTP_Server.java
POST:
Da Windows Powershell (Se il comando curl dà errore, digitare il comando: "Remove-item alias:curl" e poi riprovare)
- curl -X POST "http://{ip}:{porta}" -d "red" 
- curl -X POST "http://{ip}:{porta}" -d "white" 
- curl -X POST "http://{ip}:{porta}" -d "sorted_by_name"
- curl -X POST "http://{ip}:{porta}" -d "sorted_by_price"
- curl -X POST "http://{ip}:{porta}" -d "saasadsdsa" -->deve mostrare messaggio di errore.

GET:
Da browser
- http://172.16.151.18:8000/?red
- http://172.16.151.18:8000/?white
- http://172.16.151.18:8000/?sorted_by_name
- http://172.16.151.18:8000/?sorted_by_price
- http://172.16.151.18:8000/?saadsadsa --> deve mostrare il messaggio "Comando insesistente"
- http://172.16.151.18:8000/sasaa --> deve mostrare il messaggio "Error 404: Pagina non trovata"

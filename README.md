# TRACCIA B - mio IP: 172.16.151.18
## Versione TCP - Run main: TCP_Server.java
Da Windows Powershell tramite nc/telnet
- Digitare il comando: red
- Digitare il comando: white
- Digitare il comando: sorted_by_name
- Digitare il comando: sorted_by_price
- Digitare caratteri casuali, deve mostrare "Comando inesistente"

## Versione HTTP - Run main: HTTP_Server.java

POST:
Da Windows Powershell
- Digitare il comando: curl -X POST "http://{ip}:{porta}" -d "red" (Se il comando ha dato errore, digitare il comando: "Remove-item alias:curl" e poi riprovare)
- Ripetere il comando con "white
- Ripetere il comando con "sorted_by_name"
- Ripetere il comando con "sorted_by_price"
- Ripetere il comando con caratteri casuali, deve mostrare messaggio di errore.

GET:
Da browser
- Inserire nell'url: http://{ip}:{porta}/?red
- Inserire nell'url: http://{ip}:{porta}/?white
- Inserire nell'url: http://{ip}:{porta}/?sorted_by_name
- Inserire nell'url: http://{ip}:{porta}/?sorted_by_price
- Inserire nell'url: http://{ip}:{porta}/?letterecasuali, deve mostrare il messaggio "Comando insesistente"
- Inserire nell'url: http://{ip}:{porta}/letterecasuali, deve mostrare il messaggio "Error 404: Pagina non trovata"

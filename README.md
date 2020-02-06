# XML tim 6, backend projekat

* SW16/2016 Milan Milovanović
* SW52/2016 Nemanja Janković
* SW69/2016 Mihailo Đokić

## Video: 
* [https://drive.google.com/file/d/1S31Ih4sMzI5h-A0ppReTjPkZDNIUHMCD/view](https://drive.google.com/file/d/1S31Ih4sMzI5h-A0ppReTjPkZDNIUHMCD/view)
* [https://uploadfiles.io/aqxgrhd3](https://uploadfiles.io/aqxgrhd3) (mirror)

## Pokretanje backend-a

* ### Pokretanje java aplikacije
  * Skinuti repozitorijum i pozicionirati se unutar njega
  * Pokrenuti fajl `\src\main\java\team6\xml_project\XMLProjectApplication.java` koristeći JDK8
  * Proveriti da li je aplikacije pokrenuta odlaskom na [Swagger](http://localhost:8043/swagger-ui.html)
  * Ako se aplikacije pokreće prvi put, unutar `\src\main\resources\application.properties` fajla treba da stoji `create`, u suprotnom `update`
  
* ### Skinuti Exist bazu podataka sa [Exist 5.2.0](https://bintray.com/existdb/releases/download_file?file_path=exist-distribution-5.2.0-win.zip)
  * Otpakovati je i pozicionirati unutar njenog foldera
  * Pokrenuti je putem `.\bin\startup.bat` fajl-a
  * Proveriti da li je aplikacije pokrenuta odlaskom na [Exist](http://localhost:8080/exist/apps/eXide/)
  
* ### Skinuti Apache Jena Fuseki bazu podataka sa [Apache Jena 3.14.0](https://www-eu.apache.org/dist/jena/binaries/apache-jena-3.14.0.zip)
  * Otpakovati je i pozicionirati se unutar njenog foldera
  * Prateći uputstvo sa [Stackoverflow](https://stackoverflow.com/questions/18415578/how-to-change-tomcat-port-number) promeniti port aplikacije sa `8080` na `8081`
  * Pokrenuti je putem `.\bin\startup.bat` fajl-a
  * Proveriti da li je aplikacije pokrenuta odlaskom na [Apache Jena Fuseki](http://localhost:8081/fuseki/index.html)
  * Kreirati novi dataset `FTNProject` sa `Persistent (TDB2)` opcijom 
  * Izmene nad konfiguracijom za konekcije se vrše promenom `src\main\java\team6\xml_project\util\RDFEndpoints.java` fajla
  
* ### Skinuti i instalirati PostgreSQL 10 bazu podataka sa [PostgreSQL](https://www.postgresql.org/)
  * Pokrenuti `pgAdmin` aplikaciju i kreirati `xmlTim6DB` bazu podataka
  * Zameniti vrednosti linija `spring.datasource.username=postgres` i `spring.datasource.password=root` unutar `\src\main\resources\application.properties` fajla sa svojim login podacima
  
## Osnovni login podaci
* Korisnici
  * tim6.xml+u1@gmail.com - password
  * tim6.xml+u2@gmail.com - password
  * tim6.xml+u3@gmail.com - password
  * tim6.xml+u4@gmail.com - password
* Editori
  * tim6.xml+e1@gmail.com - password
  * tim6.xml+e2@gmail.com - password

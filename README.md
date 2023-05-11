# Java Spring Boot Rest Api Projesi
Java Spring Boot, JPA kullanılarak ve PostgreSQL veritabanı kullanılarak Ülke tablosuyla ilgili CRUD işlemlerini sağlayan bir rest api projesidir.
Bu proje EntityLayer, DataAccessLayer, BusinessLayer, DTO ve RestApi katmanları ile kurumsal mimaride oluşturulmuştur.
Dependency Injection kullanılarak sınıflar arasında bağımlılık azaltılmıştır. Ve Projede MapStruct dependency'si kullanılarak
DTO- Entity eşleşmesi sağlanmıştır.

Projede CountryApi veritabanı Country tablosu içermektedir.

Country Tablosu ise 
id, name, president kolonlarını içermektedir.

Proje ülke kaydeden, tüm ülkeleri getiren, Id'ye göre ülke getiren, id'ye göre ülke silen ve ülke başkanını güncelleyen rest api'ler içermektedir.

Aşağıdaki ekran görüntüsünde postman rest api sonuçları verilmiştir.

## Tüm Ülkeleri Getirme Rest Api

![image](https://github.com/Akbank-Patika-dev-Java-Spring-Bootcamp/homework-1-iremsamur/assets/76771500/7046d1ee-18c6-4b62-ab4e-05505c686419)

## ID'ye Göre Ülke Getirme Rest Api

![image](https://github.com/Akbank-Patika-dev-Java-Spring-Bootcamp/homework-1-iremsamur/assets/76771500/146682b2-bb50-4c62-a8d5-1a1e712e3d92)

## Ülke Kaydetme

![image](https://github.com/Akbank-Patika-dev-Java-Spring-Bootcamp/homework-1-iremsamur/assets/76771500/ed3a080c-07aa-42c3-9f6a-0998ba8c979b)

## Ülke Başkanı Güncelleme

![image](https://github.com/Akbank-Patika-dev-Java-Spring-Bootcamp/homework-1-iremsamur/assets/76771500/093c1dbb-6d0b-4d3d-a7ac-8c50a4c7d2a2)

## Ülke Silme

![image](https://github.com/Akbank-Patika-dev-Java-Spring-Bootcamp/homework-1-iremsamur/assets/76771500/9defb53c-bd29-485c-b420-13882f1e1a26)



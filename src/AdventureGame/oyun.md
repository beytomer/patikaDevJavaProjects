# Macera Oyunu

#### java ile metin tabanlı macera oyunu

###### KARAKTERLER
![](../../../../Desktop/patika Java 102/12-OYUN/Karakterler.png)


###### CANAVARLAR
![](../../../../Desktop/patika Java 102/12-OYUN/Canavarlar.png)


###### SILAHLAR
![](../../../../Desktop/patika Java 102/12-OYUN/Silahlar.png)



###### ZIRH
![](../../../../Desktop/patika Java 102/12-OYUN/Zırhlar.png)

### _MEKANLAR_


Güvenli Ev


Özellik : Can Yenileniyor


### _Mağara_


Canavar : Zombi (1-3 Adet)


Özellik : Savaş + Ganimet


Eşya : Yemek (Food)


### _Orman_


Canavar : Vampir (1-3 Adet)


Özellik : Savaş + Ganimet


Eşya : Odun (Firewood)


### _Nehir_


Canavar : Ayı (1-3 Adet)


Özellik : Savaş + Ganimet


Eşya : Su (Water)
### _Maden_


Canavar : Yılan (1-5 Adet)


Özellik : Savaş + Ganimet




### _Mağaza_

Özellik : Destekleyici Eşyalar Satın Almak


Silah : Tabanca,Kılıç,Tüfek


Zırh : Hafif,Orta,Ağır




###### UML
![](../../../../Desktop/patika Java 102/12-OYUN/oyun class-diagram.jpg)

# _OYUN ANLATIMI_

oyun aslında 2 ana sınıf sutune kruruludur : Player , Location

                        GAME
                        /   \
                Player      Location

oyun baslatılır 
player ın envanter , zarar , sağlık , para ve ismi vardır

player oyuna baslarken bir karakter secer karakterler için ayrı bir sınıf olustur(uml ye de bunu ekel)

karakterlerinde kendilerine özel , id ,  isim ,  zarar , saglık ve parası vardır

secilen karakterın bu ozellik değerleri playera atanır

player baslangıc envanterleri : su , yiyecek , odun , silah tipi , zırh tipi vardır




location un bir ismi ve loasyonda  bir player vardır.
hangi lokasyonda oldugunun bilinmesi gereklidirki 
o mekanda ne yaptıgımı bilelim bunun için onLocation metodu kulan
lokasyon sınıfından nesne uretilmemeli
(abstract sınıf onlocation abstract olmalı her locasyon 
kendıne gore overiride etmeli)

lokasyonlar savasılacak mekanlar ve guvenlı mekanlar olarak 2 cınıf altında topladık
bu savas ve normal mekan adında iki class
bunlardanda nesne uretilemez
bu lokasyonlar içlerinde ev,magaza,nehir,orman,mağara 
mekanları var

ilk once guvenli mod 
magaza silah ve zırhlara sahiptir

silah : isim ,id , hasar , fiyatı vardır

zırh : isim , id , bloklama , fıyatı vardır

savas snıfında savasma gerseklesecek
savas lokasyonlarının hepsinde cesitli tipte ve sayıda canavarlar olmak zorunda olacak
bu canvarların kendılerının ozel değerleir vardır 
                

normal lokasyonlar guvenlı lokasyonlar ev ve magazadır
magazada alısveriş işlemleri olacaks

























 
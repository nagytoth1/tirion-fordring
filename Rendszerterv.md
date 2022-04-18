# Rendszerterv

## A rendszer célja
Kiépített szoftveres rendszerünk célja abban áll, hogy játékosoknak és ezen tudományos irányban érdeklődő magánszemélyeknek bemutassuk a 
Warcraft típusú stratégiai játékokban rejlő lehetőségeket, az ebben rejlő potenciálokat, és ezáltal utat nyissunk a videójátékok iránt érdeklődők számára.
Rendszer célja, hogy minél több számítógépes felületen kiváló élményt nyújtson a játékos számára. 

## Projektterv
Résztvevők és főbb szerepköreik:
	1. Nagy-Tóth Bence:
	2. Sipos Levente: 


## Követelmények

Funkcionális követelmények: 
	- Frakció kiválasztás (Orc/Human)
	- Alap nyersanyagok (30 fa, 30 arany, 30 kő)
	- Vásárli funkció (peon/grunt/warrior/lovas)
	- Nyersanyagok termelése (munkások/peon-on keresztül)
	- Nyersanyag nyilvántartása (fa,arany,kő)
	
Input mezők megfelelő működése
Nem funkcionális követelmények: 
	- Felhasználóbarát, transzparens, könnyen értelmezhető felület
Törvényi előírások, szabványok: 
	- GDPR-nak való megfelelés - Általános információk - Szellemi tulajdon - Használat - Felelősségi szabályok - Technikai követelmények - Garancia és kártérítés - 2013. évi V. törvény - Európai Parlament és Tanács 2016. április 27-i (EU) 2016/679 Rendelete -2011. évi CXII. törvény - a szerzői jogról szóló 1999. évi LXXVI. törvény - 2001. évi CVIII. törvény
	- Ezek egy részét, a teljesség igénye nélkül, a követelmény- és funkcionális specifikáció erre vonatkozó soraiban fel is tüntettük.
	- A törvény nem megfelelő ismerete nem mentesít a felelõsségre vonás alól.

## Architekturális terv



## Implementációs terv

A terv a Java megfelelő használatát/ismeretét írja elő, mivel könnyen használható. 
Az alkalmazás felhasználói oldalát letöltött, állandóan futtatható Windowsos alkalmazást tervezzük.

## Funkcionális terv
Rendszerszereplők: Rendszergazdai és felhasználói jogosultsággal rendelkezők
Rendszerhasználati esetek és lefutásaik:




## Fizikai környezet

- Az alkalmazás Windows operációs rendszerre készült.
- Nincsenek megvásárolt komponenseink
- Nincsenek alkalmazáson belüli mikrotranzakciók
- Használt alkalmazások és Fejlesztői környezetek:
- (Frontend) -> JavaSwing
- (Backend) -> Java + SQLite


## Absztrakt domain modell

A rendszert a felhasználó egy Windowsos asztali alkalmazáson keresztül érheti majd el, aminek az elkészítését Java nyelven tervezzük. A felület lehetővé
teszi a tetszőleges frakció kiválasztását. A felhasználó az összes beépített funkcíót tudja majd használni a megfelelő korlátok között.
Amennyiben a játékos elszeretné kezdeni a játékot a Townhallból indulva tudja elkezdeni a Peonok/munkások és az épületek gyártását illeve építését.


## Teszt terv

A tesztelések célja a rendszer és komponensei funkcionalitásának teljes vizsgálata, ellenőrzése, a rendszer által megvalósított üzleti szolgáltatások verifikálása.

Tesztelési eljárások

Unit teszt: 

Beta teszt: 


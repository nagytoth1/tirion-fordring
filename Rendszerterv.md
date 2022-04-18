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

	#### Funkcionális követelmények: 
		- Frakció kiválasztás (Orc/Human)
		- Alap nyersanyagok beállítása (30 fa, 30 arany, 30 kő)
		- Vásárlás funkció (egységek / épületek a meglévő nyersanyag függvényében)
		- Nyersanyagok termelése (munkások/peon-on keresztül)
		- Nyersanyag nyilvántartása (fa,arany,kő)
	
	#### Nem funkcionális követelmények: 
		- Felhasználóbarát, transzparens, könnyen értelmezhető felület
		- Tetszőlegesen kibővíthető újabb egységekkel, újabb típusú épületekkel (patch-elhető)
		- Hibatűrés: pl. vizsgálja a vásárlás tranzakciója előtt, hogy a rendelkezésre álló nyersanyag megvan-e
		- A kód egy része legyen újrahasznosítható, ne fussuk ugyanazokat a köröket a fejlesztés során.
		- A grafikus felület legyen kompatibilis az elterjedtebb felbontási szabványokkal (800x600, 1024x768, 1280x1024, 1900x1080)
		- Telepítése legyen a játékosok számára egyszerű
		- Lehetőleg ne kerüljön sor számos kis fejlesztésre, legyenek inkább kevesebb számú, de nagyobb horderejű patch-ek.
	
### Törvényi előírások, szabványok: 
	- GDPR-nak való megfelelés - Általános információk - Szellemi tulajdon - Használat - Felelősségi szabályok - Technikai követelmények - Garancia és kártérítés - 2013. évi V. törvény - Európai Parlament és Tanács 2016. április 27-i (EU) 2016/679 Rendelete -2011. évi CXII. törvény - a szerzői jogról szóló 1999. évi LXXVI. törvény - 2001. évi CVIII. törvény
	- A törvény nem megfelelő ismerete nem mentesít a felelõsségre vonás alól.

	**Kivonat: 18/2018. (V. 31.) utasítás az Informatikai Biztonsági Szabályzatról**
		<p>	*171.* 	Az operációs rendszer, az alkalmazás és a hálózati aktív eszköz szoftver verzióját, valamint biztonsági patch szintjét tesztelést követően lehetőség szerint a gyártói támogatással rendelkező, legmagasabb szintre kell hozni.(…) </p>
		<p>	*177.* 	Meglévő rendszer esetén a biztonságot közvetlenül veszélyeztető hibákat a lehető leghamarabb javítani kell, vagy korrektív kontroll alkalmazásával csökkenteni a kockázatokat. Új rendszer esetén feltárt sérülékenységet a használatbavételig javítani kell. </p>
		<p>	*178.* 	A hálózatok ki- és bemeneteli pontjait minimalizálni kell, továbbá a ki- és bemeneti pontok adatforgalmát elektronikusan naplózni, és a naplófájlokat ellenőrizni kell.</p>
		<p>	*179.* 	Az informatikai üzemeltetésért felelős vezetőnek a rendszer minden arra alkalmas – megfelelő hardver- és szoftverkörnyezettel rendelkező – elemére jóváhagyott, központilag rendszeresített vírusellenőrző szoftvert kell telepítenie és naprakészen tartania.(…)</p>
		<p>	*183.* 	A biztonsági mentés célja az információ és az adatfeldolgozó szoftverek épségének és rendelkezésre állásának biztosítása. A hatékony biztonsági adatmentés érdekében a munkaállomásokon feldolgozott adatállományokat tárolni kizárólag szervereken és központi kiszolgálókon, valamint az adatmentésre szolgáló médián lehet. Bármilyen más helyen történő adattárolás még átmenetileg is tilos.(…)</p>
		<p>	*200.* 	Tilos a hálózat biztonságos működését zavaró vagy veszélyeztető információk, programok terjesztése. (…)</p>
		<p>	*208.* 	A rendszert és a hálózatot túlterheléses – szolgáltatás megtagadás jellegű – támadásokkal szembeni védelemmel kell ellátni.(…)</p>
		<p>	*222.* 	A fejlesztés során a biztonságos programozás irányelveit kell követni. A szoftverfejlesztés során a szoftver funkcionalitása mellett fokozott figyelmet kell fordítani a rendszer és a kapcsolódó rendszerek biztonsági követelményeinek betartására is.</p>
		<p>	*forrás: NJT* </p>

	**Kivonat az 1999. évi LXXVI. szerzői jogi törvényből:**
		<p>*1.§* 	(2) Szerzői jogi védelem alá tartozik – függetlenül attól, hogy e törvény megnevezi-e – 
					az irodalom, a tudomány és a művészet minden alkotása. Ilyen alkotásnak minősül különösen: (...)</p>
				<p>&emsp; &emsp;c) a *számítógépi programalkotás és a hozzá tartozó dokumentáció (a továbbiakban: szoftver) akár forráskódban, akár tárgykódban vagy bármilyen más formában* rögzített minden fajtája, ideértve a felhasználói programot és az operációs rendszert is.(...)</p>
				<p>&emsp;(3) A szerzői jogi védelem az alkotást a szerző szellemi tevékenységéből fakadó egyéni, eredeti jellege alapján illeti meg. A védelem nem függ mennyiségi, minőségi, esztétikai jellemzőktől vagy az alkotás színvonalára vonatkozó értékítélettől. (...)</p>
		<p>*4.$* (1) A szerzői jog *azt illeti, aki a művet megalkotta* (szerző). </p>
				<p>&emsp;(2) *Szerzői jogi védelem* alatt áll – az eredeti mű szerzőjét megillető jogok sérelme nélkül – más szerző művének átdolgozása, feldolgozása vagy fordítása is, ha annak egyéni, eredeti jellege van.(...)</p>
		<p>*5.§* (1) Több szerző közös művére, ha annak részei nem használhatók fel önállóan, a szerzői jog együttesen és – kétség esetén – egyenlő arányban illeti meg a szerzőtársakat; a szerzői jog megsértése ellen azonban bármelyik szerzőtárs önállóan is felléphet. (...)</p>
		<p>*13.§* A szerző személyhez fűződő jogát sérti művének a becsületére vagy jóhírnevére sérelmes mindenfajta eltorzítása, megcsonkítása, megváltoztatása és a művel kapcsolatos más ilyen jellegű visszaélés.(...)</p>
		<p>*42.§* (1) Felhasználási szerződés alapján a szerző engedélyt ad művének a felhasználására, a felhasználó pedig köteles ennek fejében díjat fizetni. (...)</p>
		<p>*59.§* (1) Eltérő megállapodás hiányában a szerző kizárólagos joga nem terjed ki a többszörözésre, az átdolgozásra, a feldolgozásra, a fordításra, a szoftver bármely más módosítására – ideértve a hiba kijavítását is –, valamint ezek eredményének többszörözésére annyiban, amennyiben e felhasználási cselekményeket a szoftvert jogszerűen megszerző személy a szoftver rendeltetésével összhangban végzi.</p>
				<p>&emsp;(2) A felhasználási szerződésben sem zárható ki, hogy a felhasználó egy biztonsági másolatot készíthessen a szoftverről, ha az a felhasználáshoz szükséges.</p>
				<p>&emsp;(3) Aki a szoftver valamely példányának felhasználására jogosult, a szerző engedélye nélkül is megfigyelheti és tanulmányozhatja a szoftver működését, továbbá kipróbálhatja a szoftvert annak betáplálása, képernyőn való megjelenítése, futtatása, továbbítása vagy tárolása során abból a célból, hogy a szoftver valamely elemének alapjául szolgáló elgondolást vagy elvet megismerje.</p>
		<p>(Forrás: NJT)</p>

### Általános Információk

Az Alkalmazásnak a használatát és a hozzáférését megelőzi az alkalmazandó jogszabályok és a jelen Felhasználási Feltételek
és Adatkezelési tájékoztatóknak az elolvasása és értelmezése. Amennyiben az alkalmazást letöltők vagy használók (a későbbiekben: a Felhasználók)
elfogadják és teljesítik az imént említett Felhasználási Feltételeket abban az esetben az alkalmazás használata engedélyezett. Amennyiben ezen
Adatkezelési Tájékoztatót és a Felhasználói Feltételek nem fogadják el, abban az esetben a Felhasználó nem jogosult arra hogy az alkalmazást használhassa.

A jelenlegi Felhasználási Feltételekre a magyar jog az irányadó, tekintet nélkül a nemzetközi magánjog előírásaira. Az Alkalmazás Felhasználói
kifejezetten hozzájárulnak ahhoz, hogy a jogvitákra a magyar hatóságoknak és bíróságoknak legyen kizárólags joghatóságuk a magyar jog alapján.

### Szellemi tulajdon

Az Alkalmazás és valamennyi kapcsolódó védjegy, szerzői jogi alkotás és egyéb - akár bejegyzett, akár be nem jegyzett - szellemi tulajdon
(a továbbiakban együttesen: Szellemi Tulajdon) tulajdonosa az EKE és/vagy EKE Szolgáltató, valamint az alkalmazáshoz kedvezményt nyújtó
partnerek. A Felhasználók az Alkalmazást a Szellemi Tulajdon maximális tiszteletben tartásával jogosultak használni. 

A Szellemi Tulajdon kiterjed különösen, de nem kizárólagosan valamennyi szoftverre, logóra, márkajelre, márkanévre, fényképre, szövegre, grafikára, adatbázisra.
A Szellemi Tulajdonnak tilos bárminemű megsértése, bitorlása, másolása, átdolgozása és tilos azt bármilyen egyéb módon megsérteni,
azt jogosulatlanul felhasználni, továbbadni, megterhelni, azzal bármilyen módon rendelkezni, visszaélni. 

Ezen szabályok megsértése az Alkalmazás használati lehetőségeinek azonnali hatályú megszüntetése mellett a megfelelő jogi lépések megtételét
– beleértve esetleges büntetőjogi lépések megtételét is – vonja maga után a Felhasználóval, más jogsértő személlyel szemben a Tulajdonos és/vagy a 
Szellemi Tulajdon egyéb jogosultjai által.


## Architekturális terv



## Implementációs terv
	#TODO: Tervezési minták meghatározása

## Funkcionális terv
Rendszerszereplők: Rendszergazdai és felhasználói jogosultsággal rendelkezők
Rendszerhasználati esetek és lefutásaik:

## Fizikai környezet

	- Az alkalmazás Windows operációs rendszerre készült.
	- Nincsenek megvásárolt komponenseink
	- Nincsenek alkalmazáson belüli mikrotranzakciók
	- Használt alkalmazások és Fejlesztői környezetek:
	- (Frontend) -> Java Swing
	- (Backend) -> Java + SQLite


## Absztrakt domain modell

A rendszert a felhasználó egy Windowsos asztali alkalmazáson keresztül érheti majd el, aminek az elkészítését Java nyelven tervezzük. A felület lehetővé
teszi a tetszőleges frakció kiválasztását. A felhasználó az összes beépített funkciót tudja majd használni a megfelelő korlátok között.
Amennyiben a játékos elszeretné kezdeni a játékot a Townhallból indulva tudja elkezdeni a Peonok/munkások és az épületek gyártását illeve építését.


## Teszt terv

A tesztelések célja a rendszer és komponensei funkcionalitásának teljes vizsgálata, ellenőrzése, a rendszer által megvalósított üzleti szolgáltatások verifikálása.

Tesztelési eljárások

Unit tesztek kiterjednek: 



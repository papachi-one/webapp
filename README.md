# Automatizácia kontroly vodného a stočného
## Dátové entity
### Adresa
- Ulica
- Popisné číslo
- Súpisné číslo
- Mesto
- PSČ
### Fyzická osoba
- Meno
- Priezvisko
- Titul
- Trvalý pobyt
	- Adresa
- Rodné číslo
- Email
- Telefónne číslo
### Právnická osoba
- Názov spoločnosti
- IČO
- Adresa
- Kontaktná osoba
	- Fyzická osoba
### Majiteľ
- Majiteľ
	- Fyzická osoba
	- Právnická osoba
- List vlastníctva
### Odberové miesto
- Evidenčné číslo
- Adresa
- TOM
- Názov
- Zmluvný počet odberateľov/pracovníkov
- Stočné z iného zdroja
- Úhrn
- Príznaky
	- Vodné
	- Stočné
	- Zrážky
- Plocha
	- A
	- B
	- C
- Predchádzajúce obdobia
	- Rok
	- Vodné
	- Stočné
- Príznak Paušál
### Evidenčný list napojenosti odberateľa
- Číslo odberu
- Dátum
- Overenie vykonal
	- Zamestnanec
- Odberové miesto
- Napojenie na verejný vodovod
	- Nehnuteľnosť napojená na verejný vodovod (Príznak)
	- Vodomer – v šachte*, v  nehnuteľnosti* (Príznak)
	- Vlastný zdroj vody – s  vodomerom*, bez vodomeru* (Príznak)
- Napojenie na verejnú kanalizáciu a  zrážkové vody
	- Nehnuteľnosť napojená na verejnú kanalizáciu (Príznak)
	- Zrážkové vody zvedené do dažďovej kanalizácie (Príznak)
	- Vlastný septik*, vlastná ČOV* (Príznak)
	- Možnosť dopojenia na VK (Príznak)
- Vykonané stavebné  úpravy na odkanalizovaných plochách
	- Vykonané stavebné  úpravy na odkanalizovaných plochách za obdobie predchádzajúcich 2 rokov (Príznak)
- Voda z  povrchového odtoku odvedená do VK priamo kanalizačnou prípojkou alebo voľným povrchovým odtokom následne cez dažďové  výuste do VK
	- Kategória A  – zastavané plochy a  málo priepustné spevnené plochy (strechy, betónové asfaltové povrchy, a  pod. ) (m^2)
	- Kategória B  – čiastočne priepustné plochy (dlažby s  vyspárovaným pieskom, štrkom a  pod. ) (m^2)
	- Kategória C  – dobre priepustné plochy pokryté vegetáciou (trávniky, záhrady a  pod. ) (m^2)
- Poznámka
## Web stránky
- Zoznamy
	- Tabuľka
		- Zoraďovanie riadkov podľa hodnôt v stĺpci (vzostupne/zozustupne)
		- Zobraziť/skryť stĺpce
		- Poradie stĺpcov
		- Akcie na danom riadku (napr. editácia, zmazanie, ...)
		- Označovanie riadkov
			- Akcie nad 1 a viac riadkami (napr. zmazanie, ...)
	- Stránkovanie zoznamov
	- Vyhľadávanie/filtrovanie riadkov v tabuľke
		- Dátum - od, do, rozsah
		- Text - začína, končí, obsahuje, alebo presná hodnota (prípadná negácia operácie t.j. obsahuje/neobsahuje, ...)
		- Číslo - vačšie, menšie, rovné a ich kombinácie
- Formuláre
	- Povinné/voliteľné polia
	- Validácia hodnôt
	- Automatické dopĺňanie hodnôt (z existujúcich dátových entít)
### Zoznamy
- Zoznam Odberových miest
- Zoznam Evidenčných listov napojenosti odberateľov
- Zoznam Fyzických/Právnických osôb
	- Meno/názov
	- RČ/IČO
	- Adresa
	- Telefónne číslo
	- Email
- Zoznam zamestnancov
	- Meno
	- Priezvisko
	- Rola
	- Telefónne číslo
	- Email
### Formuláre
- Formulár pre Odberové miesto
- Formulár pre Fyzickú osobu
- Formulár pre Právnickú osobu
- Formulár pre Adresu
- Formulár pre Majiteľa
- Formulár pre Evidenčný list napojenosti odberateľa
### Vyhľadávanie/filtrovanie
- Formulár pre vyhľadávanie/filtrovanie Odberových miest
- Formulár pre vyhľadávanie/filtrovanie Fyzických osôb
- Formulár pre vyhľadávanie/filtrovanie Právnických osôb
- Formulár pre vyhľadávanie/filtrovanie Fyzických/právnických osôb
- Formulár pre vyhľadávanie/filtrovanie Majiteľov
- Formulár pre vyhľadávanie/filtrovanie Adries
- Formulár pre vyhľadávanie/filtrovanie Evidenčných listov napojenosti odberateľa
- Formulár pre vyhľadávanie/filtrovanie Zamestnancov
### Import/Export
- Import (CSV, Excel - poradie stĺpcov a ich mapovanie na dátové entity)
- Export (CSV, Excel - voliteľnosť a poradie stĺpcov s možnosťou filtrovanie výsledkov ako pri zoznamoch)

## Implementácia
Popis práce|Odhad (h)
-|-
Dátový model (backend, databáza, verziovanie)|8
Vytvorenie návrhu webovej stránky|12
Zabezpečenie webovej aplikácie (HTTP Auth Basic, používateľské role)|8
UI komponent - Zoznam|8
Zoznam odberových miest|4
Zoznam evidenčných listov napojenosti odberateľov|4
Zoznam fyzických/právnických osôb|2
Zoznam zamestnancov|2
Formulár pre Odberové miesto|8
Formulár pre Fyzickú osobu|4
Formulár pre Právnickú osobu|4
Formulár pre Adresu|2
Formulár pre Majiteľa|2
Formulár pre Evidenčný list napojenosti odberateľa|8
Formulár pre vyhľadávanie/filtrovanie Odberových miest|6
Formulár pre vyhľadávanie/filtrovanie Fyzických osôb|4
Formulár pre vyhľadávanie/filtrovanie Právnických osôb|4
Formulár pre vyhľadávanie/filtrovanie Fyzických/právnických osôb|4
Formulár pre vyhľadávanie/filtrovanie Majiteľov|4
Formulár pre vyhľadávanie/filtrovanie Adries|4
Formulár pre vyhľadávanie/filtrovanie Evidenčných listov napojenosti odberateľa|4
Formulár pre vyhľadávanie/filtrovanie Zamestnancov|2
Import dát|16
Export dát|16
Nasadenie informačného systému do Cloudu|16
Vyhľadanie OM na katastri|16
Vygenerovanie a uloženie PDF z katastra pre OM|24
Spolu|200

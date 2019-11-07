# Éttermi rendszer
Lehetőséget nyújt egy étterem ételei közüli böngészésre, információ szerzésre, valamint rendelésére.

## Funcionális követelmények
- Ételek listázása
- Étel keresése
- Új étel hozzáadása
- Meglévő étel módosítása/törlése
- Étel rendelése

#### Vendégek funkciói
- Ételek közötti keresés
- Kiválasztott étel információinak lekérése
- Étel rendelési lehetőség

#### Fő pincér funkciói
- Meglévő étel módosítása/törlése (a leírás módosítása is bele tartozik)
- Új étel hozzáadásának kérvényezése
- Meglévő rendelés módosítása/törlése

#### Étterem vezető funkciói
- Étel hozzáadása a listához
- Étel kérvények elbírálása
- Felhasználó jogosultságok módosítása

## Nem funkcionális követelmények
- Igényes felület
- Jelszavas azonosítás, kódolt jelszó tárolása

## Szakterületi fogalomjegyzék
- Fő pincér: A pincérek főnöke, ő felügyel/tanítja a pincéreket.

## Szerepkörök
- Vendég: Az étterem ételei közül válogathat, információt szerezhet, valamint ételt rendelhet.
- Fő pincér: Az oldalon lévő ételek információ tartalmáért felelős.
- Étterem vezető: Az egész étterem felügyelője, az alkalmazottakat felügyeli.
-----
## Szekvenciadiagram az ételekhez
![szekvencia](http://www.kepfeltoltes.eu/images/2019/11/07/687diagram.png)

## Táblák kapcsolati UML diagramja
![UML](http://www.kepfeltoltes.eu/images/2019/11/07/168uml.png)
 ------ 
 ### Alkalmazott könyvtárstruktúra bemutatása
 
A projektben a hu.elte.hu könvtárban találhatóak meg az alap könyvrátak

    - controller 
         - FoodController
         - IngredientController
         - OrderController
         - UserController
         
A kontrollerek leírják a http requestekre történő válaszokat és egy endpoint hívásakor adott requestrekre a válasz adják vissza
            
    - model
        - Food
        - Ingredient
        - Order
        - User
        
Modell leírja a táblák kinézetét (milyen oszlopokból áll, és azoknak milyen típusaik vannak, továbbá, hogyan kapcsolódnak egymáshoz)

    - resporitory
        - FoodRepository
        - IngredientRepository
        - OrderRepository
        - UserRepository
        
A Repositoryk leírják, hogy a modelleknek milyen tulajdonságaik vannak,, lényegében, hogy milyen lekérdezéseket végezhetünk a táblákon(modelleken)

    - security
        - AuthenticatedUser
        - CustomBasicAuthenticationEntryPoint
        - MyUserDetailsService
        - WebSecurityConfig
Authentikálja a usert, a neki megfelelő jogosultságot adva. Megjegyzi automatikusan a tokent, amelyel nem kell mindig bejelentkeznünk, csak akkor ha ujraindítuk a projektet vagy a böngészőt
### Fejleszői környezet bemutatása, beállítása használt technológiák
A projektben spring boot technológiát használunk.

    

# Programmation orientée Objet
>Notes de cours

[...]

## Concepts Objets
 
[...]

### Extension

#### Héritage

*SuperClasse* -> SousClasse (Hérite des attributs)

#### Redéfinition et surcharge

*Redéfinition* : Classe hérite d'une méthode mais on change son action (`@Override`).

*Surcharge* : Plusieurs fois la même méthode avec paramètres différents.

#### Classe abstraite et interface

Une **classe abstraite** , n'est pas instaciable, elle sert uniquement à définir un super-type qui pourra être refédini.

Mot-Clef : `abstract`

Une **méthode abstraite** est aussi sans implémentation.

```java
abstract class ClassAbstraite {
    public int methode() {
        return 42;
    }
    public abstract String methodeAbstraite(int a);
}
```

Une **interface** est un ensemble de signatures de méthodes, elle n'a pas d'implémentation. Elle définie un *type*. Une classe peut implémenter plusieurs interfaces, elle fournit une **implémentation** aux méthodes de l'interface.

Une interface est équivalent à une classe "purement" abstraite.
Mots-clés : `interface, implements`

Convention de nommage :
- Bof : I*
- Bien : *able

```java
interface Fooable {
    String foo(int a);
}

class MyFoo implements Fooable {
    public String foo(final int a) {
        return "foo : " + a;
    }
}
/*...*/
```

Séparation interface / implémentation, dépendance sur interface => Découplage
Interfaces minimales -> sous-typages structurelS

```java
interface Iterable{/* */}

class MyList implements Iterable {/* */}

class Client {
    private Iterable elements;
    /* */
}
```

#### Délégation

* Réutilisation
* Sans sous-typage
* Sorte d'alternative à l'héritage

Principe : Préférer la composition à l'héritage
- Hierarchie des types : interfaces
- implémentations : finales
- réutilisation : composition / délégation

La redéfinition peut-être très complexe : e.g. `equals` ou `compareTo`
=> Commutatif, transitif

- Couplage fort
- Composition plus flexible
    + sélective
    + dynamique
    + délégation multiple
- Gestion "manuelle" (selon le langage)
=> simule l'héritage

*Méta-programmation* -> automatique (et plus propre)

### Types génériques

type-générique, type paramétré, generics ...

Définition : Structure (classe), méthode. Type des éléments inconnu à la définition. Paramétré. Défini (instanctiation, sous-typage) 

Exemple : Collections, clase comparable

#### Collections

```java
import java.util.*;
```

##### Itérateur

interfaces `Iterable<T>` et `Iterator<E>`


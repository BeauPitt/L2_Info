# Notes cours technologies du WEB

## HTML

### Langage

#### SGML

```html
<a href="bar.html">lien</a>
```

* élément : fermant optionnel, vide
* contenu
* attribut
    + booléen
    + valeur
    
Entités :

* Caractères "spéciaux" (cf. encodage)
* `< : &lt; & : &amp;`
* Caractères unicodes : `&#8594`

Analyse complexe : grammaire

#### XML

* Dérivé de SGML, plus rigide
* eXtensible Markup Language
* extensions
    - espaces de nom
    - P.I.
* Syntaxe plus stricte
* Encodage unicode

=> Grammaire non nécessaire 

Un document **bien formé** respecte la syntaxe concrète, on peut l'analyser.

mauvais :
```xml
<a>foo <b> bar </a> baz </b>
```

Un document **valide** respecte la grammaire, on peut le comprendre.

en HTML pas de `<p>` dans un `<em>`.

Pourquoi est-ce important d'avoir un doc valide ?

* compatibilité
* différents clients

Syntaxe 

* `<?xml version="1.0?>`
* valeurs d'attributs
* éléments fermés : `<img />`
* 1 élément racine

Le document est un *arbre* DOM.

### Structure

Séparation fond / forme, donnée / présentation

On utilise un balisage *sémantique*. Vers le "responsive", la manière d'afficher le contenu va s'adapter au support qui l'affiche.

méta-données
```html
<meta name="" content=""/>
```


par défaut, par ordre d'apparition, le plus important en premier

```html
<p>paragraphe</p>
<em>important</em>
<strong>plus important</strong>
<abbr title="Hypertext Markup Language">HTML</abbr>
<blockquote>citation</blockquote>
<time datetime="2001-01-01">millenium</time>
...
```

#### Plus de structure ?

Éléments génériques : `<div>` (pour tout) et `<span>` (uniquement du texte). On peut leur donner des attributs :
```html
<div id="" class="" role="">
```

#### Pour les images 

```html
<img alt="texte descriptif" src="uri"/>
```

>Lors de la construction de son document il est nécessaire de prendre en comptes les notions d'accessibilité et d'analyse du contenu.

```html
<svg></svg>
<canvas></canvas>
```

`<svg>` pour le vectoriel et `<canvas>` pour un contenu généré en javascript (jeux etc.)

```html
<figure> et <figcaption>
```

#### Audio / Vidéo

```html
<audio>
<video>
```

attributs : src, preload, autoplay, mediagroup, loop, muted, controls.

```html
<track src="uri" kind="type"/>
```

sous-titre : `subtitles`
sous-titres description : `captions`
audio description : `descriptions`
chapitres : `chapters`

### Tableaux

Utilisés pour les données mais pas pour la mise en forme.

```html
<table>
<tr>
 <th scope="col">dog</th>
 <th scope="col">cat</th>
 <th scope="col">horse</th>
 <th scope="col">iguana</th>
</tr>
<tr>
 <td>5</td>
 <td>2</td>
 <td>10</td>
 <td>500</td>
</tr>
</table>
```

### Hypermédia

#### Liens

```html
<link rel="" title="" href="" type="" media="" hreflang=""/>
<a href="" target="cible" rel="" hreflang="" type=""></a>
<iframe src="" name="nom" seamless="seamless"/>
```




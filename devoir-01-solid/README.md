# DEVOIR 01 - PRINCIPES SOLID

## 1. Présentation du projet

Ce projet a pour objectif de mettre en pratique les cinq principes SOLID
de la programmation orientée objet à travers des exemples développés en Java.

Pour chaque principe, deux versions sont présentées :

- **Avant correction :** code qui ne respecte pas le principe étudié.
- **Après correction :** code modifié pour respecter le principe étudié.

L'objectif est de comprendre les problèmes liés à une mauvaise conception
et d'apprendre à produire un code plus clair, réutilisable et facile à maintenir.

## 2. Présentation des cinq principes SOLID

### 1. SRP - Single Responsibility Principle

**Principe de responsabilité unique**

Une classe doit avoir une seule responsabilité et une seule raison de changer.

- Avant correction : la classe `Book` regroupe plusieurs responsabilités.
- Après correction : la classe `BookSRP` est utilisée pour représenter
  les données du livre.

### 2. OCP - Open/Closed Principle

**Principe ouvert/fermé**

Une classe doit être ouverte à l'extension, mais fermée à la modification.

L'objectif est de permettre l'ajout de nouvelles fonctionnalités sans
modifier constamment le code existant.

- Avant correction : `AreaCalculator`.
- Après correction : `AreaCalculator2`.

### 3. LSP - Liskov Substitution Principle

**Principe de substitution de Liskov**

Une classe fille doit pouvoir remplacer sa classe mère sans modifier
le comportement attendu du programme.

Ce principe permet de garantir la cohérence des relations d'héritage.

- Avant correction : `Rectangle.java` et `Mainlsp.java`.
- Après correction : `Shape.java` et `Mainlsp2.java`.

### 4. ISP - Interface Segregation Principle

**Principe de ségrégation des interfaces**

Une classe ne doit pas être obligée d'implémenter des méthodes
dont elle n'a pas besoin.

- Avant correction : l'interface `Worker` impose les méthodes `work()`
  et `eat()` aux humains et aux robots.
- Après correction : les interfaces sont séparées :
  - `Workable` : définit la méthode `work()`.
  - `Eatable` : étend `Workable` et définit la méthode `eat()`.

Ainsi, `HumanWorker` implémente `Eatable`, tandis que
`RobotWorker` implémente uniquement `Workable`.

### 5. DIP - Dependency Inversion Principle

**Principe d'inversion des dépendances**

Les modules de haut niveau ne doivent pas dépendre directement
des modules de bas niveau. Les deux doivent dépendre d'abstractions.

- Avant correction : `OrderProcessor` dépend directement de `MySQLDatabase`.
- Après correction : une interface `Database` est introduite.
  `MySQLDatabase` et `MongoDBDatabase` implémentent cette interface.

`OrderProcessor` dépend désormais de l'interface `Database`
et reçoit son implémentation à travers son constructeur.

## 3. Architecture du projet

```text
devoir-01-solid/
│
├── 01-srp/
│   ├── avant/
│   │   └── src/inf4067/solid/srp/
│   │       ├── Book.java
│   │       └── Main.java
│   │
│   └── apres/
│       └── src/inf4067/solid/srp/
│           ├── BookSRP.java
│           └── Main.java
│
├── 02-ocp/
│   ├── avant/
│   │   └── src/inf4067/solid/ocp/
│   │       ├── AreaCalculator.java
│   │       └── Main.java
│   │
│   └── apres/
│       └── src/inf4067/solid/ocp/
│           ├── AreaCalculator2.java
│           └── Main.java
│
├── 03-lsp/
│   ├── avant/
│   │   └── src/inf4067/solid/lsp/
│   │       ├── Mainlsp.java
│   │       └── Rectangle.java
│   │
│   └── apres/
│       └── src/inf4067/solid/lsp/
│           ├── Shape.java
│           ├── Mainlsp2.java
│           └── src/inf4067/solid/lsp/
│               └── Shape.java
│
├── 04-isp/
│   ├── avant/
│   │   └── src/inf4067/solid/isp/
│   │       ├── Worker.java
│   │       └── Main.java
│   │
│   └── apres/
│       └── src/inf4067/solid/isp/
│           ├── Worker.java
│           └── Main.java
│
├── 05-dip/
│   ├── avant/
│   │   └── src/inf4067/solid/dip/old/
│   │       ├── OrderProcessor.java
│   │       └── Main.java
│   │
│   └── apres/
│       └── src/inf4067/solid/dip/
│           ├── OrderProcessor.java
│           └── Main.java
│
└── README.md

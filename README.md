# 🚀 Guide Pratique de MapStruct

Bienvenue dans ce guide complet de **MapStruct**! Ce repo présente une comparaison de MapStruct avec d'autres bibliothèques comme **ModelMapper** et met en avant les principes SOLID respectés par MapStruct. Vous trouverez ici des exemples pratiques et comment utiliser les annotations de MapStruct pour simplifier vos mappings d'objets.

## 📋 Table des Matières

1. [Introduction à MapStruct](#-introduction-à-mapstruct)
2. [MapStruct vs ModelMapper](#-mapstruct-vs-modelmapper)
3. [Principes SOLID respectés par MapStruct](#-principes-solid-respectés-par-mapstruct)
4. [Annotations Importantes](#-annotations-importantes)
5. [Ressources](#-ressources)

---

## 💡 Introduction à MapStruct

**MapStruct** est un framework Java permettant de mapper des objets de manière performante et concise, en générant automatiquement le code de conversion.

## 🔄 Comparaison : MapStruct vs ModelMapper

| Critère                  | MapStruct                                  | ModelMapper                                  |
|--------------------------|---------------------------------------------|----------------------------------------------|
| **Mécanisme de Fonctionnement** | Génère du code au moment de la compilation pour mapper les objets, sans utiliser de réflexion. | Utilise la réflexion pour examiner les objets et mapper leurs champs à l'exécution. |
| **Performance**          | Très performant car le code est pré-généré et optimisé. | Moins performant car la réflexion prend plus de temps et de ressources à l'exécution. |
| **Simplicité et Maintenance** | Simplicité avec des annotations qui décrivent précisément le mapping. Le code généré est facile à déboguer et à maintenir. | La réflexion rend le code plus flexible mais parfois moins intuitif, car elle ne vérifie pas les erreurs de compilation. |


---

## ⚙️ Principes SOLID respectés par MapStruct

- **Single Responsibility Principle (SRP)** : MapStruct génère une classe Mapper distincte, qui a pour seule responsabilité de mapper les objets.
- **Open/Closed Principle (OCP)** :(les classes doivent être ouvertes à l’extension mais fermées à la modification) Les mappers peuvent être étendus et configurés avec des annotations pour gérer les changements sans modifier les mappers existants.
- **Dependency Inversion Principle (DIP)** : Utilisation de l'injection de dépendances avec `@Mapper` pour faciliter les tests et les extensions.

## 🔖 Annotations Importantes

| Annotation                        | Description                                                              |
|------------------------------------|--------------------------------------------------------------------------|
| @Mapper                            | Déclare l'interface de mapper MapStruct.                                  |
| @Mapping                           | Déclare les règles de mappage entre les champs des objets source et cible.|
| @MappingTarget                     | Indique qu'un objet existant doit être mis à jour au lieu de créer un nouveau. |
| @IterableMapping                   | Définit des règles de mappage pour des collections.                       |
| @BeanMapping                       | Fournit des configurations supplémentaires pour les mappings de beans.   |
| @AfterMapping                      | Permet de définir une méthode de post-traitement après un mappage.       |
| @BeforeMapping                     | Permet de définir une méthode à exécuter avant un mappage.               |
| @ValueMapping                      | Utilisé pour mapper des valeurs entre des énumérations.                  |


## 📚 Ressources

- [Documentation Officielle de MapStruct](https://mapstruct.org/documentation/stable/reference/html/)
- [Guide Comparatif : MapStruct vs ModelMapper](#-mapstruct-vs-modelmapper)

---


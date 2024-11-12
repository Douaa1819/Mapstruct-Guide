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

## 🔄 MapStruct vs ModelMapper

- **MapStruct** : Compilation de code au moment de la compilation, ce qui le rend rapide et performant.
- **ModelMapper** : Basé sur la réflexion, il est plus flexible mais peut être plus lent en raison de l'utilisation de la réflexion.

## ⚙️ Principes SOLID respectés par MapStruct

- **Single Responsibility Principle (SRP)** : MapStruct génère une classe Mapper distincte, qui a pour seule responsabilité de mapper les objets.
- **Open/Closed Principle (OCP)** : Les mappers peuvent être étendus et configurés avec des annotations pour gérer les changements sans modifier les mappers existants.
- **Dependency Inversion Principle (DIP)** : Utilisation de l'injection de dépendances avec `@Mapper` pour faciliter les tests et les extensions.

## 🔖 Annotations Importantes

- `@Mapper` : Marque une interface comme Mapper pour générer les implémentations.
- `@Mapping(source, target)` : Spécifie le mapping entre les champs source et cible.
- `@Mappings` : Permet d'ajouter plusieurs annotations `@Mapping` sur une méthode.

## 📚 Ressources

- [Documentation Officielle de MapStruct](https://mapstruct.org/documentation/stable/reference/html/)
- [Guide Comparatif : MapStruct vs ModelMapper](#-mapstruct-vs-modelmapper)

---


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

| Critère                  | MapStruct                                         | ModelMapper                                    |
|--------------------------|---------------------------------------------------|------------------------------------------------|
| **Performance**          | Très performant, car le mapping est généré au moment de la compilation. | Moins performant, car basé sur la réflexion.   |
| **Facilité d'utilisation** | Nécessite des annotations explicites pour chaque champ, mais offre une clarté et un contrôle précis. | Plus flexible, mais peut être moins explicite, avec des mappings implicites. |
| **Code généré**          | Génère du code source au moment de la compilation, facilitant le débogage et l'optimisation. | Pas de code source généré; utilise la réflexion dynamique. |
| **Support des principes SOLID** | Bien adapté aux principes SOLID (SRP, OCP, DIP), avec des mappers dédiés et extensibles. | Moins aligné avec SOLID, car les mappings sont dynamiques et peuvent être plus difficiles à personnaliser. |
| **Annotations principales** | `@Mapper`, `@Mapping`, `@Mappings`               | Peu d'annotations, repose davantage sur la configuration implicite. |
| **Types de mapping**     | Support complet pour le mapping explicite de champs, y compris les objets imbriqués. | Mapping automatique basé sur la réflexion, supporte les objets imbriqués mais avec moins de contrôle. |
| **Contrôle des mappings**| Contrôle fin du mapping avec des annotations pour chaque champ, facilitant les mappings complexes. | Moins de contrôle précis, plus automatisé, mais peut nécessiter des configurations spécifiques pour des cas complexes. |
| **Courbe d'apprentissage**| Facile à apprendre pour les mappings simples, mais nécessite d’apprendre les annotations MapStruct. | Facile à configurer, mais peut devenir complexe pour des mappings plus spécifiques. |
| **Cas d'utilisation recommandé** | Projets avec des mappings nécessitant de la performance et un contrôle explicite. | Projets avec des mappings simples ou si la réflexion dynamique est acceptable. |

---

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


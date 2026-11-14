# ClickTrack — API de tracking de liens

![Java 17](https://img.shields.io/badge/Java%2017-ED8B00?style=flat-square&logo=openjdk&logoColor=white) ![Maven](https://img.shields.io/badge/Maven-C71A36?style=flat-square&logo=apachemaven&logoColor=white) ![Spring MVC](https://img.shields.io/badge/Spring%20MVC-6DB33F?style=flat-square&logo=spring&logoColor=white) ![Jackson](https://img.shields.io/badge/Jackson-2C5BB4?style=flat-square) ![Tomcat](https://img.shields.io/badge/Tomcat-F8DC75?style=flat-square&logo=apachetomcat&logoColor=white)

**ClickTrack** est une **API REST Spring MVC** (sans Spring Boot) qui permet aux **publishers** de générer des **liens de tracking** pour des offres et de suivre les **clics** sur ces liens.

## ✨ Fonctionnalités

- Création d'un lien de tracking pour un publisher et une offre.
- Consultation des offres disponibles et des liens d'un publisher.
- Redirection / enregistrement d'un clic via un lien court `/t/{id}`.
- Architecture en couches : **Controller → Service → Repository**.
- Configuration XML Spring (`applicationContext.xml`, `dispatcher-servlet.xml`, `web.xml`).

## 🔗 Endpoints

| Méthode | Route | Description |
| --- | --- | --- |
| POST | `/api/publishers/{id}/liens` | Créer un lien de tracking |
| GET | `/api/publishers/{id}/liens` | Liens d'un publisher |
| GET | `/api/publishers/{id}/offres` | Offres disponibles |
| GET | `/t/{id}` | Enregistrer un clic |

## 🗂️ Structure

```text
ma.youcode.clicktrack
├── controller   # LinksController, PublisherController
├── model        # dto (click, link, offre), entity (Lien, Publisher), enums
├── repository   # LinkRepository, PublisherRepository (+ Imp)
└── service      # LinkService, PublisherService (+ Imp)
```

## ▶️ Lancer le projet

```bash
mvn clean package
# déployer target/clicktrack-1.0-SNAPSHOT.war sur Tomcat 10+
```

---

## 👤 Auteur

**Mouad Ziyani** — Développeur Full-Stack (PHP/Laravel · Java/Spring · React)

[![Portfolio](https://img.shields.io/badge/Portfolio-mouadziyani.com-d92632?style=flat-square)](https://mouadziyani.com)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-Mouad%20Ziyani-0A66C2?style=flat-square&logo=linkedin)](https://www.linkedin.com/in/mouad-ziyani-956484339)
[![GitHub](https://img.shields.io/badge/GitHub-mouadziyani-181717?style=flat-square&logo=github)](https://github.com/mouadziyani)

## 📄 Licence

© 2025-2026 Mouad Ziyani — **Tous droits réservés.**

Ce projet est publié uniquement à titre de démonstration (portfolio). Il est **interdit** de copier, cloner, modifier, redistribuer ou réutiliser ce code, en tout ou en partie, sans l'autorisation écrite préalable de l'auteur. Voir le fichier [LICENSE](LICENSE).

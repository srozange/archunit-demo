# Utilisation de Immutables

* Statut: Acceptée
* Décideurs: Communauté de développement
* Date: 2020

## Contexte et état des lieux

Afin de mieux controler la donnée manipulée côté Backend, il a été décidé d'avoir un modèle d'entités non "mutables" (
Une fois instanciées ces entitées ne peuvent être altérées (sans être recréées spécifiquement par un processus ad-hoc)

## Options considérées

* [option 1] Création de builders pour créer les entités du domaine
* [option 2] Utilisation d'un utilitaire pour générer les builders.

## Résultat de la décision

Option choisie: "[option 2]", les entités du modèle que l'on souhaite immutables, sont créées comme des **classes
abstraites** et annotées :

```java

@Value.Immutable
public abstract class Offer {
	public abstract String code();

	@Nullable
	public abstract String label();
}
```

C'est l'utilitaire [Immutables](https://immutables.github.io/) qui génèrent les builders nécessaires dans le
répertoire **target/generated/annotations**.

De cette façon, on s'assure que les entités sont réèllement immutables et ce, sans écriture supplémentaire de code

* Voir [Immutables](https://immutables.github.io/)
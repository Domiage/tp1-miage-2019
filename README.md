# Nom des étudiants de ce binôme 
CHAUVIERE JASON et GAILLON DOMINIQUE

# Exercice 1 - Refactoring

Pour cet exercice, nous avons décidé de créer trois psfi (public static final int) correspondant aux trois valeurs que nous voulions faire apparaître :
- "0" pour deux mails identiques
- "-1" pour indiquer que le mail2 a une importance moindre
- "1" pour indiquer que le mail1 a une importance moindre

Nous avons également réusiné comme convenu la classe `MailComparator` afin de la rendre plus compréhensible.

# Exercice 2 - Découpage en couches

Comme convenu, nous avons découpé notre code dans les 4 couches standards vus en cours :
- la couche Domain,
- la couche Infrastructure,
- la couche Presentation et
- la couche Service.

Nous avons ajouté la couche Commun comme demandé.

# Exercice 3 - Injection de dépendances avec Guice

Nous avons configuré la méthode `configure()` de la classe `MailReaderModule` en fonction de la variable production.
En fonction de celle-ci, on lie la classe soit à `SmtpMailSender` dans un état de production soit à `InMemoryMailSender` dans un état de test.

On déclare aussi le besoin, via l'annotation `@Inject` (injection par constructeur) de `MailService` pour `InterpreteurLigneCommande`.
Nous faisons de même pour l'injection du `MailSender` dans le `MailService`.

# Exercice 4 - TU

Comme convenu, nous avons enlevé les quelques annotations `@Ignore` quand celles-ci étaient présentes.
Nous avons également complété les tests unitaires présents dans les classes de test `MailTest` et `MailComparatorTest`.

... <à écrire>

# Exercice 5 - BDD avec Cucumber-jvm

Il nous faut ainsi compléter la classe `MailComparaisonStep` sur deux fonctions : `je_trie()` et `le_tri_doit_retourner()`.
Pour la première, on utilise le `resuAsString` de la classe avec lequel on peut comparer les deux mails et obtenir le tri souhaité.
Pour la seconde, on doit utiliser `assertThat()` mais également `is()`. Il nous faut ainsi récupérer les imports de package faits dans la classe `MailComparatorTest` à titre d'exemple. Ainsi, on peut compléter cette fonction normalement.

Nous avons ajouté un cas de test dans la feature `trier_mail.feature`.

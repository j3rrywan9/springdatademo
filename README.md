# Spring Data

## Working with Spring Data Repositories

### Core Concepts

The central interface in Spring Data repository abstraction is `Repository`.
It takes the domain class to manage as well as the id type of the domain class as type arguments.
This interface acts primarily as a marker interface to capture the types to work with and to help you to discover interfaces that extends this one.
The `CrudRepository` provides sophisticated CRUD functionality for the entity class that is being managed.

We also provide persistence technology-specific abstractions like e.g. `JpaRepository` or `MongoRepository`.
Those interfaces extend `CrudRepository` and expose the capabilities of the underlying persistence technology in addition to the rather generic persistence technology-agnostic interfaces like e.g. `CrudRepository`.


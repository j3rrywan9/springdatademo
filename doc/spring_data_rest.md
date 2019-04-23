# Spring Data REST

## Introduction

REST web services have become the number one means for application integration on the web.
In its core, REST defines that a system consists of resources that clients interact with.

Spring Data REST builds on top of Spring Data repositories and automatically exports those as REST resources.
It leverages hypermedia to allow clients to find functionality exposed by the repositories and integrates these resources into related hypermedia based functionality automatically.

## Getting started

### Introduction

### Adding Spring Data REST to a Spring Boot project

Spring Boot configuration with Maven
```xml
<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-data-rest</artifactId>
</dependency>
```
When using Spring Boot, Spring Data REST gets configured automatically.

### Basic settings for Spring Data REST

### Starting the application

## Repository resources

### Fundamentals

The core functionality of Spring Data REST is to export resources for Spring Data repositories.
Thus, the core artifact to look at and potentially tweak to customize the way the exporting works is the repository interface.
Assume the following repository interface:
```java
public interface OrderRepository extends CrudRepository<Order, Long> { }
```
For this repository, Spring Data REST exposes a collection resource at `/orders`.
The path is derived from the uncapitalized, pluralized, simple class name of the domain class being managed.
It also exposes an item resource for each of the items managed by the repository under the URI template `/orders/{id}`.

By default the HTTP methods to interact with these resources map to the according methods of `CrudRepository`.

#### Default status codes

#### Resource discoverability

A core principle of HATEOAS is that resources should be discoverable through the publication of links that point to the available resources.
There are a few competing de-facto standards of how to represent links in JSON.
By default, Spring Data REST uses HAL to render responses.
HAL defines links to be contained in a property of the returned document.

Resource discovery starts at the top level of the application.
By issuing a request to the root URL under which the Spring Data REST application is deployed, the client can extract a set of links from the returned JSON object that represent the next level of resources that are available to the client.

For example, to discover what resources are available at the root of the application, issue an HTTP GET to the root URL:
```bash
curl -v http://localhost:8080/
```
The property of the result document is an object in itself consisting of keys representing the relation type with nested link objects as specified in HAL.

### The collection resource

Spring Data REST exposes a collection resource named after the uncapitalized, pluralized version of the domain class the exported repository is handling.
Both the name of the resource and the path can be customized using the `@RepositoryRestResource` on the repository interface.

### The item resource

Spring Data REST exposes a resource for individual collection items as sub-resources of the collection resource.

#### Supported HTTP methods

### The association resource

Spring Data REST exposes sub-resources of every item resource for each of the associations the item resource has.
The name and path of the of the resource defaults to the name of the association property and can be customized using `@RestResource` on the association property.

### The search resource

The search resource returns links for all query methods exposed by a repository.
The path and name of the query method resources can be modified using `@RestResource` on the method declaration.

#### Supported HTTP methods

As the search resource is a read-only resource it supports `GET` only.

### The query method resource

The query method resource executes the query exposed through an individual query method on the repository interface.

# PostgreSQL

## Installation

```bash
brew update

brew install postgresql@9.6
```

## Starting

```bash
echo 'export PATH="/usr/local/opt/postgresql@9.6/bin:$PATH"' >> ~/.zshrc

pg_ctl -D /usr/local/var/postgresql@9.6 start
```

## Creating database

PostgreSQL starts with 3 databases, namely, `template0`, `template1`, and `postgres`.

The main user database is `postgres`.

For example, this is how you create a PostgreSQL database named "inventory":
```bash
createdb inventory
```

## psql

```bash
psql -l
```

## Frequently used queries

```sql
select datname from pg_database;
```

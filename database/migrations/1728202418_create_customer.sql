--liquibase formatted sql
--changeset samadali1697:1728202418_create_customer
CREATE TABLE customer (
    id serial PRIMARY KEY,
    first_name VARCHAR(255),
    last_name VARCHAR(255)
);
--rollback DROP TABLE customer;

CREATE TABLE IF NOT EXISTS customer (
    id   INTEGER      NOT NULL AUTO_INCREMENT,
    first_name VARCHAR(128) NOT NULL,
    last_name VARCHAR(128) NOT NULL,
    created_at Date,
    updated_at Date,
    PRIMARY KEY (id)
);
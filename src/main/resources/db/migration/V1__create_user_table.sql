CREATE TABLE user_info(
    "id"           BIGSERIAL                PRIMARY KEY,
    "name"         VARCHAR(255)                NOT NULL,
    "email"        VARCHAR(255)      UNIQUE    NOT NULL,
    "password"     CHAR(64)                    NOT NULL,
    "created_time" TIMESTAMP WITH TIME ZONE    NOT NULL,
    "updated_time" TIMESTAMP WITH TIME ZONE    NOT NULL
);
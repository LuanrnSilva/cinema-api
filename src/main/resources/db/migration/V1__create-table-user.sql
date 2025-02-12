CREATE TABLE tb_user(
    id bigint NOT NULL auto_increment,
    name varchar(100) NOT NULL,
    email varchar(100) NOT NULL UNIQUE,
    phone varchar(20) NOT NULL,
    password varchar(255) NOT NULL,
    active tinyint(1) NOT NULL,
    birth_date Date NOT NULL,
    cpf varchar(14) NOT NULL UNIQUE,
    zip varchar(20) NOT NULL,
    street varchar(100) NOT NULL,
    city varchar(50) NOT NULL,
    uf varchar(2) NOT NULL,
    country varchar(50) NOT NULL,
    number varchar(20),
    complement varchar(100),

    primary key(id)
);
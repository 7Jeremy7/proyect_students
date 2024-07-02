CREATE TABLE IF NOT EXISTS students(
    id SERIAL,
    first_name VARCHAR(100) NOT NULL,
    last_name VARCHAR (100) NOT NULL,
    age VARCHAR (100) NOT NULL,
    PRIMARY KEY (id)
);
insert into students (first_name, last_name, age)
values ('juancarlos','perez', 15);
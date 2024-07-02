CREATE TABLE grades (
    id SERIAL PRIMARY KEY,
    subject VARCHAR(100) NOT NULL,
    grade DECIMAL(5, 2) NOT NULL,
    teacher VARCHAR(100)
);

insert into grades ( subject, grade, teacher)
values('matematicas',8.5,'nancy')
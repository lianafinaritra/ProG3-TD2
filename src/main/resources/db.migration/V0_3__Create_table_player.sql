create table player
(
    id     serial,
    name varchar,
    number int,
    team_id int references team(id),
    primary key (id)
);
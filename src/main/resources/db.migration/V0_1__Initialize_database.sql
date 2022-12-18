create table team
(
    id     serial,
    name varchar,
    primary key (id)
);

create table player
(
    id     serial,
    name varchar,
    number int,
    team_id int references team(id),
    primary key (id)
);

create table sponsor
(
    id     serial,
    name varchar,
    primary key (id)
);

create table team_sponsor
(
    id     serial,
    team_id int references team(id),
    sponsor_id int references sponsor(id),
    primary key (id)
);

create table play_against
(
    id     serial,
    datetime date,
    stadium varchar
    team_one int references team(id),
    team_two int references team(id),
    primary key (id)
);
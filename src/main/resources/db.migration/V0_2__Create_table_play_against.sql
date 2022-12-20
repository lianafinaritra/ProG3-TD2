create table play_against
(
    id     serial,
    datetime date,
    stadium varchar,
    team_one int references team(id),
    team_two int references team(id),
    primary key (id)
);
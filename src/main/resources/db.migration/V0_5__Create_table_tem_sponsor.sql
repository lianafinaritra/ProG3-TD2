create table team_sponsor
(
    id     serial,
    team_id int references team(id),
    sponsor_id int references sponsor(id),
    primary key (id)
);
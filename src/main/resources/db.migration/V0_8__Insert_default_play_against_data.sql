insert into play_against (id, datetime, stadium, team_one, team_two)
values (1, '2003-01-01', 'Maracana', 2, 5);
insert into play_against (id, datetime, stadium, team_one, team_two)
values (2, '2003-01-01', 'Camp Nou', 3, 4);
insert into play_against (id, datetime, stadium, team_one, team_two)
values (3, '2003-01-01', 'Parc des Princes', 2, 1);
insert into play_against (id, datetime, stadium, team_one, team_two)
values (4, '2003-01-01', 'Wembley', 1, 5);
insert into play_against (id, datetime, stadium, team_one, team_two)
values (5, '2003-01-01', 'Barikadimy', 4, 1);

alter sequence play_against_id_seq restart with 6;


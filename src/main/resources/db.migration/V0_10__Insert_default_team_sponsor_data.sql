insert into team_sponsor (id, team_id, sponsor_id)
values (1, 1, 1);
insert into team_sponsor (id, team_id, sponsor_id)
values (2, 1, 2);
insert into team_sponsor (id, team_id, sponsor_id)
values (3, 2, 3);
insert into team_sponsor (id, team_id, sponsor_id)
values (4, 3, 4);
insert into team_sponsor (id, team_id, sponsor_id)
values (5, 4, 5);
insert into team_sponsor (id, team_id, sponsor_id)
values (6, 5, 3);

alter sequence team_sponsor_id_seq restart with 7;


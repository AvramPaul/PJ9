drop table if exists persoane;
create table persoane (id integer not null primary key, nume varchar(40) not null,varsta int);
insert into persoane (id,nume,varsta) values (1,'Ana',20);
insert into persoane (id,nume,varsta) values (2,'Oana',21);
insert into persoane (id,nume,varsta) values (3,'Ionel',22);
insert into persoane (id,nume,varsta) values (4,'Dorel',23);

drop table if exists masina;
create table masina (nr varchar(7) not null primary key, marca varchar(10) not null, an integer not null, culoare varchar(30) not null, km integer not null);
insert into masina (nr,marca,an, culoare, km) values ('BH55DES','Volkswagen',2012, 'gri_sobolan', 500000);
insert into masina (nr,marca,an, culoare, km) values  ('BH45DES','Volkswagen',2012, 'gri_sobolan', 500000);
insert into masina (nr,marca,an, culoare, km) values  ('BH35DES','Volkswagen',2012, 'gri_sobolan', 500000);
insert into masina (nr,marca,an, culoare, km) values  ('BH25DES','Volkswagen',2012, 'gri_sobolan', 500000);
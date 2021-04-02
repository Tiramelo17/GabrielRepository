insert into funcionario
(nome,atividade)
values('Gabriel','chefe de cozinha');
insert into funcionario
(nome,atividade)
values('Junior','Auxiliar');
insert into funcionario
(nome,atividade)
values('Marcors','chefe de cozinha');
insert into funcionario
(nome,atividade)
values('Jorge','Auxiliar');
insert into funcionario
(nome,atividade)
values('Bia','chefe de cozinha');
insert into funcionario
(nome,atividade)
values('Marcela','chefe de cozinha');
insert into funcionario
(nome,atividade)
values('Gabrielle','Atendente');
insert into funcionario
(nome,atividade)
values('Gilson','Atendente');
insert into funcionario
(nome,atividade)
values('Matheus','Atendente');
insert into funcionario
(nome,atividade)
values('Wender','Atendente');

insert into ingrediente 
(name,data_validade)
values('Arroz', 10/10/2021);
insert into ingrediente 
(name,data_validade)
values('Macarrão', 30/01/2023);
insert into ingrediente 
(name,data_validade)
values('Champignon', 08/05/2021);
insert into ingrediente 
(name,data_validade)
values('Feijão', 12/03/2022);
insert into ingrediente 
(name,data_validade)
values('Carne', 03/05/2021);
insert into ingrediente 
(name,data_validade)
values('Brócolis', 12/04/2021);
insert into ingrediente 
(name,data_validade)
values('molho', 12/04/2021);
insert into ingrediente
(name,data_validade)
values ('Carne de porco',05/05/2021);
insert into cozinha
(nome,horaAbertura,horaFechar,pratoPrincipal)
values('Tailandesa',15,22,'Pad Thai');
DELETE FROM ingrediente WHERE name = 'arroz';
ALTER TABLE ingrediente DROP COLUMN ingrediente;
SET SQL_SAFE_UPDATES = 0;

select *from cozinha
where horaFechar = 22;
select *from ingrediente
where data_validade < 02/04/2021;
select * from ingrediente;
select * from cozinha;
select * from funcionario

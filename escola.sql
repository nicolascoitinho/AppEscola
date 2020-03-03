create database escola;
use escola;

create table curso(
id_curso integer primary key auto_increment,
nome_curso varchar(50)
);

create table turma(
id_turma integer primary key auto_increment,
id_curso integer,
qtd_alunos integer
);

create table professor(
id_professor integer primary key auto_increment,
chapa integer,
nome_professor varchar(50),
id_curso integer,
id_turma integer
);

create table aluno(
id_aluno integer primary key auto_increment,
ra integer,
nome_aluno varchar(50),
id_curso integer,
id_turma integer
);

alter table turma add constraint foreign key (id_curso) references curso(id_curso);
alter table professor add constraint foreign key (id_curso) references curso(id_curso);
alter table aluno add constraint foreign key (id_curso) references curso(id_curso);
alter table professor add constraint foreign key (id_turma) references turma(id_turma);
alter table aluno add constraint foreign key (id_turma) references turma(id_turma);
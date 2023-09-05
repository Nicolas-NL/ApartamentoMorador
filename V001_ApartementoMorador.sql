create table Apartamento(
id_apartamento bigint IDENTITY(1,1) primary key,
telefone_apartamento varchar(30),
numero varchar(30)
);
create table Morador(
id_morador bigint IDENTITY(1,1) primary key,
nome_morador varchar(30),
cpf_morador char(11),
telefone_morador varchar(30),
id_apartamento_morad bigint foreign key references Apartamento(id_apartamento)
);

insert into Apartamento values('112','1');
insert into Morador values('Adalberto','12345678912','113',1);
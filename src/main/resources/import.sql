insert into tb_usuario(nm_completo, dt_nascimento, des_cpf, des_telefone, des_email, des_senha) values('Isac Coelho Bonito', '1987-05-15', '85642158720', '519 62587413', 'isac1987@gmail.com', 'isac1505');
insert into tb_usuario(nm_completo, dt_nascimento, des_cpf, des_telefone, des_email, des_senha) values('Carla Joana de Freitas', '1979-07-23', '95641328754', '21962587413', 'carla1979@gmail.com', 'carla1979');

insert into tb_motorista(nm_completo, des_cpf, des_cnh, modelo_carro, des_placa) values('Jackson Ferreira Santos', '52479302544', '2539872246', 'VolksVagem Gol', 'VRGB3265');
insert into tb_motorista(nm_completo, des_cpf, des_cnh, modelo_carro, des_placa) values('Amanda Lima Galvão', '33571269588', '0225641796', 'Corsa Classic', 'DFLM2133');

insert into tb_endereco(id_usuario, des_endereco, des_cidade, des_estado, des_tag) values(0, 'Rua Paulista, 267', 'Osasco', 'São Paulo', 'Casa');
insert into tb_endereco(id_usuario, des_endereco, des_cidade, des_estado, des_tag) values(1, 'Rua Padre Matarazzo, 32', 'São Paulo', 'São Paulo', 'Trabalho');

insert into tb_viagens(id_usuario, id_motorista, des_local_partida, des_local_destino, km_percorrido, preco, forma_pagamento) values (0, 0, 'Rua Paulista, 267', 'Rua Padre Matarazzo, 32', 23.5, 42.53, 'Cartão de débito');
insert into tb_viagens(id_usuario, id_motorista, des_local_partida, des_local_destino, km_percorrido, preco, forma_pagamento) values (1, 1, 'Rua Padre Matarazzo, 32', 'Rua Paulista, 267', 12.0, 34.21, 'Pix');
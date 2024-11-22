 CREATE TABLE tb_endereco (
    id_endereco BIGINT NOT NULL,
    id_usuario BIGINT NOT NULL,
    des_endereco NVARCHAR(200),
    des_cidade NVARCHAR(200),
    des_estado NVARCHAR(100) NOT NULL,
    des_tag NVARCHAR(100)
);

ALTER TABLE tb_endereco ADD CONSTRAINT tb_endereco_pk PRIMARY KEY (id_endereco, id_usuario);

CREATE TABLE tb_motorista (
    id_motorista BIGINT NOT NULL,
    nm_completo NVARCHAR(200) NOT NULL,
    des_cpf NVARCHAR(12) NOT NULL,
    des_cnh NVARCHAR(10) NOT NULL,
    modelo_carro NVARCHAR(150) NOT NULL,
    des_placa NVARCHAR(10) NOT NULL
);

ALTER TABLE tb_motorista ADD CONSTRAINT tb_motorista_pk PRIMARY KEY (id_motorista);

CREATE TABLE tb_usuario (
    id_usuario BIGINT NOT NULL,
    nm_completo NVARCHAR(200) NOT NULL,
    dt_nascimento DATE NOT NULL,
    des_cpf NVARCHAR(12),
    des_telefone NVARCHAR(20) NOT NULL,
    des_email NVARCHAR(50) NOT NULL,
    des_senha NVARCHAR(255) NOT NULL
);

ALTER TABLE tb_usuario ADD CONSTRAINT tb_usuario_pk PRIMARY KEY (id_usuario);

CREATE TABLE tb_viagens (
    id_viagens BIGINT NOT NULL,
    id_usuario BIGINT NOT NULL,
    id_motorista BIGINT NOT NULL,
    des_local_partida NVARCHAR(200) NOT NULL,
    des_local_destino NVARCHAR(200) NOT NULL,
    km_percorrido FLOAT NOT NULL,
    preco NVARCHAR(100) NOT NULL,
    forma_pagamento NVARCHAR(200) NOT NULL
);

ALTER TABLE tb_viagens ADD CONSTRAINT tb_viagens_pk PRIMARY KEY (id_viagens, id_usuario, id_motorista);

ALTER TABLE tb_endereco
    ADD CONSTRAINT tb_endereco_tb_usuario_fk FOREIGN KEY (id_usuario)
        REFERENCES tb_usuario (id_usuario);

ALTER TABLE tb_viagens
    ADD CONSTRAINT tb_viagens_tb_motorista_fk FOREIGN KEY (id_motorista)
        REFERENCES tb_motorista (id_motorista);

ALTER TABLE tb_viagens
    ADD CONSTRAINT tb_viagens_tb_usuario_fk FOREIGN KEY (id_usuario)
        REFERENCES tb_usuario (id_usuario);
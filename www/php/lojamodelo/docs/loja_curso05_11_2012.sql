# SQL Manager 2005 for MySQL 3.7.7.1
# ---------------------------------------
# Host     : localhost
# Port     : 3306
# Database : loja_curso


SET FOREIGN_KEY_CHECKS=0;

CREATE DATABASE `loja_curso`
    CHARACTER SET 'latin1'
    COLLATE 'latin1_swedish_ci';

USE `loja_curso`;

#
# Structure for the `estados` table : 
#

CREATE TABLE `estados` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nome` varchar(255) NOT NULL,
  `sigla` char(3) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=latin1;

#
# Structure for the `municipios` table : 
#

CREATE TABLE `municipios` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `estado_id` int(10) unsigned NOT NULL,
  `nome` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `municipios_ibfk_1` (`estado_id`),
  CONSTRAINT `municipios_ibfk_1` FOREIGN KEY (`estado_id`) REFERENCES `estados` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=617 DEFAULT CHARSET=latin1;

#
# Structure for the `cadastros_site` table : 
#

CREATE TABLE `cadastros_site` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `municipio_id` int(10) unsigned NOT NULL,
  `nome` varchar(100) NOT NULL,
  `endereco` varchar(255) DEFAULT NULL,
  `complemento` varchar(255) DEFAULT NULL,
  `bairro` varchar(100) DEFAULT NULL,
  `cep` varchar(10) DEFAULT NULL,
  `telefone` varchar(20) DEFAULT NULL,
  `celular` varchar(20) DEFAULT NULL,
  `ativo` tinyint(1) unsigned DEFAULT '1',
  `email` varchar(200) NOT NULL,
  `login` varchar(255) DEFAULT NULL,
  `senha` text,
  PRIMARY KEY (`id`),
  KEY `Index_4` (`municipio_id`),
  CONSTRAINT `FK_cadastros_site_3` FOREIGN KEY (`municipio_id`) REFERENCES `municipios` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Structure for the `categorias` table : 
#

CREATE TABLE `categorias` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) NOT NULL,
  `categoria_id` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `Index_2` (`categoria_id`),
  CONSTRAINT `FK_categoriasprodutos_1` FOREIGN KEY (`categoria_id`) REFERENCES `categorias` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

#
# Structure for the `marcas` table : 
#

CREATE TABLE `marcas` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nome` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `nome` (`nome`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

#
# Structure for the `pedidos` table : 
#

CREATE TABLE `pedidos` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `cadastro_id` int(10) unsigned DEFAULT NULL,
  `valor_frete` float DEFAULT NULL,
  `numero_pedido` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `numeroPedido` (`numero_pedido`),
  KEY `cadastro_id` (`cadastro_id`),
  CONSTRAINT `FK_vendas_1` FOREIGN KEY (`cadastro_id`) REFERENCES `cadastros_site` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Structure for the `produtos` table : 
#

CREATE TABLE `produtos` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `categoria_id` int(10) unsigned NOT NULL,
  `marca_id` int(10) unsigned DEFAULT NULL,
  `resumo` text NOT NULL,
  `valor` decimal(10,2) DEFAULT NULL,
  `peso` varchar(20) DEFAULT NULL,
  `nome` varchar(50) NOT NULL,
  `imagem` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

#
# Structure for the `pedidos_itens` table : 
#

CREATE TABLE `pedidos_itens` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `pedido_id` int(10) unsigned NOT NULL,
  `produto_id` int(10) unsigned NOT NULL,
  `valor_unitario` float NOT NULL,
  `quantidade` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  KEY `Index_2` (`pedido_id`),
  KEY `Index_3` (`produto_id`),
  CONSTRAINT `FK_pedidosItens_2` FOREIGN KEY (`produto_id`) REFERENCES `produtos` (`id`),
  CONSTRAINT `FK_pedidositens_3` FOREIGN KEY (`pedido_id`) REFERENCES `pedidos` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Structure for the `usuarios` table : 
#

CREATE TABLE `usuarios` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `login` varchar(50) NOT NULL,
  `senha` varchar(50) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `Index_4` (`login`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

#
# Data for the `estados` table  (LIMIT 0,500)
#

INSERT INTO `estados` (`id`, `nome`, `sigla`) VALUES 
  (1,'Acre','AC'),
  (2,'Alagoas','AL'),
  (3,'Amap','AP'),
  (4,'Amazonas','AM'),
  (5,'Bahia','BA'),
  (6,'Cear','CE'),
  (7,'Distrito Federal','DF'),
  (8,'Esp?rito Santo','ES'),
  (9,'Goi','GO'),
  (10,'Maranh','MA'),
  (11,'Mato Grosso','MT'),
  (12,'Mato Grosso do Sul','MS'),
  (13,'Minas Gerais','MG'),
  (14,'Par','PA'),
  (15,'Para?ba','PB'),
  (16,'Paran','PR'),
  (17,'Pernambuco','PE'),
  (18,'Piau','PI'),
  (19,'Rio de Janeiro','RJ'),
  (20,'Rio Grande do Norte','RN'),
  (21,'Rio Grande do Sul','RS'),
  (22,'Rond?nia','RO'),
  (23,'Roraima','RR'),
  (24,'Santa Catarina','SC'),
  (25,'S?o Paulo','SP'),
  (26,'Sergipe','SE'),
  (27,'Tocantins','TO');

COMMIT;

#
# Data for the `municipios` table  (LIMIT 0,500)
#

INSERT INTO `municipios` (`id`, `estado_id`, `nome`) VALUES 
  (202,5,'Aba?ra'),
  (203,5,'Abar'),
  (204,5,'Acajutiba'),
  (205,5,'Adustina'),
  (206,5,'?gua Fria'),
  (207,5,'Aiquara'),
  (208,5,'Alagoinhas'),
  (209,5,'Alcoba'),
  (210,5,'Almadina'),
  (211,5,'Amargosa'),
  (212,5,'Am?lia Rodrigues'),
  (213,5,'Am?rica Dourada'),
  (214,5,'Anag'),
  (215,5,'Andara'),
  (216,5,'Andorinha'),
  (217,5,'Angical'),
  (218,5,'Anguera'),
  (219,5,'Antas'),
  (220,5,'Ant?nio Cardoso'),
  (221,5,'Ant?nio Gon?alves'),
  (222,5,'Apor'),
  (223,5,'Apuarema'),
  (224,5,'Ara?as'),
  (225,5,'Aracatu'),
  (226,5,'Araci'),
  (227,5,'Aramari'),
  (228,5,'Arataca'),
  (229,5,'Aratu?pe'),
  (230,5,'Aurelino Leal'),
  (231,5,'Baian?polis'),
  (232,5,'Baixa Grande'),
  (233,5,'Banza'),
  (234,5,'Barra'),
  (235,5,'Barra da Estiva'),
  (236,5,'Barra do Cho'),
  (237,5,'Barra do\r\n Mendes'),
  (238,5,'Barra do Rocha'),
  (239,5,'Barreiras'),
  (240,5,'Barro Alto'),
  (241,5,'Belmonte'),
  (242,5,'Belo Campo'),
  (243,5,'Biritinga'),
  (244,5,'Boa Nova'),
  (245,5,'Boa Vista do Tupim'),
  (246,5,'Bom Jesus da Lapa'),
  (247,5,'Bom Jesus da Serra'),
  (248,5,'Boninal'),
  (249,5,'Bonito'),
  (250,5,'Boquira'),
  (251,5,'Botupor'),
  (252,5,'Brej?es'),
  (253,5,'Brejol?ndia'),
  (254,5,'Brotas de Maca?bas'),
  (255,5,'Brumado'),
  (256,5,'Buerarema'),
  (257,5,'Buritirama'),
  (258,5,'Caatiba'),
  (259,5,'Cabaceiras do Paragua'),
  (260,5,'Cachoeira'),
  (261,5,'Cacul'),
  (262,5,'Ca'),
  (263,5,'Caetanos'),
  (264,5,'Caetit'),
  (265,5,'Cafarnaum'),
  (266,5,'Cairu'),
  (267,5,'Caldeir?o Grande'),
  (268,5,'Camacan'),
  (269,5,'Cama?ari'),
  (270,5,'Camamu'),
  (271,5,'Campo Alegre de Lourdes'),
  (272,5,'Campo Formoso'),
  (273,5,'Can?polis'),
  (274,5,'Canarana'),
  (275,5,'Canavieiras'),
  (276,5,'Candeal'),
  (277,5,'Candeias'),
  (278,5,'Candiba'),
  (279,5,'C?ndido Sales'),
  (280,5,'Cansan?'),
  (281,5,'Canudos'),
  (282,5,'Capela do Alto Alegre'),
  (283,5,'Capim Grosso'),
  (284,5,'Cara?bas'),
  (285,5,'Caravelas'),
  (286,5,'Cardeal da Silva'),
  (287,5,'Carinhanha'),
  (288,5,'Casa Nova'),
  (289,5,'Castro Alves'),
  (290,5,'Catol?ndia'),
  (291,5,'Catu'),
  (292,5,'Caturama'),
  (293,5,'Central'),
  (294,5,'Chorroch?'),
  (295,5,'C?cero Dantas'),
  (296,5,'Cip?'),
  (297,5,'Coaraci'),
  (298,5,'Cocos'),
  (299,5,'Concei??o da Feira'),
  (300,5,'Concei??o do Almeida'),
  (301,5,'Concei??o do Coit'),
  (302,5,'Concei??o do Jacu?pe'),
  (303,5,'Conde'),
  (304,5,'Conde?ba'),
  (305,5,'Contendas do Sincor'),
  (306,5,'Cora??o de Maria'),
  (307,5,'Cordeiros'),
  (308,5,'Coribe'),
  (309,5,'Coronel Jo?o S'),
  (310,5,'Correntina'),
  (311,5,'Cotegipe'),
  (312,5,'Cravol?ndia'),
  (313,5,'Cris?polis'),
  (314,5,'Crist?polis'),
  (315,5,'Cruz das Almas'),
  (316,5,'Cura'),
  (317,5,'D?rio Meira'),
  (318,5,'Dias d`?vila'),
  (319,5,'Dom Bas?lio'),
  (320,5,'Dom Macedo Costa'),
  (321,5,'El?sio Medrado'),
  (322,5,'Encruzilhada'),
  (323,5,'Entre Rios'),
  (324,5,'?rico Cardoso'),
  (325,5,'Esplanada'),
  (326,5,'Euclides da Cunha'),
  (327,5,'Eun?polis'),
  (328,5,'F?tima'),
  (329,5,'Feira da Mata'),
  (330,5,'Feira de Santana'),
  (331,5,'Filad?lfia'),
  (332,5,'Firmino Alves'),
  (333,5,'Floresta Azul'),
  (334,5,'Formosa do Rio Preto'),
  (335,5,'Gandu'),
  (336,5,'Gavi'),
  (337,5,'Gentio do Ouro'),
  (338,5,'Gl?ria'),
  (339,5,'Gongogi'),
  (340,5,'Governador Lomanto J?nior'),
  (341,5,'Governador Mangabeira'),
  (342,5,'Guajeru'),
  (343,5,'Guanambi'),
  (344,5,'Guaratinga'),
  (345,5,'Heli?polis'),
  (346,5,'Ia'),
  (347,5,'Ibiassuc'),
  (348,5,'Ibicara'),
  (349,5,'Ibicoara'),
  (350,5,'Ibicu'),
  (351,5,'Ibipeba'),
  (352,5,'Ibipitanga'),
  (353,5,'Ibiquera'),
  (354,5,'Ibirapitanga'),
  (355,5,'Ibirapu'),
  (356,5,'Ibirataia'),
  (357,5,'Ibitiara'),
  (358,5,'Ibitit'),
  (359,5,'Ibotirama'),
  (360,5,'Ichu'),
  (361,5,'Igapor'),
  (362,5,'Igrapi?na'),
  (363,5,'Igua'),
  (364,5,'Ilh?us'),
  (365,5,'Inhambupe'),
  (366,5,'Ipecaet'),
  (367,5,'Ipia?'),
  (368,5,'Ipir'),
  (369,5,'Ipupiara'),
  (370,5,'Irajuba'),
  (371,5,'Iramaia'),
  (372,5,'Iraquara'),
  (373,5,'Irar'),
  (374,5,'Irec'),
  (375,5,'Itabela'),
  (376,5,'Itaberaba'),
  (377,5,'Itabuna'),
  (378,5,'Itacar'),
  (379,5,'Itaet'),
  (380,5,'Itagi'),
  (381,5,'Itagib'),
  (382,5,'Itagimirim'),
  (383,5,'Itagua?u da Bahia'),
  (384,5,'Itaju do Col?nia'),
  (385,5,'Itaju?pe'),
  (386,5,'Itamaraju'),
  (387,5,'Itamari'),
  (388,5,'Itamb'),
  (389,5,'Itanagra'),
  (390,5,'Itanh'),
  (391,5,'Itaparica'),
  (392,5,'Itap'),
  (393,5,'Itapebi'),
  (394,5,'Itapetinga'),
  (395,5,'Itapicuru'),
  (396,5,'Itapitanga'),
  (397,5,'Itaquara'),
  (398,5,'Itarantim'),
  (399,5,'Itatim'),
  (400,5,'Itiru'),
  (401,5,'Iti?ba'),
  (402,5,'Itoror?'),
  (403,5,'Itua'),
  (404,5,'Ituber'),
  (405,5,'Iui?'),
  (406,5,'Jaborandi'),
  (407,5,'Jacaraci'),
  (408,5,'Jacobina'),
  (409,5,'Jaguaquara'),
  (410,5,'Jaguarari'),
  (411,5,'Jaguaripe'),
  (412,5,'Janda?ra'),
  (413,5,'Jequi'),
  (414,5,'Jeremoabo'),
  (415,5,'Jiquiri'),
  (416,5,'Jita?na'),
  (417,5,'Jo?o Dourado'),
  (418,5,'Juazeiro'),
  (419,5,'Jucuru'),
  (420,5,'Jussara'),
  (421,5,'Jussari'),
  (422,5,'Jussiape'),
  (423,5,'Lafaiete Coutinho'),
  (424,5,'Lagoa Real'),
  (425,5,'Laje'),
  (426,5,'Lajed'),
  (427,5,'Lajedinho'),
  (428,5,'Lajedo do Tabocal'),
  (429,5,'Lamar'),
  (430,5,'Lap'),
  (431,5,'Lauro de Freitas'),
  (432,5,'Len??is'),
  (433,5,'Lic?nio de Almeida'),
  (434,5,'Livramento de Nossa Senhora'),
  (435,5,'Macajuba'),
  (436,5,'Macarani'),
  (437,5,'Maca?bas'),
  (438,5,'Macurur'),
  (439,5,'Madre de Deus'),
  (440,5,'Maetinga'),
  (441,5,'Maiquinique'),
  (442,5,'Mairi'),
  (443,5,'Malhada'),
  (444,5,'Malhada de Pedras'),
  (445,5,'Manoel Vitorino'),
  (446,5,'Mansid'),
  (447,5,'Marac'),
  (448,5,'Maragogipe'),
  (449,5,'Mara?'),
  (450,5,'Marcion?lio Souza'),
  (451,5,'Mascote'),
  (452,5,'Mata de S?o Jo'),
  (453,5,'Matina'),
  (454,5,'Medeiros Neto'),
  (455,5,'Miguel Calmon'),
  (456,5,'Milagres'),
  (457,5,'Mirangaba'),
  (458,5,'Mirante'),
  (459,5,'Monte Santo'),
  (460,5,'Morpar'),
  (461,5,'Morro do Chap'),
  (462,5,'Mortugaba'),
  (463,5,'Mucug'),
  (464,5,'Mucuri'),
  (465,5,'Mulungu do Morro'),
  (466,5,'Mundo Novo'),
  (467,5,'Muniz Ferreira'),
  (468,5,'Muqu?m de S?o Francisco'),
  (469,5,'Muritiba'),
  (470,5,'Mutu?pe'),
  (471,5,'Nazar'),
  (472,5,'Nilo Pe?anha'),
  (473,5,'Nordestina'),
  (474,5,'Nova Cana'),
  (475,5,'Nova F?tima'),
  (476,5,'Nova Ibi'),
  (477,5,'Nova Itarana'),
  (478,5,'Nova Reden?'),
  (479,5,'Nova Soure'),
  (480,5,'Nova Vi?osa'),
  (481,5,'Novo Horizonte'),
  (482,5,'Novo Triunfo'),
  (483,5,'Olindina'),
  (484,5,'Oliveira dos Brejinhos'),
  (485,5,'Ouri?angas'),
  (486,5,'Ourol?ndia'),
  (487,5,'Palmas de Monte Alto'),
  (488,5,'Palmeiras'),
  (489,5,'Paramirim'),
  (490,5,'Paratinga'),
  (491,5,'Paripiranga'),
  (492,5,'Pau Brasil'),
  (493,5,'Paulo Afonso'),
  (494,5,'P? de Serra'),
  (495,5,'Pedr'),
  (496,5,'Pedro Alexandre'),
  (497,5,'Piat'),
  (498,5,'Pil?o Arcado'),
  (499,5,'Pinda'),
  (500,5,'Pindoba'),
  (501,5,'Pintadas'),
  (502,5,'Pira? do Norte'),
  (503,5,'Pirip'),
  (504,5,'Piritiba'),
  (505,5,'Planaltino'),
  (506,5,'Planalto'),
  (507,5,'Po??es'),
  (508,5,'Pojuca'),
  (509,5,'Ponto Novo'),
  (510,5,'Porto Seguro'),
  (511,5,'Potiragu'),
  (512,5,'Prado'),
  (513,5,'Presidente Dutra'),
  (514,5,'Presidente J?nio Quadros'),
  (515,5,'Presidente Tancredo Neves'),
  (516,5,'Queimadas'),
  (517,5,'Quijingue'),
  (518,5,'Quixabeira'),
  (519,5,'Rafael Jambeiro'),
  (520,5,'Remanso'),
  (521,5,'Retirol?ndia'),
  (522,5,'Riach?o das Neves'),
  (523,5,'Riach?o do Jacu?pe'),
  (524,5,'Riacho de Santana'),
  (525,5,'Ribeira do Amparo'),
  (526,5,'Ribeira do Pombal'),
  (527,5,'Ribeir?o do Largo'),
  (528,5,'Rio de Contas'),
  (529,5,'Rio do Ant?nio'),
  (530,5,'Rio do Pires'),
  (531,5,'Rio Real'),
  (532,5,'Rodelas'),
  (533,5,'Ruy Barbosa'),
  (534,5,'Salinas da Margarida'),
  (535,5,'Salvador'),
  (536,5,'Santa B?rbara'),
  (537,5,'Santa Br?gida'),
  (538,5,'Santa Cruz Cabr?lia'),
  (539,5,'Santa Cruz da Vit?ria'),
  (540,5,'Santa In'),
  (541,5,'Santa Luzia'),
  (542,5,'Santa Maria da Vit?ria'),
  (543,5,'Santa Rita de C?ssia'),
  (544,5,'Santa Teresinha'),
  (545,5,'Santaluz'),
  (546,5,'Santana'),
  (547,5,'Santan?polis'),
  (548,5,'Santo Amaro'),
  (549,5,'Santo Ant?nio de Jesus'),
  (550,5,'Santo Est?v'),
  (551,5,'S?o Desid?rio'),
  (552,5,'S?o Domingos'),
  (553,5,'S?o Felipe'),
  (554,5,'S?o F?lix'),
  (555,5,'S?o F?lix do Coribe'),
  (556,5,'S?o Francisco do Conde'),
  (557,5,'S?o Gabriel'),
  (558,5,'S?o Gon?alo dos Campos'),
  (559,5,'S?o Jos? da Vit?ria'),
  (560,5,'S?o Jos? do Jacu?pe'),
  (561,5,'S?o Miguel das Matas'),
  (562,5,'S?o Sebasti?o do Pass'),
  (563,5,'Sapea'),
  (564,5,'S?tiro Dias'),
  (565,5,'Saubara'),
  (566,5,'Sa?de'),
  (567,5,'Seabra'),
  (568,5,'Sebasti?o Laranjeiras'),
  (569,5,'Senhor do Bonfim'),
  (570,5,'Sento S'),
  (571,5,'Serra do Ramalho'),
  (572,5,'Serra Dourada'),
  (573,5,'Serra Preta'),
  (574,5,'Serrinha'),
  (575,5,'Serrol?ndia'),
  (576,5,'Sim?es Filho'),
  (577,5,'S?tio do Mato'),
  (578,5,'S?tio do Quinto'),
  (579,5,'Sobradinho'),
  (580,5,'Souto Soares'),
  (581,5,'Tabocas do Brejo Velho'),
  (582,5,'Tanha'),
  (583,5,'Tanque Novo'),
  (584,5,'Tanquinho'),
  (585,5,'Tapero'),
  (586,5,'Tapiramut'),
  (587,5,'Teixeira de Freitas'),
  (588,5,'Teodoro Sampaio'),
  (589,5,'Teofil?ndia'),
  (590,5,'Teol?ndia'),
  (591,5,'Terra Nova'),
  (592,5,'Tremedal'),
  (593,5,'Tucano'),
  (594,5,'Uau'),
  (595,5,'Uba?ra'),
  (596,5,'Ubaitaba'),
  (597,5,'Ubat'),
  (598,5,'Uiba'),
  (599,5,'Umburanas'),
  (600,5,'Una'),
  (601,5,'Urandi'),
  (602,5,'Uru?uca'),
  (603,5,'Utinga'),
  (604,5,'Valen'),
  (605,5,'Valente'),
  (606,5,'V?rzea da Ro'),
  (607,5,'V?rzea do Po'),
  (608,5,'V?rzea Nova'),
  (609,5,'Varzedo'),
  (610,5,'Vera Cruz'),
  (611,5,'Vereda'),
  (612,5,'Vit?ria da Conquista'),
  (613,5,'Wagner'),
  (614,5,'Wanderley'),
  (615,5,'Wenceslau Guimar?es'),
  (616,5,'Xique-Xique');

COMMIT;

#
# Data for the `categorias` table  (LIMIT 0,500)
#

INSERT INTO `categorias` (`id`, `nome`, `categoria_id`) VALUES 
  (1,'Sapatos',NULL),
  (2,'Sapatos Femininos',1),
  (4,'Sapato Social',1);

COMMIT;

#
# Data for the `marcas` table  (LIMIT 0,500)
#

INSERT INTO `marcas` (`id`, `nome`) VALUES 
  (1,'DELL'),
  (2,'HP'),
  (3,'Sony Vaio');

COMMIT;

#
# Data for the `produtos` table  (LIMIT 0,500)
#

INSERT INTO `produtos` (`id`, `categoria_id`, `marca_id`, `resumo`, `valor`, `peso`, `nome`, `imagem`) VALUES 
  (1,4,1,'teset',1500,'3.000','teste joelson','201012181292697627Koala.jpg');

COMMIT;

#
# Data for the `usuarios` table  (LIMIT 0,500)
#

INSERT INTO `usuarios` (`id`, `login`, `senha`) VALUES 
  (1,'master','eb0a191797624dd3a48fa681d3061212'),
  (4,'ivanhilton','104f8401018900c83150d7ee9d16fd4c'),
  (5,'joelson','202cb962ac59075b964b07152d234b70');

COMMIT;


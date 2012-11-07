-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.27-community-nt


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema loja_curso
--

CREATE DATABASE IF NOT EXISTS loja_curso;
USE loja_curso;

--
-- Definition of table `cadastros_site`
--

DROP TABLE IF EXISTS `cadastros_site`;
CREATE TABLE `cadastros_site` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `municipio_id` int(10) unsigned NOT NULL,
  `nome` varchar(100) NOT NULL,
  `endereco` varchar(255) default NULL,
  `complemento` varchar(255) default NULL,
  `bairro` varchar(100) default NULL,
  `cep` varchar(10) default NULL,
  `telefone` varchar(20) default NULL,
  `celular` varchar(20) default NULL,
  `ativo` tinyint(1) unsigned default '1',
  `email` varchar(200) NOT NULL,
  `login` varchar(255) default NULL,
  `senha` text,
  PRIMARY KEY  (`id`),
  KEY `Index_4` (`municipio_id`),
  CONSTRAINT `FK_cadastros_site_3` FOREIGN KEY (`municipio_id`) REFERENCES `municipios` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cadastros_site`
--

/*!40000 ALTER TABLE `cadastros_site` DISABLE KEYS */;
/*!40000 ALTER TABLE `cadastros_site` ENABLE KEYS */;


--
-- Definition of table `categorias`
--

DROP TABLE IF EXISTS `categorias`;
CREATE TABLE `categorias` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `nome` varchar(50) NOT NULL,
  `categoria_id` int(10) unsigned default NULL,
  PRIMARY KEY  (`id`),
  KEY `Index_2` (`categoria_id`),
  CONSTRAINT `FK_categoriasprodutos_1` FOREIGN KEY (`categoria_id`) REFERENCES `categorias` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `categorias`
--

/*!40000 ALTER TABLE `categorias` DISABLE KEYS */;
INSERT INTO `categorias` (`id`,`nome`,`categoria_id`) VALUES 
 (1,'Sapatos',NULL),
 (2,'Sapatos Femininos',1),
 (4,'Sapato Social',1);
/*!40000 ALTER TABLE `categorias` ENABLE KEYS */;


--
-- Definition of table `estados`
--

DROP TABLE IF EXISTS `estados`;
CREATE TABLE `estados` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `nome` varchar(255) NOT NULL,
  `sigla` char(3) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `estados`
--

/*!40000 ALTER TABLE `estados` DISABLE KEYS */;
INSERT INTO `estados` (`id`,`nome`,`sigla`) VALUES 
 (1,'Acre','AC'),
 (2,'Alagoas','AL'),
 (3,'Amapá','AP'),
 (4,'Amazonas','AM'),
 (5,'Bahia','BA'),
 (6,'Ceará','CE'),
 (7,'Distrito Federal','DF'),
 (8,'Espírito Santo','ES'),
 (9,'Goiás','GO'),
 (10,'Maranhão','MA'),
 (11,'Mato Grosso','MT'),
 (12,'Mato Grosso do Sul','MS'),
 (13,'Minas Gerais','MG'),
 (14,'Pará','PA'),
 (15,'Paraíba','PB'),
 (16,'Paraná','PR'),
 (17,'Pernambuco','PE'),
 (18,'Piauí','PI'),
 (19,'Rio de Janeiro','RJ'),
 (20,'Rio Grande do Norte','RN'),
 (21,'Rio Grande do Sul','RS'),
 (22,'Rondônia','RO'),
 (23,'Roraima','RR'),
 (24,'Santa Catarina','SC'),
 (25,'São Paulo','SP'),
 (26,'Sergipe','SE'),
 (27,'Tocantins','TO');
/*!40000 ALTER TABLE `estados` ENABLE KEYS */;


--
-- Definition of table `marcas`
--

DROP TABLE IF EXISTS `marcas`;
CREATE TABLE `marcas` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `nome` varchar(255) NOT NULL,
  PRIMARY KEY  (`id`),
  UNIQUE KEY `nome` (`nome`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `marcas`
--

/*!40000 ALTER TABLE `marcas` DISABLE KEYS */;
INSERT INTO `marcas` (`id`,`nome`) VALUES 
 (1,'DELL'),
 (2,'HP'),
 (3,'Sony Vaio');
/*!40000 ALTER TABLE `marcas` ENABLE KEYS */;


--
-- Definition of table `municipios`
--

DROP TABLE IF EXISTS `municipios`;
CREATE TABLE `municipios` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `estado_id` int(10) unsigned NOT NULL,
  `nome` varchar(255) NOT NULL,
  PRIMARY KEY  (`id`),
  KEY `municipios_ibfk_1` (`estado_id`),
  CONSTRAINT `municipios_ibfk_1` FOREIGN KEY (`estado_id`) REFERENCES `estados` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `municipios`
--

/*!40000 ALTER TABLE `municipios` DISABLE KEYS */;
INSERT INTO `municipios` (`id`,`estado_id`,`nome`) VALUES 
 (202,5,'Abaíra'),
 (203,5,'Abaré'),
 (204,5,'Acajutiba'),
 (205,5,'Adustina'),
 (206,5,'Água Fria'),
 (207,5,'Aiquara'),
 (208,5,'Alagoinhas'),
 (209,5,'Alcobaça'),
 (210,5,'Almadina'),
 (211,5,'Amargosa'),
 (212,5,'Amélia Rodrigues'),
 (213,5,'América Dourada'),
 (214,5,'Anagé'),
 (215,5,'Andaraí'),
 (216,5,'Andorinha'),
 (217,5,'Angical'),
 (218,5,'Anguera'),
 (219,5,'Antas'),
 (220,5,'Antônio Cardoso'),
 (221,5,'Antônio Gonçalves'),
 (222,5,'Aporá'),
 (223,5,'Apuarema'),
 (224,5,'Araças'),
 (225,5,'Aracatu'),
 (226,5,'Araci'),
 (227,5,'Aramari'),
 (228,5,'Arataca'),
 (229,5,'Aratuípe'),
 (230,5,'Aurelino Leal'),
 (231,5,'Baianópolis'),
 (232,5,'Baixa Grande'),
 (233,5,'Banzaê'),
 (234,5,'Barra'),
 (235,5,'Barra da Estiva'),
 (236,5,'Barra do Choça'),
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
 (251,5,'Botuporã'),
 (252,5,'Brejões'),
 (253,5,'Brejolândia'),
 (254,5,'Brotas de Macaúbas'),
 (255,5,'Brumado'),
 (256,5,'Buerarema'),
 (257,5,'Buritirama'),
 (258,5,'Caatiba'),
 (259,5,'Cabaceiras do Paraguaçu'),
 (260,5,'Cachoeira'),
 (261,5,'Caculé'),
 (262,5,'Caém'),
 (263,5,'Caetanos'),
 (264,5,'Caetité'),
 (265,5,'Cafarnaum'),
 (266,5,'Cairu'),
 (267,5,'Caldeirão Grande'),
 (268,5,'Camacan'),
 (269,5,'Camaçari'),
 (270,5,'Camamu'),
 (271,5,'Campo Alegre de Lourdes'),
 (272,5,'Campo Formoso'),
 (273,5,'Canápolis'),
 (274,5,'Canarana'),
 (275,5,'Canavieiras'),
 (276,5,'Candeal'),
 (277,5,'Candeias'),
 (278,5,'Candiba'),
 (279,5,'Cândido Sales'),
 (280,5,'Cansanção'),
 (281,5,'Canudos'),
 (282,5,'Capela do Alto Alegre'),
 (283,5,'Capim Grosso'),
 (284,5,'Caraíbas'),
 (285,5,'Caravelas'),
 (286,5,'Cardeal da Silva'),
 (287,5,'Carinhanha'),
 (288,5,'Casa Nova'),
 (289,5,'Castro Alves'),
 (290,5,'Catolândia'),
 (291,5,'Catu'),
 (292,5,'Caturama'),
 (293,5,'Central'),
 (294,5,'Chorrochó'),
 (295,5,'Cícero Dantas'),
 (296,5,'Cipó'),
 (297,5,'Coaraci'),
 (298,5,'Cocos'),
 (299,5,'Conceição da Feira'),
 (300,5,'Conceição do Almeida'),
 (301,5,'Conceição do Coité'),
 (302,5,'Conceição do Jacuípe'),
 (303,5,'Conde'),
 (304,5,'Condeúba'),
 (305,5,'Contendas do Sincorá'),
 (306,5,'Coração de Maria'),
 (307,5,'Cordeiros'),
 (308,5,'Coribe'),
 (309,5,'Coronel João Sá'),
 (310,5,'Correntina'),
 (311,5,'Cotegipe'),
 (312,5,'Cravolândia'),
 (313,5,'Crisópolis'),
 (314,5,'Cristópolis'),
 (315,5,'Cruz das Almas'),
 (316,5,'Curaçá'),
 (317,5,'Dário Meira'),
 (318,5,'Dias d`Ávila'),
 (319,5,'Dom Basílio'),
 (320,5,'Dom Macedo Costa'),
 (321,5,'Elísio Medrado'),
 (322,5,'Encruzilhada'),
 (323,5,'Entre Rios'),
 (324,5,'Érico Cardoso'),
 (325,5,'Esplanada'),
 (326,5,'Euclides da Cunha'),
 (327,5,'Eunápolis'),
 (328,5,'Fátima'),
 (329,5,'Feira da Mata'),
 (330,5,'Feira de Santana'),
 (331,5,'Filadélfia'),
 (332,5,'Firmino Alves'),
 (333,5,'Floresta Azul'),
 (334,5,'Formosa do Rio Preto'),
 (335,5,'Gandu'),
 (336,5,'Gavião'),
 (337,5,'Gentio do Ouro'),
 (338,5,'Glória'),
 (339,5,'Gongogi'),
 (340,5,'Governador Lomanto Júnior'),
 (341,5,'Governador Mangabeira'),
 (342,5,'Guajeru'),
 (343,5,'Guanambi'),
 (344,5,'Guaratinga'),
 (345,5,'Heliópolis'),
 (346,5,'Iaçu'),
 (347,5,'Ibiassucê'),
 (348,5,'Ibicaraí'),
 (349,5,'Ibicoara'),
 (350,5,'Ibicuí'),
 (351,5,'Ibipeba'),
 (352,5,'Ibipitanga'),
 (353,5,'Ibiquera'),
 (354,5,'Ibirapitanga'),
 (355,5,'Ibirapuã'),
 (356,5,'Ibirataia'),
 (357,5,'Ibitiara'),
 (358,5,'Ibititá'),
 (359,5,'Ibotirama'),
 (360,5,'Ichu'),
 (361,5,'Igaporã'),
 (362,5,'Igrapiúna'),
 (363,5,'Iguaí'),
 (364,5,'Ilhéus'),
 (365,5,'Inhambupe'),
 (366,5,'Ipecaetá'),
 (367,5,'Ipiaú'),
 (368,5,'Ipirá'),
 (369,5,'Ipupiara'),
 (370,5,'Irajuba'),
 (371,5,'Iramaia'),
 (372,5,'Iraquara'),
 (373,5,'Irará'),
 (374,5,'Irecê'),
 (375,5,'Itabela'),
 (376,5,'Itaberaba'),
 (377,5,'Itabuna'),
 (378,5,'Itacaré'),
 (379,5,'Itaeté'),
 (380,5,'Itagi'),
 (381,5,'Itagibá'),
 (382,5,'Itagimirim'),
 (383,5,'Itaguaçu da Bahia'),
 (384,5,'Itaju do Colônia'),
 (385,5,'Itajuípe'),
 (386,5,'Itamaraju'),
 (387,5,'Itamari'),
 (388,5,'Itambé'),
 (389,5,'Itanagra'),
 (390,5,'Itanhém'),
 (391,5,'Itaparica'),
 (392,5,'Itapé'),
 (393,5,'Itapebi'),
 (394,5,'Itapetinga'),
 (395,5,'Itapicuru'),
 (396,5,'Itapitanga'),
 (397,5,'Itaquara'),
 (398,5,'Itarantim'),
 (399,5,'Itatim'),
 (400,5,'Itiruçu'),
 (401,5,'Itiúba'),
 (402,5,'Itororó'),
 (403,5,'Ituaçu'),
 (404,5,'Ituberá'),
 (405,5,'Iuiú'),
 (406,5,'Jaborandi'),
 (407,5,'Jacaraci'),
 (408,5,'Jacobina'),
 (409,5,'Jaguaquara'),
 (410,5,'Jaguarari'),
 (411,5,'Jaguaripe'),
 (412,5,'Jandaíra'),
 (413,5,'Jequié'),
 (414,5,'Jeremoabo'),
 (415,5,'Jiquiriçá'),
 (416,5,'Jitaúna'),
 (417,5,'João Dourado'),
 (418,5,'Juazeiro'),
 (419,5,'Jucuruçu'),
 (420,5,'Jussara'),
 (421,5,'Jussari'),
 (422,5,'Jussiape'),
 (423,5,'Lafaiete Coutinho'),
 (424,5,'Lagoa Real'),
 (425,5,'Laje'),
 (426,5,'Lajedão'),
 (427,5,'Lajedinho'),
 (428,5,'Lajedo do Tabocal'),
 (429,5,'Lamarão'),
 (430,5,'Lapão'),
 (431,5,'Lauro de Freitas'),
 (432,5,'Lençóis'),
 (433,5,'Licínio de Almeida'),
 (434,5,'Livramento de Nossa Senhora'),
 (435,5,'Macajuba'),
 (436,5,'Macarani'),
 (437,5,'Macaúbas'),
 (438,5,'Macururé'),
 (439,5,'Madre de Deus'),
 (440,5,'Maetinga'),
 (441,5,'Maiquinique'),
 (442,5,'Mairi'),
 (443,5,'Malhada'),
 (444,5,'Malhada de Pedras'),
 (445,5,'Manoel Vitorino'),
 (446,5,'Mansidão'),
 (447,5,'Maracás'),
 (448,5,'Maragogipe'),
 (449,5,'Maraú'),
 (450,5,'Marcionílio Souza'),
 (451,5,'Mascote'),
 (452,5,'Mata de São João'),
 (453,5,'Matina'),
 (454,5,'Medeiros Neto'),
 (455,5,'Miguel Calmon'),
 (456,5,'Milagres'),
 (457,5,'Mirangaba'),
 (458,5,'Mirante'),
 (459,5,'Monte Santo'),
 (460,5,'Morpará'),
 (461,5,'Morro do Chapéu'),
 (462,5,'Mortugaba'),
 (463,5,'Mucugê'),
 (464,5,'Mucuri'),
 (465,5,'Mulungu do Morro'),
 (466,5,'Mundo Novo'),
 (467,5,'Muniz Ferreira'),
 (468,5,'Muquém de São Francisco'),
 (469,5,'Muritiba'),
 (470,5,'Mutuípe'),
 (471,5,'Nazaré'),
 (472,5,'Nilo Peçanha'),
 (473,5,'Nordestina'),
 (474,5,'Nova Canaã'),
 (475,5,'Nova Fátima'),
 (476,5,'Nova Ibiá'),
 (477,5,'Nova Itarana'),
 (478,5,'Nova Redenção'),
 (479,5,'Nova Soure'),
 (480,5,'Nova Viçosa'),
 (481,5,'Novo Horizonte'),
 (482,5,'Novo Triunfo'),
 (483,5,'Olindina'),
 (484,5,'Oliveira dos Brejinhos'),
 (485,5,'Ouriçangas'),
 (486,5,'Ourolândia'),
 (487,5,'Palmas de Monte Alto'),
 (488,5,'Palmeiras'),
 (489,5,'Paramirim'),
 (490,5,'Paratinga'),
 (491,5,'Paripiranga'),
 (492,5,'Pau Brasil'),
 (493,5,'Paulo Afonso'),
 (494,5,'Pé de Serra'),
 (495,5,'Pedrão'),
 (496,5,'Pedro Alexandre'),
 (497,5,'Piatã'),
 (498,5,'Pilão Arcado'),
 (499,5,'Pindaí'),
 (500,5,'Pindobaçu'),
 (501,5,'Pintadas'),
 (502,5,'Piraí do Norte'),
 (503,5,'Piripá'),
 (504,5,'Piritiba'),
 (505,5,'Planaltino'),
 (506,5,'Planalto'),
 (507,5,'Poções'),
 (508,5,'Pojuca'),
 (509,5,'Ponto Novo'),
 (510,5,'Porto Seguro'),
 (511,5,'Potiraguá'),
 (512,5,'Prado'),
 (513,5,'Presidente Dutra'),
 (514,5,'Presidente Jânio Quadros'),
 (515,5,'Presidente Tancredo Neves'),
 (516,5,'Queimadas'),
 (517,5,'Quijingue'),
 (518,5,'Quixabeira'),
 (519,5,'Rafael Jambeiro'),
 (520,5,'Remanso'),
 (521,5,'Retirolândia'),
 (522,5,'Riachão das Neves'),
 (523,5,'Riachão do Jacuípe'),
 (524,5,'Riacho de Santana'),
 (525,5,'Ribeira do Amparo'),
 (526,5,'Ribeira do Pombal'),
 (527,5,'Ribeirão do Largo'),
 (528,5,'Rio de Contas'),
 (529,5,'Rio do Antônio'),
 (530,5,'Rio do Pires'),
 (531,5,'Rio Real'),
 (532,5,'Rodelas'),
 (533,5,'Ruy Barbosa'),
 (534,5,'Salinas da Margarida'),
 (535,5,'Salvador'),
 (536,5,'Santa Bárbara'),
 (537,5,'Santa Brígida'),
 (538,5,'Santa Cruz Cabrália'),
 (539,5,'Santa Cruz da Vitória'),
 (540,5,'Santa Inês'),
 (541,5,'Santa Luzia'),
 (542,5,'Santa Maria da Vitória'),
 (543,5,'Santa Rita de Cássia'),
 (544,5,'Santa Teresinha'),
 (545,5,'Santaluz'),
 (546,5,'Santana'),
 (547,5,'Santanópolis'),
 (548,5,'Santo Amaro'),
 (549,5,'Santo Antônio de Jesus'),
 (550,5,'Santo Estêvão'),
 (551,5,'São Desidério'),
 (552,5,'São Domingos'),
 (553,5,'São Felipe'),
 (554,5,'São Félix'),
 (555,5,'São Félix do Coribe'),
 (556,5,'São Francisco do Conde'),
 (557,5,'São Gabriel'),
 (558,5,'São Gonçalo dos Campos'),
 (559,5,'São José da Vitória'),
 (560,5,'São José do Jacuípe'),
 (561,5,'São Miguel das Matas'),
 (562,5,'São Sebastião do Passé'),
 (563,5,'Sapeaçu'),
 (564,5,'Sátiro Dias'),
 (565,5,'Saubara'),
 (566,5,'Saúde'),
 (567,5,'Seabra'),
 (568,5,'Sebastião Laranjeiras'),
 (569,5,'Senhor do Bonfim'),
 (570,5,'Sento Sé'),
 (571,5,'Serra do Ramalho'),
 (572,5,'Serra Dourada'),
 (573,5,'Serra Preta'),
 (574,5,'Serrinha'),
 (575,5,'Serrolândia'),
 (576,5,'Simões Filho'),
 (577,5,'Sítio do Mato'),
 (578,5,'Sítio do Quinto'),
 (579,5,'Sobradinho'),
 (580,5,'Souto Soares'),
 (581,5,'Tabocas do Brejo Velho'),
 (582,5,'Tanhaçu'),
 (583,5,'Tanque Novo'),
 (584,5,'Tanquinho'),
 (585,5,'Taperoá'),
 (586,5,'Tapiramutá'),
 (587,5,'Teixeira de Freitas'),
 (588,5,'Teodoro Sampaio'),
 (589,5,'Teofilândia'),
 (590,5,'Teolândia'),
 (591,5,'Terra Nova'),
 (592,5,'Tremedal'),
 (593,5,'Tucano'),
 (594,5,'Uauá'),
 (595,5,'Ubaíra'),
 (596,5,'Ubaitaba'),
 (597,5,'Ubatã'),
 (598,5,'Uibaí'),
 (599,5,'Umburanas'),
 (600,5,'Una'),
 (601,5,'Urandi'),
 (602,5,'Uruçuca'),
 (603,5,'Utinga'),
 (604,5,'Valença'),
 (605,5,'Valente'),
 (606,5,'Várzea da Roça'),
 (607,5,'Várzea do Poço'),
 (608,5,'Várzea Nova'),
 (609,5,'Varzedo'),
 (610,5,'Vera Cruz'),
 (611,5,'Vereda'),
 (612,5,'Vitória da Conquista'),
 (613,5,'Wagner'),
 (614,5,'Wanderley'),
 (615,5,'Wenceslau Guimarães'),
 (616,5,'Xique-Xique');
/*!40000 ALTER TABLE `municipios` ENABLE KEYS */;


--
-- Definition of table `pedidos`
--

DROP TABLE IF EXISTS `pedidos`;
CREATE TABLE `pedidos` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `cadastro_id` int(10) unsigned default NULL,
  `valor_frete` float default NULL,
  `numero_pedido` varchar(20) default NULL,
  PRIMARY KEY  (`id`),
  UNIQUE KEY `numeroPedido` (`numero_pedido`),
  KEY `cadastro_id` (`cadastro_id`),
  CONSTRAINT `FK_vendas_1` FOREIGN KEY (`cadastro_id`) REFERENCES `cadastros_site` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pedidos`
--

/*!40000 ALTER TABLE `pedidos` DISABLE KEYS */;
/*!40000 ALTER TABLE `pedidos` ENABLE KEYS */;


--
-- Definition of table `pedidos_itens`
--

DROP TABLE IF EXISTS `pedidos_itens`;
CREATE TABLE `pedidos_itens` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `pedido_id` int(10) unsigned NOT NULL,
  `produto_id` int(10) unsigned NOT NULL,
  `valor_unitario` float NOT NULL,
  `quantidade` int(10) unsigned NOT NULL,
  PRIMARY KEY  (`id`),
  KEY `Index_2` (`pedido_id`),
  KEY `Index_3` (`produto_id`),
  CONSTRAINT `FK_pedidosItens_2` FOREIGN KEY (`produto_id`) REFERENCES `produtos` (`id`),
  CONSTRAINT `FK_pedidositens_3` FOREIGN KEY (`pedido_id`) REFERENCES `pedidos` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pedidos_itens`
--

/*!40000 ALTER TABLE `pedidos_itens` DISABLE KEYS */;
/*!40000 ALTER TABLE `pedidos_itens` ENABLE KEYS */;


--
-- Definition of table `produtos`
--

DROP TABLE IF EXISTS `produtos`;
CREATE TABLE `produtos` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `categoria_id` int(10) unsigned NOT NULL,
  `marca_id` int(10) unsigned default NULL,
  `resumo` text NOT NULL,
  `valor` decimal(10,2) default NULL,
  `peso` varchar(20) default NULL,
  `nome` varchar(50) NOT NULL,
  `imagem` varchar(50) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `produtos`
--

/*!40000 ALTER TABLE `produtos` DISABLE KEYS */;
INSERT INTO `produtos` (`id`,`categoria_id`,`marca_id`,`resumo`,`valor`,`peso`,`nome`,`imagem`) VALUES 
 (1,4,1,'teset','1500.00','3.000','teste joelson','201012181292697627Koala.jpg');
/*!40000 ALTER TABLE `produtos` ENABLE KEYS */;


--
-- Definition of table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
CREATE TABLE `usuarios` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `login` varchar(50) NOT NULL,
  `senha` varchar(50) NOT NULL,
  PRIMARY KEY  (`id`),
  UNIQUE KEY `Index_4` USING BTREE (`login`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `usuarios`
--

/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` (`id`,`login`,`senha`) VALUES 
 (1,'master','eb0a191797624dd3a48fa681d3061212'),
 (4,'ivanhilton','81dc9bdb52d04dc20036dbd8313ed055'),
 (5,'joelson','202cb962ac59075b964b07152d234b70');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;

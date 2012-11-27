
#
# Structure for the `estado` table : 
#

CREATE TABLE `estado` (
  `est_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `est_nome` varchar(30) NOT NULL,
  `est_sigla` char(2) NOT NULL,
  PRIMARY KEY (`est_id`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=latin1;

#
# Structure for the `cidade` table : 
#

CREATE TABLE `cidade` (
  `cid_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `est_id` int(10) unsigned NOT NULL,
  `cid_nome` varchar(50) NOT NULL,
  PRIMARY KEY (`cid_id`),
  KEY `cidade_FKIndex1` (`est_id`),
  CONSTRAINT `cidade_ibfk_1` FOREIGN KEY (`est_id`) REFERENCES `estado` (`est_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=5501 DEFAULT CHARSET=latin1;

#
# Structure for the `usuario` table : 
#

CREATE TABLE `usuario` (
  `usu_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `cid_id` int(10) unsigned NOT NULL,
  `usu_nome` varchar(50) NOT NULL,
  `usu_email` varchar(50) NOT NULL,
  `usu_ativo` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`usu_id`),
  KEY `usuario_FKIndex1` (`cid_id`),
  CONSTRAINT `usuario_ibfk_1` FOREIGN KEY (`cid_id`) REFERENCES `cidade` (`cid_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;


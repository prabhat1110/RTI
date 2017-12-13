CREATE TABLE `source` (
  `source_id` int(11) NOT NULL AUTO_INCREMENT,
  `created_by` varchar(255) NOT NULL,
  `created_date` datetime NOT NULL,
  `last_modified_by` varchar(255) DEFAULT NULL,
  `last_modified_date` datetime DEFAULT NULL,
  `source` varchar(255) NOT NULL,
  PRIMARY KEY (`source_id`),
  UNIQUE KEY `UK_mnrbnpys7wv3634m67lekq4da` (`source`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
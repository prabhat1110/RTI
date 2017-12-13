CREATE TABLE `portal_type` (
  `portal_type_id` int(11) NOT NULL,
  `created_by` varchar(255) NOT NULL,
  `created_date` datetime NOT NULL,
  `last_modified_by` varchar(255) DEFAULT NULL,
  `last_modified_date` datetime DEFAULT NULL,
  `portal_type` varchar(255) NOT NULL,
  PRIMARY KEY (`portal_type_id`),
  UNIQUE KEY `UK_26va5oh0e0yv59nx78jfqbttx` (`portal_type`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `request_type` (
  `req_type_id` int(11) NOT NULL,
  `created_by` varchar(255) NOT NULL,
  `created_date` datetime NOT NULL,
  `last_modified_by` varchar(255) DEFAULT NULL,
  `last_modified_date` datetime DEFAULT NULL,
  `req_type` varchar(255) NOT NULL,
  `portal_type_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`req_type_id`),
  UNIQUE KEY `UK_5gc0vvm5i0ekyjmds4i09mwu0` (`req_type`),
  KEY `FK9lq3o7fqat9x5m0gdy8jmia3c` (`portal_type_id`),
  CONSTRAINT `FK9lq3o7fqat9x5m0gdy8jmia3c` FOREIGN KEY (`portal_type_id`) REFERENCES `portal_type` (`portal_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
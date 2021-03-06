CREATE TABLE `inbound_sync` (
  `inbound_sync_id` int(11) NOT NULL AUTO_INCREMENT,
  `created_by` varchar(255) NOT NULL,
  `created_date` datetime NOT NULL,
  `last_modified_by` varchar(255) DEFAULT NULL,
  `last_modified_date` datetime DEFAULT NULL,
  `req_by_id` varchar(255) NOT NULL,
  `req_id` varchar(255) DEFAULT NULL,
  `req_payload` longtext NOT NULL,
  `customer_info_id` int(11) DEFAULT NULL,
  `req_type_id` int(11) DEFAULT NULL,
  `source_sys_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`inbound_sync_id`),
  KEY `FKhk8u71acpfgw5olc4plfnp3y7` (`customer_info_id`),
  KEY `FKcxpxqiih80byu8o6d2gob5bu2` (`req_type_id`),
  KEY `FKr59t3dljgtu2cdfinixle38q2` (`source_sys_id`),
  CONSTRAINT `FKcxpxqiih80byu8o6d2gob5bu2` FOREIGN KEY (`req_type_id`) REFERENCES `request_type` (`req_type_id`),
  CONSTRAINT `FKhk8u71acpfgw5olc4plfnp3y7` FOREIGN KEY (`customer_info_id`) REFERENCES `customer_info` (`customer_info_id`),
  CONSTRAINT `FKr59t3dljgtu2cdfinixle38q2` FOREIGN KEY (`source_sys_id`) REFERENCES `source` (`source_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
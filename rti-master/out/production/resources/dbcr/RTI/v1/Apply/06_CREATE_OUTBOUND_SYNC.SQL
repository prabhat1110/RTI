CREATE TABLE `outbound_sync` (
  `outbound_sync_id` int(11) NOT NULL AUTO_INCREMENT,
  `created_by` varchar(255) NOT NULL,
  `created_date` datetime NOT NULL,
  `last_modified_by` varchar(255) DEFAULT NULL,
  `last_modified_date` datetime DEFAULT NULL,
  `res_message` longtext NOT NULL,
  `res_payload` longtext NOT NULL,
  `res_status` varchar(255) NOT NULL,
  `customer_info_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`outbound_sync_id`),
  KEY `FKkqagxxsn9gd0fw2ts36w952o6` (`customer_info_id`),
  CONSTRAINT `FKkqagxxsn9gd0fw2ts36w952o6` FOREIGN KEY (`customer_info_id`) REFERENCES `customer_info` (`customer_info_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
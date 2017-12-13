CREATE TABLE `customer_info` (
  `customer_info_id` int(11) NOT NULL,
  `api_key` varchar(255) NOT NULL,
  `created_by` varchar(255) NOT NULL,
  `created_date` datetime NOT NULL,
  `customer_code` int(11) NOT NULL,
  `encryption_key` varchar(255) NOT NULL,
  `last_modified_by` varchar(255) DEFAULT NULL,
  `last_modified_date` datetime DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `outbound_base_url` varchar(255) NOT NULL,
  `outbound_key` varchar(255) NOT NULL,
  `signature_key` varchar(255) NOT NULL,
  PRIMARY KEY (`customer_info_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
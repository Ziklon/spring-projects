DROP TABLE IF EXISTS `tb_cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_cliente` (
  `CLIENTE_ID` int(11) NOT NULL,
  `NOMBRES` varchar(50) DEFAULT NULL,
  `ZONA_ID` int(11) NOT NULL,
  `DIRECCION` varchar(50) DEFAULT NULL,
  `NUMERO_DOC` varchar(11) DEFAULT NULL,
  `TIPO` tinyint(4) DEFAULT NULL,
  `TELEFONO` varchar(11) DEFAULT NULL,
  PRIMARY KEY (`CLIENTE_ID`),
  KEY `fk_tb_cliente_tb_zona1_idx` (`ZONA_ID`),
  CONSTRAINT `fk_tb_cliente_tb_zona1` FOREIGN KEY (`ZONA_ID`) REFERENCES `tb_zona` (`ZONA_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tb_empleado`
--

DROP TABLE IF EXISTS `tb_empleado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_empleado` (
  `EMPLEADO_ID` int(11) NOT NULL ,
  `ROL_ID` int(11) NOT NULL,
  `NOMBRES` varchar(50) DEFAULT NULL,
  `CORREO` varchar(50) DEFAULT NULL,
  `APELLIDOS` varchar(50) DEFAULT NULL,
  `USUARIO` varchar(50) DEFAULT NULL,
  `CLAVE` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`EMPLEADO_ID`),
  UNIQUE KEY `USUARIO_UNIQUE` (`USUARIO`),
  KEY `fk_tb_empleado_tb_rol1_idx` (`ROL_ID`),
  CONSTRAINT `fk_tb_empleado_tb_rol1` FOREIGN KEY (`ROL_ID`) REFERENCES `tb_rol` (`ROL_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tb_empresa`
--

DROP TABLE IF EXISTS `tb_empresa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_empresa` (
  `EMPRESA_ID` int(11) NOT NULL ,
  `DESCRIPCION` varchar(50) DEFAULT NULL,
  `SEDE_ID` int(11) NOT NULL,
  PRIMARY KEY (`EMPRESA_ID`),
  KEY `fk_tb_empresa_tb_sede_idx` (`SEDE_ID`),
  CONSTRAINT `fk_tb_empresa_tb_sede` FOREIGN KEY (`SEDE_ID`) REFERENCES `tb_sede` (`SEDE_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tb_empresa_empleado`
--

DROP TABLE IF EXISTS `tb_empresa_empleado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_empresa_empleado` (
  `EMPLEADO_ID` int(11) NOT NULL,
  `EMPRESA_ID` int(11) NOT NULL,
  PRIMARY KEY (`EMPLEADO_ID`,`EMPRESA_ID`),
  KEY `fk_tb_empleado_has_tb_empresa_tb_empresa1_idx` (`EMPRESA_ID`),
  KEY `fk_tb_empleado_has_tb_empresa_tb_empleado1_idx` (`EMPLEADO_ID`),
  CONSTRAINT `fk_tb_empleado_has_tb_empresa_tb_empleado1` FOREIGN KEY (`EMPLEADO_ID`) REFERENCES `tb_empleado` (`EMPLEADO_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_tb_empleado_has_tb_empresa_tb_empresa1` FOREIGN KEY (`EMPRESA_ID`) REFERENCES `tb_empresa` (`EMPRESA_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tb_producto`
--

DROP TABLE IF EXISTS `tb_producto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_producto` (
  `PRODUCTO_ID` int(11) NOT NULL ,
  PRIMARY KEY (`PRODUCTO_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tb_rol`
--

DROP TABLE IF EXISTS `tb_rol`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_rol` (
  `ROL_ID` int(11) NOT NULL ,
  `DESCRIPCION` varchar(50) NOT NULL,
  PRIMARY KEY (`ROL_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tb_sede`
--

DROP TABLE IF EXISTS `tb_sede`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_sede` (
  `SEDE_ID` int(11) NOT NULL,
  `DESCRIPCION` varchar(50) DEFAULT NULL,
  `DIRECCION` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`SEDE_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=1005 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tb_tipo_zona`
--

DROP TABLE IF EXISTS `tb_tipo_zona`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_tipo_zona` (
  `TIPO_ZONA_ID` int(11) NOT NULL,
  `DESCRIPCION` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`TIPO_ZONA_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tb_zona`
--

DROP TABLE IF EXISTS `tb_zona`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_zona` (
  `ZONA_ID` int(11) NOT NULL ,
  `DESCRIPCION` varchar(50) DEFAULT NULL,
  `TIPO_ZONA_ID` int(11) NOT NULL,
  `ZONA_PADRE` int(11) DEFAULT NULL,
  PRIMARY KEY (`ZONA_ID`),
  KEY `fk_tb_zona_tb_tipo_zona1_idx` (`TIPO_ZONA_ID`),
  KEY `fk_tb_zona_tb_zona1_idx` (`ZONA_PADRE`),
  CONSTRAINT `fk_tb_zona_tb_tipo_zona1` FOREIGN KEY (`TIPO_ZONA_ID`) REFERENCES `tb_tipo_zona` (`TIPO_ZONA_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_tb_zona_tb_zona1` FOREIGN KEY (`ZONA_PADRE`) REFERENCES `tb_zona` (`ZONA_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;